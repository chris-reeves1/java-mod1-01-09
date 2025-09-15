package QDbs;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String URL = "jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1";
    private static final String USER = "user"; 
    private static final String PASS = "";
public static void main(String[] args) throws Exception {
    try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
        seed(conn);
        long id = findCustomerByName(conn, "Alice");
            System.out.println("Before: " + selectById(conn, id));
            updateCity(conn, id, "Berlin");
            System.out.println("After : " + selectById(conn, id));
            System.out.println("Count before: " + count(conn));
            deleteById(conn, id);
            System.out.println("Count after : " + count(conn));
            batchInsert(conn, 10);
            System.out.println("Rows: " + count(conn));
        
            boolean old = conn.getAutoCommit();
            conn.setAutoCommit(false);
            try {
                insertCustomer(conn, "transaction1", "rome");
                insertCustomer(conn, "transaction2", "rome");
                try (PreparedStatement ps = conn.prepareStatement("INSERT INTO customers(name, city) VALUES(?, ?)")){
                    ps.setString(1, null);
                    ps.setString(2, "rome");
                    ps.executeUpdate();
                } conn.commit(); // doesnt commit. 
            } catch (SQLException e) {System.err.println("ROLLBACK" + e.getMessage());
            conn.rollback();}
            finally {conn.setAutoCommit(old);}
            System.out.println(count(conn));
        }
    }



static List<Customer> selectByCity(Connection conn, String city) throws SQLException {
        String sql = "SELECT id, name, city FROM customers WHERE city = ? ORDER BY id";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, city);
            try (ResultSet rs = ps.executeQuery()) {
                List<Customer> out = new ArrayList<>();
                while (rs.next()) out.add(mapRow(rs));
                return out;
            }
        }
    }

    // minimal helpers
    static void seed(Connection conn) throws SQLException {
        createTable(conn);
        insertCustomer(conn, "chris", "london");
        insertCustomer(conn, "koto", "tokyo");
        insertCustomer(conn, "jose", "madrid");
    }
    static void createTable(Connection conn) throws SQLException {
        try (Statement st = conn.createStatement()) {
            st.execute("""
                CREATE TABLE IF NOT EXISTS customers(
                  id BIGINT PRIMARY KEY AUTO_INCREMENT,
                  name VARCHAR(100) NOT NULL,
                  city VARCHAR(100) NOT NULL
                )
            """);
        }
    }
    static long insertCustomer(Connection conn, String name, String city) throws SQLException {
        try (PreparedStatement ps = conn.prepareStatement("INSERT INTO customers(name, city) VALUES(?, ?)", Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, name); ps.setString(2, city); ps.executeUpdate();
            try (ResultSet keys = ps.getGeneratedKeys()) { if (keys.next()) return keys.getLong(1); }
        }
        throw new SQLException("No key");
    }
    static Customer mapRow(ResultSet rs) throws SQLException {
        return new Customer(rs.getLong("id"), rs.getString("name"), rs.getString("city"));
    }
    static class Customer { final long id; final String name; final String city;
        Customer(long id,String name,String city){this.id=id;this.name=name;this.city=city;}
        public String toString(){return "Customer{id=%d, name='%s', city='%s'}".formatted(id,name,city);}
    }
     static String selectById(Connection conn, long id) throws SQLException {
        try (PreparedStatement ps = conn.prepareStatement("SELECT id,name,city FROM customers WHERE id=?")) {
            ps.setLong(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next() ? "Customer{id=%d, name='%s', city='%s'}"
                        .formatted(rs.getLong(1), rs.getString(2), rs.getString(3))
                        : null;
            }
        }
}
    static int updateCity(Connection conn, long id, String newCity) throws SQLException {
        try (PreparedStatement ps = conn.prepareStatement("UPDATE customers SET city=? WHERE id=?")) {
            ps.setString(1, newCity);
            ps.setLong(2, id);
            return ps.executeUpdate();
        }
    }
    static long findCustomerByName(Connection conn, String name) throws SQLException {
    String sql = "SELECT id FROM customers WHERE name = ?";
    try (PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, name);
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                return rs.getLong("id");
            }
        }
    }
    throw new SQLException("Customer with name " + name + " not found.");
}
     static int deleteById(Connection conn, long id) throws SQLException {
        try (PreparedStatement ps = conn.prepareStatement("DELETE FROM customers WHERE id=?")) {
            ps.setLong(1, id);
            return ps.executeUpdate();
        }
    }
    static long count(Connection conn) throws SQLException {
        try (PreparedStatement ps = conn.prepareStatement("SELECT COUNT(*) FROM customers");
             ResultSet rs = ps.executeQuery()) { rs.next(); return rs.getLong(1); }
    }
    static void batchInsert(Connection conn, int n) throws SQLException {
        String sql = "INSERT INTO customers(name, city) VALUES(?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            for (int i = 1; i <= n; i++) {
                ps.setString(1, "Name" + i);
                ps.setString(2, (i % 2 == 0) ? "london" : "Paris");
                ps.addBatch();
            }
            // each element corresponds to the number of rows affected by each individual 
            // statement within the batch
            int[] res = ps.executeBatch();
            System.out.println("Inserted " + res.length + " rows in batch.");
        }
    }
}


/*
 * JDBC:
 *      - Standards and specifications, how to connect from java to the db. 
 *      - Public API for developers.
 *      - Part of the JDK package. Made up of various classes - like driverManager.
 *      - DriverManager: sub-protocol definition + options. 
 *      
 *  h2: 
 *      - Convenience: h2 can be used in memory (optimized) (good for testing/protoyping)
 *      - Speed
 *      - Easy - teardown.
 * 
 *  h2 and mysql differences:
 *      - syntax - slight differences.
 *      - Data type problems - timestamps/datatimes etc
 *      - Features - less on h2. 
 * 
 *  metadata example: 
 *          DatabaseMetaData meta = conn.getMetaData();
            System.out.println(meta.getDatabaseProductName());
            System.out.println(meta.getDriverName());
            System.out.println(meta.getDatabaseProductVersion());
            System.out.println(meta.getURL());
 *  
 *  
 * 
 * 
 * 
 * 
 * 
 */
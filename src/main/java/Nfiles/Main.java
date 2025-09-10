package Nfiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.google.gson.Gson;


public class Main {
    public static void main(String[] args) throws Exception{

        Path path = Path.of("final.json");
        FileJsonHelper.writeJson(path, new Person("a", 1));

        //System.out.println(new File("example.txt").getAbsolutePath());

        // FileReader fileReader = new FileReader("example.txt");
        // BufferedReader bufferedReader = new BufferedReader(fileReader); //decorator. 

        // String line;
        // while ((line  = bufferedReader.readLine()) != null){
        //     System.out.println(line);
        // }
        // bufferedReader.close();

        // // write
        // FileWriter fileWriter = new FileWriter("output.txt");
        // BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        // bufferedWriter.write("hello this on line 1");
        // bufferedWriter.newLine();
        // bufferedWriter.write("now on line 2");

        // // bufferedWriter.close();

        // // NIO

        //     // Path filepath = Paths.get("example.txt");

        //     // for (String line : Files.readAllLines(filepath)){
        //     //     System.out.println(line);
        //     // }

        //     // Files.write(Paths.get("example.txt"), "string text".getBytes());

        //     // Path p = Path.of("example.txt");
        //     // Files.writeString(p, "a new line -- here!!");
        //     // String all = Files.readString(p, StandardCharsets.UTF_8);
        //     // System.out.println(all);

        //     // Json 
        //     Person person = new Person("c", 30);

        //     // make gson object (should only be 1)
        //     Gson gson = new Gson();

        //     // # serialization jav - json
        //     String json = gson.toJson(person);
        //     System.out.println(json);
        //     // write to the file
        //     Path out = Path.of("obj.json");
        //     Files.writeString(out, json);
        //     // Read from file
        //     String load = Files.readString(out);
        //     // deserealize - make obj 
        //     Person p1 = gson.fromJson(load, Person.class);
        //     System.out.println(p1.getName() + " " + p1.getAge());

    }
}


class Person{
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;  
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}


/*
 * file reader and buffered reader
 * FileReader:
 *  - reads char by char. slow - but can read directly from the disk. 
 * Buffered Reader: 
 *  - lower the amount i/o ops. Doesnt/cant access files/disk. 
 *  - Methods to read/write etc. 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
package Genums;

public class Main {
public static void main(String[] args) {

    StringBuilder sb = new StringBuilder("hello");
    sb.append(" world");
    sb.insert(5, ",");
    sb.replace(0, 5, "hi");
    sb.reverse();
    System.out.println(sb.toString());
    
}
}


/*
 * Enums:
 *  - A data type that defines a set of constants.
 *  - Always implicitly public, static, and final. 
 *  
 *  why:
 *      - type safety - only valid values can be used. 
 *      - built in methods available - value/valueof
 *    
 *  limitations:
 *      - Extends java.lang so cant extend other classes.
 *      - Heavyweight construct. 
 *      - If going to change often - use a db/config file.
 *      - C# does not support methods. 
 * 
 * 
 * 
 * public enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

 * 
 * Day today = Day.FRIDAY;
    System.out.println("Today is: " + today);

    for (Day day : Day.values()){
        System.out.println(day);
    }

    Day day = Day.valueOf("MONDAY");
    System.out.println(day);

    switch(today){
        case MONDAY -> System.out.println("start of the week");
        case FRIDAY -> System.out.println("End of the week");
        default -> System.out.println("not mon or fri");
    }



    Directions example:

    package Genums;

public enum Directions {
    NORTH("North"), EAST("East"), SOUTH("South"), WEST("West"); //this is used as the natural ordering. 


private final String label;

Directions(String label){
    this.label = label;
}

@Override
public String toString(){
    return label;
}
}

  Directions d = Directions.NORTH;

    System.out.println(d.name()); // NORTH

    System.out.println(d == Directions.NORTH); // True
    System.out.println(d.equals(Directions.SOUTH)); // False

    for (Directions y : Directions.values()){
        System.out.println(y.name() + y.ordinal());
    }
    
    System.out.println(Directions.NORTH); //"North"
    System.err.println(Directions.NORTH.name()); // NORTH
}
}



package Genums;

public enum Currency {
    GBP("£"), USD("$"), EUR("€");


private final String symbol;

Currency(String symbol){
    this.symbol = symbol;
}

public String symbol(){
    return symbol;
}

public String format(double amount){
    return symbol + String.format("%.2f",amount);
}

}


for ( Currency c : Currency.values()){
        System.out.println(c.name() + ": " + c.symbol());
    }

    System.out.println(Currency.USD.format(10));
    System.out.println(Currency.EUR.format(10.5));
    System.out.println(Currency.GBP.format(10.552255));


    STRINGS:
        - Commonly used data type.
        - Immutable (any operation creates a new string object)
        - Why?  - system optimizations. (Stretch goal - research this!!)
        - Why not primitive? - Complexity, flexibility.

        String methods:
            - comparisson methods:
                - ==, equals, compareto,
            - Transformational methods:
                - trim(), toUpperCase()
            - Search methods:
                - indexOf, contains()
            - substings:
                substr()
            - splits/joins
            

    String Builder:
        - avoid inefficiancy of creating new strings.
        - StringBuilder is a mutable class - allows string manipukation.

       basic methods: 
        - append()
        - insert()
        - delete()
        - replace()
        - reverse()

 */

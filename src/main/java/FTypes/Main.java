package FTypes;

public class Main {
public static void main(String[] args) {

        // Person person = new Person("c", 10);
        // Person person1 = new Person("c");
        // Person person2 = new Person();
    Person child = Person.createChild("c");
  
    // obj creation
    // Person person = new Person();
    // person.setAge(-1);
    // person.setName("c");

    // // call a method
    // person.introduce();


    // int a = 5;
    // int b = 5;

    // System.out.println(a == b);

    // Person person1 = new Person();
    // Person person2 = person1;
    // // person2 = new Person();
    // System.out.println(person1 == person2); // true same reference

    // Person person3 = new Person();
    // System.out.println(person3 == person2); // false - different refs. 

    // //default
    // System.out.println(person1.equals(person2)); // true
    // System.out.println(person3.equals(person2)); // false

    // String str1 = new String("Hello");
    // String str2 = new String("Hello");

    // System.out.println(str1.equals(str2)); // true - content the same 
}    
}

// class Person{
//     // fields (attributes that make up the state of our custom objs)
//     private int age;
//     private String name;

//     // methods
//     public void introduce(){
//         System.out.println("name is " + name + " age is " + age);
//     }

//     public int getAge() {
//         return age;
//     }

//     public void setAge(int age) {
//         if (age > 0){ //validation
//         this.age = age;}
// //     }

// //     public String getName() {
// //         return name;
// //     }

// //     public void setName(String name) {
// //         this.name = name;
// //     }
// // }

// class Person{
//     String name;
//     int age;

//     public Person(int age) {
//         this.age = age;
//     }

//     // No-argument constructor
//     public Person(){
//         this.name = "unkonwn";
//         this.age = 0;
//     }

//     // paramaterized constructor
//     public Person(String name, int age){
//         this.name = name;
//         this.age = age;
//     }

//     // single-param constructor
//         public Person(String name){
//             this.name = name;
//             this.age = 18; // default value
//         }


// }

class Person{
    private String name;
    private int age;

    private Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    // factory method:
    public static Person createChild(String name){
        return new Person(name, 10);
    }


}


/*
 *  - 2 types:
 *      primitives
 *      references
 *  
 *          - differences: type of data they hold + actions
 * 
 *  - When we make classes - we extend the language + make custom objs. 
 * 
 *  simple example: 
 *      // obj creation
    Person person = new Person();
    
    // modify the fields
    person.age = 10;
    person.name = "c";

    // call a method
    person.introduce();

}    
}

class Person{
    // fields (attributes that make up the state of our custom objs)
    int age;
    String name;

    // methods
    public void introduce(){
        System.out.println("name is " + name + " age is " + age);
    }
}



 * 
 *  immutability/mutability
 *      - immutable types cant be changed once created: strings.
 *      - custom types are mutable. 
 * 
 *      eg String name = "j";
 *          j = j.toUpperCase(); // creates a new object. 
 * 
 *      best practices:
 *          - Encapsulation: private fields, public getters/setters.
 *          - avoid magic numbers - initialise meaningful values. 
 *          - meaningful state names. (attributes)
 * 
 *  == and equals().
 * 
 *  - primitives == checks the actual values.
 * 
 *  - reference types == checks if they point to the same obj. 
 *  
 *  int a = 5;
    int b = 5;

    System.out.println(a == b);

    Person person1 = new Person();
    Person person2 = person1;
    System.out.println(person1 == person2); // true same reference

    Person person3 = new Person();
    System.out.println(person3 == person2); // false - different refs. 
 * 
 * By default equals() does the same thing as ==. reference equality.
 * 
 * //default
    System.out.println(person1.equals(person2)); // true
    System.out.println(person3.equals(person2)); // false

    // overridden behaviour
    String str1 = new String("Hello");
    String str2 = new String("Hello");
 * 
 * 
 * Encapsulation: 
 *  -   Restricting access to methods/state of a class.
 *  -   Protect internal state. 
 *  -   Control data access through modifiers.
 *  -   Modularity and maitainability
 * 
 * key features:
 *  - private fields
 *  - public getters/setters
 * 
 *  Abstraction:
 *      - Hide implementation details. 
 *      - Reduce complexity
 *      
 *      implemntation:
 *          - Abstract base classes.
 *          - Interfaces: contracts of behaviour. 
 * 
 *      
 *  Composition:
 *      - inheritance - problems with coupling and with type mismatches. 
 *      - encapsulated behaviour. 
 *      - flexibility, objects can be replaced at runtime.
 *      - reusing code. 
 * 
 *          class Engine{
    public void start(){
        System.out.println("engine starting...");
    }
}

class Car{
    private Engine engine;

    //constructor
    public Car(Engine engine){
        this.engine = engine;
    }

    public void startcar(){
        engine.start(); // delegating behaviour to the engine obj. 
        System.out.println("Car starting...");
    }

}
 * Engine engine = new Engine();
    Car car = new Car(engine);
    car.startcar();
 * 
 * 
 * 
 *  Constructor: 
 *      - Default constructor called in absence of defined one.
 *      - controls what values we initialise with. 
 *      
 *  - Same name as the class. - no return type - NOT EVEN A VOID!. 
 *  
 *  Best practice:  
 *              - Should initialize all fields.
 *              - Use chaining (inheritance)
 *              - Valid inputs (avoid states that are invalid)
 *              - Avoid default constructor.
 *              - Think about factory methods.  
 * 
 *  Factory method:
 *      - decouple object creation from the class logic.
 *      - flexibility - conditional logic.
 *      - maintainability
 * 
 *   - advanatges:
 *          - encapsulation.
 *          - flexibility of initialsation.
 *          - Readability
 *          - Testability 
 * 
 *   - diasdvantages
 *          - Overhead
 *          - debugging 
 *          - complexity 
 * 
 * 
 * STATIC FIELDS
-------------

A static field is a variable declared with the static keyword. 
It is shared among all instances of the class.

Example: 

    public class Counter {
        public static int count = 0; // Static field

        public Counter() {
            count++; // Increment the static field
        }
    }

Static fields are typically used for:
- Shared State:
	Fields that represent shared data across all instances of the class.
- Constants:
	Fields that remain constant and are the same for all instances.

Static fields can be accessed:
- Directly via the Class Name:
    This is the recommended approach when no specific instance is needed.
- Through an Instance:
	This is allowed but discouraged.

Example:

    public class Main {
        public static void main(String[] args) {
            // Accessing static field directly via class name
            System.out.println(Counter.count); // Output: 0

            // Creating objects and modifying the static field
            new Counter();
            new Counter();
            System.out.println(Counter.count); // Output: 2

            // Accessing static field via an instance (allowed but not recommended)
            Counter counter = new Counter();
            System.out.println(counter.count); // Output: 3
        }
    }

Characteristics of Static Fields:
- Memory Allocation:
	Static fields are stored in the method area of memory (stack).
- Initialization:
	Static fields are initialized when the class is loaded, before any
    objects are created.
- Shared State:
	All instances of the class share the same static field. 
    Modifying it through one instance affects all others.

Static Constants:

Static fields are often used for defining constants. 
To ensure immutability, they are declared as final.

Example:

    public class MathConstants {
        public static final double PI = 3.14159; // Static constant
    }

    System.out.println(MathConstants.PI); // Accessing directly via class name
 * 
 * 
 * What Is this:
- this refers to the current instance of the class where it is used.
- Available in all non-static methods and constructors.
- Differentiates between class fields and constructor parameters.
- Method chaining and constructor chaining.

 */

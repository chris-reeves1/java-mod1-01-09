package Linterfaces;

import java.io.Serial;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    
    List<Person> person = new ArrayList<>();
    person.add(new Person(3, "C"));
    person.add(new Person(1, "A"));
    person.add(new Person(2, "B"));
    

    Collections.sort(person);
    for (Person x : person){
        System.out.println(x.getID() + " " +x.getName());
    }
}
} 

class Person implements Comparable<Person>{
    private int id;
    private String name;

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return id;
    }

    @Override
    public int compareTo(Person other){
        return Integer.compare(this.id, other.id);
    }
}




/*
 * 
 * Interfaces:
 *  - Helps to have more abstraction and contracts that classes need to implemeent. 
 *  - Define shared behaiour that any class can adopt, regardless of where it 
 *      is in a class hierarchy. 
 * 
 *      abstract/any superClass: "is-a" relationship. 
 *      Composition: "Uses" relationship.
 *      interface: "can-do" relationship. 
 * 
 *  - Why use interfaces:
 *      - abstraction.
 *      - Multiple inheritance behaviour. 
 *      - Decouples code - easy to modify witout affecting dependncies. 
 * 
 * - Basic design:
 *      - Declare empty methods (ie abstracts.)
 *      - default methods - (has a body), static methods.
 *      - holds CONSTANTS - implicitly public, static and final constatnts.
 * 
 *          eg:
 *              interface MathConstants {
 *              double PI = 3.14......
 *      }
 * 
 * Implementation:
 *  - implements keyword.
 *  - Class must provide concrete implementations for the abstracts.
 *  - choose what to do with the defaults (dont need ot be implemented).
 *  - seperation principle: many small interfaces over few large ones. 
 * 
 *  examples:
 * 
 *  Dog dog = new Dog();
    dog.eat();
    dog.sleep();
}
}
class Airplane implements Flyable{
    @Override
    public void fly(){
        System.out.println("flying...");
    }
}

class Drone implements Flyable, Operable{
    @Override
    public void operate() {
    }

    @Override
    public void fly() {
    }
    
}
// without overriding the defaults
class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("eating...");
    }

}
// with overriing the defaults
class Cat implements Animal {

    @Override
    public void eat() {
        System.out.println(" cat eating...");
    }

    @Override
    public void sleep(){
        System.out.println("cat sleeps...");
    }
}
 * 
 * Multiple interfaces:
 *  - If a class implements multiple interfaces with the same
 *      default methods the class must explicitly choose which one. 
 *  - If superclass exists its method would auotmatically take presendence. 
 *  eg:
 * 
    *      @Override
        public void show(){
            A.super.show();
        }

        public static void main(String[] args) {
            Main mainObj = new Main();
            mainObj.show();
        }
}

 Naming convention:
    - the name should convey the behaviours.
    - Use adjectives or verbs
    - This convention improves readability.
    - put an 'I' before the name. iFylable, iOperaable...  



    dependancy injection:
    - decouple implemetnation form design . 
    eg: 
        public static void main(String[] args) {
        Logger logger = new ConsoleLogger();
        App app = new App(logger);
        app.run(); 

        }
    }

    class ConsoleLogger implements Logger{
        @Override
        public void log(String message){
            System.out.println("[LOG] - " + message);
        }
    }
    class App {
        private final Logger logger;

        public App(Logger logger){
            this.logger = logger;
        }

        public void run(){
            logger.log("application is running");
        }
    }

public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(new CreditCardPayment());
        cart.checkout(200);
    }
}

class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount){
        System.out.println("paid  " + amount + " with credit card.");
    }
}

class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(int amount){
        System.out.println("paid  " + amount + " with Paypal.");
    }
}

class ShoppingCart {
    private PaymentStrategy strategy;

    public ShoppingCart(PaymentStrategy strategy){
        this.strategy = strategy;
    }

    public void checkout(int amount){
        strategy.pay(amount);
    }
}

--- markers ---

-- an interface with no methods
-- Acts as a flag for a class.
-- metadata!

    public interface searchable{} // no methods
    class IsSearchable implements searchable{}
    class NotSearchable{}

    for (item isinstanceof searchable){
        searchalgirthm....}



 functional interfaces:
  - An interface that has one abstarct method (SAM)
  - Any number number of concretes.
  - annotation: @functionalInterface
  - implement with lambdas. 


  Operation add = (a, b) -> a + b;
        Operation multiply = (a, b) -> a * b;

        System.err.println(add.apply(2, 3));
        System.err.println(multiply.apply(2, 3));


    Generics:
        So if we introduce genrics, implementation can only be against 
        certain types.

        - type saftey
        - Resusability, flexibility. 


        syntax:
            public interface Conatainer<T> {
            void add{T item}
            T gettr()
            }


    eg: 

     IntegerContainer ic = new IntegerContainer();
        ic.add(10);
        System.out.println(ic.get());

        // generic container String
        GenericContainer<String> stringContainer = new GenericContainer<>();
        stringContainer.add("hlellko");
        System.out.println(stringContainer.get());
     }
}

class IntegerContainer implements Container<Integer>{
    private int item;

    public void add(Integer item){
        this.item = item;
    }
    @Override
    public Integer get(){
        return item;
    }

}

class GenericContainer<T> implements Container<T> {
    private T item;

    @Override
    public void add(T item){
        this.item = item;
    }

    @Override
    public T get(){
        return item;
    }
}
 

Built-in interfaces:
    100's of built-in interfaces - just learn a few core ones!

    Comparable:
        - class implements - objects can be compared and define their order. 
        - small to largest.
        - usuful for sorting. 

    



 */

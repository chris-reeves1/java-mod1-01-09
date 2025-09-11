package OLambdasStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
public static void main(String[] args) {

   List<Customer> customers = Arrays.asList(
                new Customer("chris", "london"),
                new Customer("Bev", "Tokyo"),
                new Customer("george", "Rome")
   );

   customers.stream()
            .filter((c) -> c.getCity().equals("london"))
            .map(Customer::getName)
            .forEach(System.out::println);

    Optional<Customer> first = customers.stream()
                                .filter((c) -> c.getCity().equals("london"))
                                .findFirst();

    first.ifPresent((c) -> System.out.println(c.getName()));



   



}}
class Customer {
    final String name;
    final String city;

    Customer(String n, String c){
        name= n;
        city = c;
    }
    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
    }
}
/*
 * Lambdas
 * - Must implement a functional interface - (SAM). 
 * - Intersection type:
 *      - ISP - make interfaces as small as possible 
 *          + all implementers should implements all of it methods.
 *      - results in lots of 1 method interfaces.
 *          <T extends interface1 & interface2> readWrite(){
 *              file.read()
 *              file.write()}
 * 
 * - A block of code - acts mostly as an object.
 * 
 * - Under the hood:
 *      - Gets compiled down into bytecode - exists here as a private static method.
 *      - lamda$main$0()...
 *      - invokedDynamic() - links to the lambda at runtime.
 *      - lambdametafactory() - creates a class to implement the lambda. 
 * 
 *  - Allows behaviour to be expressed in-line. 
 *  - Works well with streams. 
 *  
 * basic examples:
    *  public class Main {
    public static void main(String[] args) {
        // Inner class
        // Implements Runnable and overide run()
        // Block with override of the abstract makes this an inner/anon class. 
        Runnable innerClass = new Runnable() {
            @Override public void run(){
                System.out.println("Inner class way!!");
            }
        };

        // lambda example
        // implements the only abstract. 
        Runnable lambdaWay = () -> System.out.println("From the lambda way!!");
        innerClass.run();
        // Treat as anb obj
        lambdaWay.run();

        // the lambda here is a chunk of behaviour.
        // pass it as arg to a method
        // here, the lmabda represents the param 'r'.
        runTwice(() -> System.out.println("Running passed behaviour"));
        runTwice(lambdaWay);


        
    }

    private static void runTwice(Runnable r){r.run(); r.run();}

    // wrapper method, is the extra readability worth it? 
    // Abstract should be implied via the behaviour. 
    public static Runnable runRunnable(){return () -> System.out.println("From the lambda way!!");}

    }
 * 
 *    // basic syntax
    // (parameters) -> expression
    // Unary in maths means 1 in and 1 out. 
    // primitive f-interfaces - applyasint is the abstract. 
    IntUnaryOperator square = (x) -> x * x;
    // treat square as an object:
    System.out.println(square.applyAsInt(123));

    // (params) -> {expreesion; return;}
    IntBinaryOperator add = (a, b) -> {int x = a + b; return x;};
    System.out.println(add.applyAsInt(10, 15129));

    // Returns a boolean
    Predicate<String> isShortWord = (s) -> {return s.length() <= 5;}; 
    // and() + or()
    System.out.println(isShortWord.test("null")); // true
    System.out.println(isShortWord.test("nullable")); // false

    // method reference - shorthand "::"
    Consumer<String> print_ = System.out::println;
    // consumer interface is used to do sideeffect actions
    // ie it does not return anything itself. 
    print_.accept("will this print?");

    // Capturing a local variable - must be final or effectively final.
    // i.e: doesnt change anywhere in the flow
    String a = "[LOG] - ";
    Consumer<String> logger = (s) -> System.out.println(a + s);
    logger.accept("Crashed!!");  
    // a = "new_value"; -- wont complie! Dont do this!!
}
}
 * Type inference
 *  - you can explicitly reference type but rarely needed.
 *  - uses if:
 *          - to be very clear
 *          - Use for overloaded methods
 *          - Comlpex generics - compile cant infer type. 
 * 
 * 
 * // Passing behaviour into methods
    // Sorting with comparator
    // Sort is from List - its concrete method but takes behaviour as an arg.
    // List<String> names = new ArrayList<>(Arrays.asList("chris", "adam", "bev"));
    // names.sort((a, b) -> a.compareTo(b)); // natural 
    // System.out.println(names);
   
    // names.sort((a, b) -> b.compareTo(a)); // reverse
    // System.out.println(names);


    // foreach
    List<String> names = new ArrayList<>(Arrays.asList("chris", "adam", "bev"));
    names.forEach((s) -> System.out.println(s)); // lambda
    names.forEach(System.out::println); // using method reference
    for (String a : names){
        System.out.println(a);
    }


    // removeIf
    List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
    nums.removeIf((n) -> n % 2 == 0);
    System.out.println(nums);
}
}
 * 
 * // Streams
    List<String> words = Arrays.asList("one", "two", "three");
    words.forEach(System.out::println);

    List<String> upper = words.stream()
        .map(String::toUpperCase)
        .toList();

    System.out.println(upper);
 * 
 * method refs:
 *  - (s) -> Systemt.out.println(s)); 
 * 
 *  ways of writing:
 *          - ClassName::staticmethoid Math:abs
 *          - object::InstanceMethod 
 *          - ClassNAme:instanceMethod (unbound) String:tolowercase
 * 
 * 
public class Main {
public static void main(String[] args) {
    
    // filtering with predicate
    List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

    // hard-coding the behaviour - could be anything!
    nums.stream()
        .filter((n) -> n % 2 != 0)
        .forEach(System.out::println);

    Predicate<Integer> isGreaterThan3 = (n) -> n > 3;
    nums.stream()
        .filter(isGreaterThan3)
        .forEach(System.out::println);


    STREAMS!!!
    ----------
    ----------

    - Traditional loops are imperative. Descirbes stpe by step what we want 
        them to do.
    - Streams are declarative, describe what to do, 
        not the order - java handles implemntation. 
    - Streams are perfect for pipelines. transform - filter - terminate. 
        - data processing pipeline.

    
 simple example:
 List<String> names = Arrays.asList("Chris", "Bev", "George");

    // old way (imperative)
    for (String n : names){
        if (n.length() > 3){
            System.out.println(n.toUpperCase());
        }
    }
    
    names.stream()
        .filter((n) -> n.length() > 3)
        .map(String::toUpperCase)
        .forEach(System.out::println);



what is a stream:
    - sequenece of elements passed through a stream from a data source.
    - (collections, io, arrays, generators)
    - Doesnt store any data itself - works on the underlying source.
    - SIngle use - cant be reused. 


    List<String> words = Arrays.asList("Cat", "dog", "rabbit");

    Stream<String> s = words.stream();

    s.forEach(System.out::println);
    // s.forEach(System.out::println); single-use - already been consumed!!!!


Stream lifecycle + stages
    - SOURCE:
        - collecions - list.stream()
        - arrays - arrays.stream(arr)
        - files - Files.lines(Path)
    
        INTERMEDIATE STEPS:
            - filter, map, sorted, limit

        Terminal operation ending the stream/evaluating:
            - foeach, count, reduce


            List<String> names = Arrays.asList("Chris", "Bev", "George");

    long count = names.stream()
                .filter((n) -> n.length() > 3) // intermediate stage
                .map(String::toUpperCase) // intermediate stage
                .count(); // terminal operation

System.out.println(count);

 // List<String> names = Arrays.asList("Chris", "Bev", "George");

    // filtering
    // selection
    List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
    nums.stream()
        .filter((n) -> n % 2 == 0)
        .forEach(System.out::println);

    // Mapping example
    // Transforming
    List<String> names = Arrays.asList("Chris", "Bev", "George");
    names.stream()
        .map(String::length)
        .forEach(System.out::println);

    // reducing 
    // return a sinlg element.
    List<Integer> nums1 = Arrays.asList(1, 2, 3, 4, 5, 6);
    int sum = nums1.stream()
            .reduce(0, (a, b) -> a + b);
    System.out.println(sum);

    // collecting
    // Gathering results in a collection
    List<String> upper = names.stream()
                        .map(String::toUpperCase)
                        .toList();
    System.out.println(upper);

}}
 */
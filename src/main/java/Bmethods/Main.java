package Bmethods;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);

    // System.out.println("enter your name: ");
    // String name = scanner.nextLine(); // reads a whole line.
    // System.out.println(name);
    
    // System.out.println("enter your age: ");
    // int age = scanner.nextInt();
    // System.out.println(age);

    // System.out.println("enter a score");
    // double score = scanner.nextDouble();
    // System.out.println(score);
    
    // scanner.nextLine(); // consumes the newline char \n

    // System.out.println("enter a string");
    // String n = scanner.nextLine();

    // System.out.println("hello " + name + "age is " + age + "string given was " + n);
    
    // scanner.close();
    // Scanner scanner = new Scanner(System.in);
    // System.out.println("enter your age: ");
    // int age = Integer.parseInt(scanner.nextLine().trim());
    // System.out.println(age);

    // System.out.println("enter a string");
    // String n = scanner.nextLine();
    // System.out.println(n);
    // scanner.close();

    // System.out.printf("integer:  %d%n String: %s%nFloat:%.2f", 10, "hello", 10.5);

    // String name = "chris";
    // int age = 10;
    // double x = 10.5;
    // String l = String.format("%s%n%d%n%.2f", name, age, x);
    // System.out.println(l);


}
}



/*
 *   Methods:
 *          A block of code - does a task/ returns a value.
 *          Has to be inside a class.
 *          
 *  signature:
 *          visability, name, params, return types.
 *          access_modifiers:
 *              - public: accessible from any other class. 
 *              - protected: accesible from the package, sub-classes. 
 *              - private: Class only. 
 *              - empty(default): package-protected - package only. 
 * 
 *          return_types:
 *              - Void(no return type)
 *              - type(int,String,obj)
 * 
 *          params:
 *              - can be none -- void greet(){}
 *              - Can single -- void greet(int age){}
 *              - Multiple void greet(int age, String name){}
 * 
 *          obj creation:
 *              
 *              Obj obj = new Obj(); 
 * 
 *                  public static void main(String[] args) {
    // Main m = new Main();
    // add(1, 2);
}

// public void add(int a, int b){
//     System.out.println(a + b);
// }
// public static int add(int a, int b){
//     return a + b;

}
 * 
 *          Overloading:
 *              - multiple methods with the same name. 
 *              - must have different params:
 *              - order of params
 *              - number of params
 *              - type of params
 * 
 *          eg:
 *          Main m = new Main();
    m.greet();
}
public void greet(String name){
        System.out.println("hello " + name);
}
public void greet(){
    System.out.println("chris");
}
 * 
 * // printf and .format
 * 
 *  
 * 
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
 
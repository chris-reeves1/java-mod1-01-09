package Aintro;

public class Main {
    public static void main(String[] args) {
        
        
        //int x = 10; // primitive type - stored directly in stack memory. 
        //String name = "chris"; // reference type references an object, stored in heap memory.
                                // reference stored in stack memory.  


        //int a = 5;
        //int b = a; // copy of the value. 
        //b = 10;
        //System.out.println(a);
        //System.out.println(b);

        // ref - multiple refs to the same object

        // int[] arr = {1, 2, 3};
        // int[] ref = arr;
        // ref[0] = 100;
        // System.out.println(arr[0]);
        // System.out.println(ref[0]);

        // incrementation

        // ++  and -- 

        // int i = 5;
        // int result = ++i;
        // System.out.println(i);
        // System.out.println(result);

        // int i = 5;
        // int result = i++;
        // System.out.println(i);
        // System.out.println(result);
    
        // for (int i = 0; i < 5; ++i){
        //     System.out.println(i);
        // }

        // int num = 100;
        // long l = num;

        // double d = 10.5;
        // int num = (int) d;
        // System.out.println(num); // truncated to 10

        // Parsing
        // String intString = "123";
        // int number = Integer.parseInt(intString);
        // System.out.println(number);

        // String doubleString = "45.45";
        // double d = Double.parseDouble(doubleString);
        // System.out.println(d);

        // String booleanString = "true";
        // boolean b = Boolean.parseBoolean(booleanString);
        // System.out.println(b);
    }
}

/*
 * Originally called Oak 1991. 
 * 
 * - jdk - developer kit
 * - jre - runtime env. 
 * - javac compile down to .class files - JVM runs the byte code. 
 * 
 * - Main method: public static void main(String[] args)
 *  - Entrypoint for our application
 *      - public:  - available outside of the class, the JVM needs it to be public.
 *      - static: - No instance required to call the method.
 *      - void: Doesnt return a value. 
 *      - main - just a name. 
 *      - args - pass through objects at run time. 
 *     
 *  - Naming convention:
 *      -  Always start with a letter.
 *      -  Dont use reserved words
 *      -  classes: PascalCase
 *      -  Methods/variables: camelCase
 *      -  snake_case optionally.  
 * 
 *  - variables:
 *         - declare type when making a var.
 *         - initialse with a value. 
 *         - primitives
 *         - reference
 * 
 *  primitives - mathmatical functions, incrmenting, casting, parsing. 
 * 
 *  Increments:
 *  pre -  ++i   : increments i before the value is read.  
 *  post - i++   : i is read first then incrmented.  
 * 
 *  Casting primitives: 
 *      implicit casting (widening):
 *              byte - short - int - long - float - double
 *      explicit casting (narrowing):
 *              larger to smaller - can lead to data/accuracy loss. (truncated)
 * 
 *  Parsing. String to primitives.  
*/      
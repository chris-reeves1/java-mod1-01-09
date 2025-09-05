package Iexceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
public static void main(String[] args){
   
    // try {
    //     int[] numbers = {1, 2, 3};
    //     int result = 10/0; // zero error
    //     System.out.println(numbers[5]); // outofbounds error
    // } catch (ArithmeticException e) {
    //     System.out.println("caught exception: " + e.getMessage());
    // } catch (ArrayIndexOutOfBoundsException e) {
    //     System.out.println("[ERROR] - " + e.getMessage());
    // }
    // catch (Exception e) {
    //     System.out.println("caught general error:  " + e.getMessage());
    // } 
    AgeValidator validator = new AgeValidator();
    try {
        validator.validateAge(16); // throws the exception
    } catch (InvalidAgeException e) {
        System.out.println(e.getMessage());
    }

}
}

class InvalidAgeException extends Exception {
    // constructor
    public InvalidAgeException(String message){
            super(message);
    }
}

class AgeValidator{
    public void validateAge(int age) throws InvalidAgeException{
        if (age < 18){
            throw new InvalidAgeException("Age must be 18 or over");
        }
    System.out.println("age passed validation");
    }
}

/*
 * Exeptions:
 *  - Mechanism to handle run time errors. 
 *  - allows normal flow to continue. 
 *  - Try-catch-finally block, throw and throws. 
 *  - Try-with
 * 
 *  - Types of exception:
 *      - Checked exceptions:
 *          - Must be dealt with before we compile - either throw/throws
 *            or try-catch block. 
 * 
 *          Examples:
 *              - ioexceptions
 *              - sqlException
 * 
 *      - unchecked exceptions:
 *          - Occur at runtime anbd not caught by the compiler.
 *              
 *          Examples:
 *              - MathsException*-not real name*
 *              - ArrayIndexOutOfBoundsException
 * 
 * 
 *      - Errors:
 *          - represents problems we cant handle in code (outofmemeoryerrors)
 * 
 *  Keywrods:
 *  - try - the block of code that may raise an error. 
 *  - catch - Consume the error here.
 *  - finally - for clean-up code + log to file/cloud
 * 
 *  - throw: Explicitly throw an exception.
 *  - throws: Declarae the exception we can throw. 
 * 
 *      syntax:     
 *          try {
 *              code that may throw an exception
 *          } catch (ExcptionType1 e) {
 *              optionally handle the exception. 
 *          } catch (ExceptionType2 e) {
 *              optionally handle the exception. 
 *          } finally {
 *              close resources, logs/print 
 *          }
 * 
 * // checked example
    try {
        FileReader file = new FileReader("nonexistantfile.txt");
    } catch (FileNotFoundException e) {
        System.out.println("file not found:  " + e.getMessage());
    }   finally {
        System.out.println("logging....");
    }
 * 
 * // unchecked example
        try {
            int result = 10 / 0;            
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero  " + e.getMessage());
        }
 * 
 * 
 * // throws example
     
    try {
        validateAge(18);
    } catch (IllegalArgumentException e){
        System.out.println("eception was caught! - " + e.getMessage());
    }

    

}
public static void validateAge(int age) throws IllegalArgumentException{
    if (age < 18) {
        throw new IllegalArgumentException("age must be over 18");
    }


    Best practices:
        - Catch specific exceptions rathetr the generic Exception.
        - Use finally - clean ups
        - Do not suppress errors silently. 


    Try-with:
    Anything that is a resource can be automatically closed with try-with. 
    what is a resource: 
        - implements the closable or autoclosable interface.
        - file-streams, buffered streams, readers, sockets
        
        syntax:

            try (ResourceType resource = new ResourceType(??)){
            code that uses the resource}
            catch (exception){
            handle the exception}

         try (BufferedReader reader = new BufferedReader(new FileReader("nonexistantfile.txt"))){
        String line;
        while ((line = reader.readLine()) != null){
            System.out.println(line);
        }
    } catch (IOException e) {
        System.out.println("error: - " + e.getMessage());
    }
 


    Bubbling-up (propogation)
        - When an exceptions occurs java looks for a catch block to handle it. 
        - IF exception is not caught by current method: 1) error out 2) pass on to 
            the method that called it. 
        - Bubble up the stack until it is either handled or it reaches the main entry point.
        - at main either hanlded or runtime error. 



            //try {    
        //level1();
    // } catch (ArithmeticException e){
    //     System.out.println("this was caught in main: " + e.getMessage());
    // } 
    


}


public static void level1(){
    level2();
}

public static void level2(){
    level3();
}

public static void level3(){
    int result = 10 /0; //Arithmatic error
}



 - error handling with inheritance:
    - we can extend the base exception class to make our own custom execptions. 




 */
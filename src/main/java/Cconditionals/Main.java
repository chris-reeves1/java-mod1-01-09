package Cconditionals;

public class Main {
public static void main(String[] args) {
    
    // int x = 10;

    // if (x < 0) {
    //     System.out.println("number is greater than zero");
    // }
        
    // int num = 5;

    // if (num > 0) {
    //     System.out.println("number is greater than zero");
    // } else {
    //     System.out.println("number is not greater than zero");
    // }

        // int number =  0;

        // if (number > 0){
        //     System.out.println("number is positive");
        // } else if (number < 0){
        //     System.out.println("the number is negative");
        // }  else {
        //     System.out.println("the number is zero");
        // }


        // ternary operator

        // int number = 10;

        // String result = (number > 0) ? "positive" : "negative";

        // System.out.println(result);


        // Avoid complex + deep operators
        // int a = 10;
        // int b = 12;
        // int c = 15;
        // String abc = !(a > b) ? (b > c ? "b is greatre than c" : "c is greater than b") : "a is greater than b";
        // System.out.println(abc);

        // int number = 10;

        // int squaredOrDoubled = (number % 2 == 0) ? number * number : number * 2; 

        // System.out.println(squaredOrDoubled);

        // int number = 10;

        // int squaredOrDoubled = (number % 2 == 0) ? squareValue(number) : doubleValue(number) ; 

        // System.out.println(squaredOrDoubled);

        // && ||

        // int age = 16;
        // boolean hasLicense = true;

        // if (age >= 17 && hasLicense){
        //     System.out.println("can drive");
        // } else {
        //     System.out.println("not legal");
        // }

        // if (age >= 17 || hasLicense){
        //     System.out.println("can drive");
        // } else {
        //     System.out.println("not legal");
        // }
        
        // boolean onHoliday = false;
        // boolean isAdmin = false;
        // boolean isVerified = true;
                                   
        // if ((isAdmin || isVerified) && !onHoliday){
        //     System.out.println("access granted");
        // }   else {
        //     System.out.println("access denied");
        // }

        // int day = 1;

        // switch (day){
        //     case 1:
        //         System.out.println("monday");
        //     case 2:
        //         System.out.println("tueday");
        //     case 3:
        //         System.out.println("wednesday");
        //     default:
        //         System.out.println("other day");
        // }

}

// public static int doubleValue(int x){
//     return x * 2;
// }

// public static int squareValue(int x){
//     return x * x;
// }
}











/*
 * 
 *  -  If statement
 *      A statmnent to execute a block of code if a condition evaluates to being true.
 *  
 *      syntax:
 * 
 *          if (condition){
 *                  code block
 *                  }
 *          
 *  - if - else: 
 *      Else provides an alternative block to run if condition was false.
 *      
 *      sytnax:
 * 
 *          if (condition){
 *          code} else{ // only tiggers if the if statement was false. 
 *          code for else-block}
 * 
 *  else-if: 
 *      multiple conditions in sequence
 *          
 *      Syntax:
 *          
 *          if (condition){
 *          code} else if(other condition){
 *          code} else if(other condition){
 *          code} 
 * 
 *  Ternary operator:
 *        - simple, single line conditionals. 
 *        - "?" stand-in for if and else ":"
 *        - Call methods
 * 
 *          syntax:
 *              variable = (condition) ? valueifTrue : valueifFalse 
 *      
 *  nested conditional syntax:
 *      int number = 10;
 *      if (number > 0){
 *          if (number % 2 == 0){
 *              sys.prtinln("....")
 *              } else{}
 *          } else{}
 *     
 *  - logical and and logical or 
 *      - && - || 
 *              
 *  - switch: 
 *      - if - else -if - else
 *      - multiple blocks that can run. 
 *      - can evaluate against: bytes, chars, strings, ints, shorts. 
 *      - Default block - optional/goes anywhere.
 * 
 *  syntax:
 *      switch (expression){
 *      case value1:
 *          execute code;
 *          break;
 *      case value2:
 *          execute code;
 *          break;
 *      default:
 *          execute if no cases matched. 
 * }
 * 
 *   - backwards compatability
 *   - avoiding code repetition
 *   - efficiancy/flexibility
 *   - comment if fall-through is intentional.
 * 
 *   syntax:
 *          string result = switch (grade){
 *              case "A" "B" -> "passed";
 *              case "C" -> "fail"
 *              }
 * 
 *  - known discrete values. 
 */
package Dloops;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
            
//    // Printing a menu
//     Scanner scanner = new Scanner(System.in);
//     int choice;

//     do {
//         System.out.println("1. add");
//         System.out.println("2. subtract");
//         System.out.println("3. exit");
//         System.out.println("Enter a number pls: ");
//         choice = scanner.nextInt();

//         switch (choice){
//             case 1:
//                 System.out.println("adding....");
//                 break;
//             case 2:
//                 System.err.println("subtracting...");
//                 break;
//             case 3: 
//                 System.out.println("exiting...");
//                 break;
//             default:
//                 System.out.println("invalid choice...");
//         }
//     } while(choice != 3);

        // for(int i = 0; i < 5; ++i){
        //     System.out.println("count: " + i);
        // }

        // int[] numbers = {1, 2, 3};
        // for (int number : numbers){
        //     System.out.println("number is: " + number);
        // }

        // for (int i = 1; i <=3; ++i){
        //     for (int j = 1; j <=3; ++j){
        //         System.out.println("i = " + i + " , j = " + j);
        //     }
        // }

}
}


/*
 *  loops: executes a block of code continuously whilst a condition is true. 
 *         A loop will never tigger if the condition is false. 
 *         
 *          while/do while/standard for loop, enhanced for.
 * 
 *  - while:
 *         syntax:
 *              int i = 0;
            while (i <= 5){
                System.out.println(i);
                i++;
            } 
                
        

 *  - do - while : Code block executed at least once - even if
 *                  associateed condition isnt/was never true. 
 * 
 *      syntax:
 * 
 *              int i = 10;

    do {
        System.out.println("count: " + i);
        i++;
    } while (i <= 5);
 * 
 * with validation: 
 *  Scanner scanner = new Scanner(System.in);

   int number;

   do{
    System.out.println("pls enter a positive number: ");
    number = scanner.nextInt();
   } while (number <= 0);

   System.out.println("you entered " + number);
 * 
 * 
 *  - For loops: we know how many iterations we want. 
 *      - initialization
 *      - condition (must return be a bool)
 *      - increment/decrement
 * 
 *      syntax: 
 *          - for(initialisation; condition; increment){
 *              
 *          }
 *      infinite:
 *          for(;;)  // infinite
 *          while(true) // infinite
 * 
 * 
 *  enhanced for-loop: 
 *      : designed to loop over an iterable - collection, String, objs. 
 * 
 *      syntax: 
 *      
 *      for (type element : collection/array){
 *          }
 * 
 *  nested loops:
 *      for (int i)
 * 
 */
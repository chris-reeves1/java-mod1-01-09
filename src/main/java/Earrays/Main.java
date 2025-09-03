package Earrays;

import java.util.Arrays;

public class Main {
public static void main(String[] args) {
    
    // int[] numbers = {10, 20, 30}; 
    // System.out.println(numbers[0]);

    // numbers[0] = 25;

    // length
    // System.out.println(numbers.length); // -- outputs 3

    // iterating over an array

    // for (int i = 0; i < numbers.length; ++i){
    //     System.out.println(numbers[i]);
    // }

    // for (int num : numbers){
    //     System.out.println(num);
    // }

    // String[] words = {"hello", "world"};
    // System.out.println(words[0]);

    // multidimensional arrays

    // int[][] matrix = {
    //     {1, 2, 3},
    //     {4, 5, 6},
    //     {7, 8, 9}
    // };

    // System.out.println(matrix[1][2]);

    // // iterating a matrix:

    //     for (int i = 0; i < matrix.length; ++i){
    //         for (int j = 0; j < matrix[i].length; j++){
    //             System.out.println(matrix[i][j]);
    //         }
    //     }

        // copy

        // - manual copy

        //     int[] source = {1, 2, 3};
        //     int[] destination = new int[source.length];

        //     for (int i = 0; i < source.length; i++){ 
        //         destination[i] = source[i];
        //     }
        //     System.out.println(destination[2]);
        // // copyOf

        // int[] copy = Arrays.copyOf(source, source.length);
        // System.out.println(copy[2]);

        // // sort

        // int[] n = {4, 2, 7, 1};

        // Arrays.sort(n);
        // System.out.println(Arrays.toString(n));

}
}



/*
 * Arrays:
 *  - A collection of values of the same type.
 *  - Stored in contiguous memory.
 *  
 *      int[] arrayint;  
 *      type arrayint[]; // both valid. 
 * 
 *      int[] name = new int[5];
 * 
 *      - characteristics:
 *          - fixed size
 *          - zero-based indexing
 *          - same type
 *          - no built-in methods
 * 
 *      - if not initialised with data - defaults are used:
 *          obj: null
 *          boolean: false
 *          ints: 0
 *          floats: 0.0 
 *          chars: u/0000
 * 
 * 
 *  Memory:
 *      primitives: array object in heap. primitves in heap.
 *      reference objs: store pointers/refs, actual objs are elsewhere in heap.  
 * 
 *  When to use:
 *      - Speed plus predictable performance.
 *      - memory efficiant
 *      - legacy code
 *      - best for primitives
 * 
 *   - outofbounds error
 *  
 *  c# - int[] / Length / Sort / Clone
 */

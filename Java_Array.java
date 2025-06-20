
/**
 * Array: A data structure which stores a fixed-size sequential collection of elements of the same type.
 * It is a linear data structure, meaning that the elements are stored in contiguous memory locations.
 * Arrays are zero-indexed, meaning that the first element is at index 0.
 * Arrays are mutable, meaning that the elements can be modified.
 *
 * Types of Arrays:
 * 1. One-dimensional array: An array with only one dimension.
 * 2. Two-dimensional array: An array with two dimensions.
 * 3. Multidimensional array: An array with more than two dimensions.
 *
 * Memory Management:
 * Arrays are stored in contiguous memory locations, making it easy to access elements using their index.
 * When an array is created, the required memory is allocated on the heap.
 * When an array is no longer needed, the memory is automatically deallocated by the garbage collector.
 *
 * Example:
 * int[] scores = new int[5];
 * scores[0] = 50;
 * scores[1] = 60;
 * scores[2] = 70;
 * scores[3] = 80;
 * scores[4] = 90;
 *
 * Related Terms:
 * Index: The position of an element in the array.
 * Element: The value at a specific index in the array.
 * Length: The number of elements in an array.
 * Capacity: The maximum number of elements that can be stored in an array.
 * Array literal: A new array created using the array literal syntax.
 * Array initializer: A new array created using the array initializer syntax.
 **/

import java.util.Arrays;

public class Java_Array {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr4 = { 1, 2, 3, 4, 5 };
        // return hexadecimal memory address of array - string representation
        System.out.println("Memory address of array: " + arr1);

        // print array - [0, 0, 0, 0, 0] default values of int
        System.out.println("Array default values: " + Arrays.toString(arr1));

        // initialize array - Here 0,1,2,3,4 are indices/indexes
        arr1[0] = 5;
        arr1[1] = 5;
        arr1[2] = 3;
        arr1[3] = 1;
        arr1[4] = 9;
        System.out.println("Array initialized values: " + Arrays.toString(arr1));

        // Array length
        System.out.println("Array length: " + arr1.length);

        // Array iteration
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Element at index " + i + ": " + arr1[i]);
        }

        // Array Out of bounds exception
        // System.out.println("Element at index 10: " + arr1[10]);

        // Array sort
        Arrays.sort(arr1);
        System.out.println("Sorted array: " + Arrays.toString(arr1));

        // Array copy
        int[] arr2 = arr1.clone();
        System.out.println("Copied array: " + Arrays.toString(arr2));

        // Array equals
        System.out.println("Are arrays equal: " + Arrays.equals(arr1, arr2));

        // Array pass by reference - If any change in arr3 will reflect in arr1
        int[] arr3 = arr1;
        arr3[0] = 10;
        System.out.println("Filled array: " + Arrays.toString(arr1));

    }
}

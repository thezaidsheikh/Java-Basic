// Loops in Java are used to execute a set of instructions repeatedly until a certain condition is met.
// They are used to iterate over a collection of items, perform a task a certain number of times, etc.
// Loops are very useful when we need to do something multiple times, like displaying all the items in a list.
// There are 3 main types of loops in Java: for, while, and do while.

// 1. For loop: A for loop is used to iterate over a range of values. The syntax for a for loop is:
// for (initialization; condition; iteration) {
//     //code to be executed
// }
// Initialization is executed once, condition is checked before each iteration, and iteration is executed at the end of each iteration.
// Example:
// for (int i = 0; i < 5; i++) {
//     System.out.println(i);
// }

// 2. While loop: A while loop is used when we don't know the number of iterations beforehand. The syntax for a while loop is:
// while (condition) {
//     //code to be executed
// }
// Condition is checked before each iteration, and if the condition is true, the code inside the loop is executed.
// Example:
// int i = 0;
// while (i < 5) {
//     System.out.println(i);
//     i++;
// }

// 3. Do while loop: A do while loop is similar to a while loop, but the condition is checked after each iteration. The syntax for a do while loop is:
// do {
//     //code to be executed
// } while (condition);
// Condition is checked after each iteration, and if the condition is true, the code inside the loop is executed.
// Example:
// int i = 0;
// do {
//     System.out.println(i);
//     i++;
// } while (i < 5);

// Memory management is not a major concern with loops because the memory is released after the loop is finished.

public class Java_Loops {
    public static void main(String[] args) {
        // * For loop - Iterate over a range of values
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // * While loop - Iterate until a condition is true
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // * Do while loop - Iterate until a condition is true but at least once
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 5);

        // * For each loop - Iterate over an array or collection
        int[] arr = { 1, 2, 3, 4, 5 };
        for (int num : arr) {
            System.out.println(num);
        }

        // * Infinite loop
        // while (true) {
        // System.out.println("Infinite loop");
        // }

        // * Break statement - Exit a loop
        for (int k = 0; k < 5; k++) {
            if (k == 3) {
                break;
            }
            System.out.println(k);
        }

        // * Continue statement - Skip the current iteration
        for (int l = 0; l < 5; l++) {
            if (l == 3) {
                continue;
            }
            System.out.println(l);
        }

        // * Nested loop
        for (int m = 0; m < 5; m++) {
            for (int n = 0; n < 5; n++) {
                System.out.println(m + ", " + n);
            }
        }
    }
}

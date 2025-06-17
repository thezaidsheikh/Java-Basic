
/**
 * Functions in Java:
 *
 * A function is a block of code that performs a specific task and can be reused
 * several times in the program. It is also known as a method. A function can take
 * in parameters and return a value. It can also be overloaded and overridden.
 *
 * Advantages of using functions in Java include:
 * 1. Code reusability: Code can be reused by calling the same function multiple times.
 * 2. Modularity: Functions can be used to divide a program into smaller, more manageable modules.
 * 3. Easier debugging: Debugging a program is easier if the code is divided into smaller functions.
 * 4. Improved readability: Functions can make a program easier to read and understand.
 * 5. Memory Management: Functions can also be used to manage memory, as they can be used to dynamically allocate and deallocate memory.
 *
 * Types of Functions:
 * 1. User-defined Functions: These are functions that are defined by the user.
 *    Example: A function to find the square of a number.
 * 2. Library Functions: These are functions that are already defined in the
 *    library and can be used by the programmer.
 *    Example: The Math.sqrt() function.
 * 3. Abstract Methods: These are methods that are declared in an abstract class
 *    and do not have an implementation. They are used to define the interface for
 *    subclasses.
 *    Example: An abstract class Animal can have an abstract method sound() that
 *    does not have an implementation. A subclass of Animal such as Dog can have
 *    its own implementation of the sound() method.
 * 4. Static Methods: These are methods that are declared with the static keyword
 *    and can be called without creating an instance of the class. They belong to
 *    the class and not to any instance of the class.
 *    Example: The Math class has a static method sqrt() that can be called without
 *    creating an instance of the class.
 *
 * Function Declaration:
 * A function is declared with the following syntax:
 * return-type function-name(parameter_list) {
 *     // function body
 * }
 *
 * Function Call:
 * A function is called with the following syntax:
 * function-name(arguments);
 *
 * Function Arguments:
 * Arguments are values that are passed to the function when it is called. They
 * are separated by commas.
 *
 * Function Return:
 * A function can return a value. The return type of a function is declared in
 * the function declaration.
 *
 * Memory Management:
 * Java uses automatic memory management. This means that the memory is
 * automatically allocated and deallocated by the JVM. This means that the
 * programmer does not need to manually allocate and deallocate memory.
 *
 * Function Signatures:
 * A function signature is the name and parameter list of a function. It is used
 * to identify the function.
 *
 * Function Definitions:
 * A function definition is the body of the function. It contains the code that
 * is executed when the function is called.
 *
 * Example:
 * public static int add(int a, int b) {
 *     return a + b;
 * }
 *
 * This function takes two parameters and returns their sum.
 *
 * It can be called with the following syntax:
 * int result = add(5, 10);
 *
 * The output will be 15.
 */

import java.util.Scanner;

public class Functions {

    // Method to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Methos overloading - Function name is same return type or arguments must be
    // different
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to subtract two numbers
    public static int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter third number");
        int c = sc.nextInt();
        System.out.println("Sum = " + add(a, b));
        System.out.println("Sum of three numbers = " + add(a, b, c));
        System.out.println("Difference = " + subtract(a, b));
        sc.close();
    }
}

/**
 * Function Signature: The declaration of a function with its name, return type
 * and parameters.
 *
 * Function Definition: The actual implementation of the function.
 *
 * Example:
 *
 * Function Signature: public static int add(int a, int b)
 *
 * Function Definition:
 *
 * public static int add(int a, int b) {
 * return a + b;
 * }
 */

/**
 * Abstract Method: A method that is declared without an implementation.
 *
 * Abstract Class: A class that contains at least one abstract method.
 * It cannot be instantiated and is meant to be inherited by other classes.
 *
 * Example:
 *
 * abstract class Animal {
 * abstract void sound();
 * }
 *
 * Interface: A class that contains only abstract methods.
 * All methods in an interface are abstract and public.
 *
 * Example:
 *
 * interface Animal {
 * void sound();
 * }
 *
 * Implementation Hiding: The process of hiding implementation details of a
 * class from the outside world.
 *
 * Encapsulation: The process of hiding data and behavior of a class from the
 * outside world.
 *
 * Example:
 *
 * class BankAccount {
 * private int balance;
 *
 * public void deposit(int amount) {
 * balance += amount;
 * }
 *
 * public void withdraw(int amount) {
 * balance -= amount;
 * }
 *
 * public int getBalance() {
 * return balance;
 * }
 * }
 */

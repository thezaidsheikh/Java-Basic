
/**
 * Input class in Java:
 *
 * Input class is used to get the user input in Java. It is mainly used for console input operations.
 * It is mainly used in command line applications and is not used in GUI applications.
 *
 * The way to use it is to create an object of the Scanner class and pass the System.in object as an argument.
 * Then we can use the next() methods to get the user input.
 *
 * The next() method is used to get the input in the form of a string.
 * The nextInt() method is used to get the input in the form of an integer.
 * The nextFloat() method is used to get the input in the form of an float.
 * The nextDouble() method is used to get the input in the form of an double.
 *
 * The nextLine() method is used to get the input in the form of a string. It is used to get the input of a line.
 *
 * The hasnext() method is used to check if there is any input or not.
 *
 * The hasNextInt() method is used to check if the next input is an integer or not.
 * The hasNextFloat() method is used to check if the next input is an float or not.
 * The hasNextDouble() method is used to check if the next input is an double or not.
 *
 * The hasNextLine() method is used to check if there is any input of a line or not.
 *
 * The close() method is used to close the scanner object.
 *
 * Memory Management:
 *
 * The memory management of the scanner class is handled by the garbage collector.
 * The garbage collector is a part of the JVM which is responsible for the memory management of the objects.
 * The garbage collector is responsible for the freeing of the memory which is not in use.
 *
 * Types of Input class:
 *
 * There are two types of input class:
 * 1. Scanner: This is used to get the user input from the console.
 * 2. BufferedReader: This is used to get the user input from the file.
 *
 * Simple Example:
 *
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter your name");
 * String name = sc.nextLine();
 * System.out.println("Hello " + name);
 */

import java.util.Scanner;

public class Java_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        int a = sc.nextInt();
        System.out.println(a);
        System.out.println("Enter a string");
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println("Enter a float");
        float f = sc.nextFloat();
        System.out.println(f);
        System.out.println("Enter a double");
        double d = sc.nextDouble();
        System.out.println(d);
        System.out.println("Enter a boolean");
        boolean b = sc.nextBoolean();
        System.out.println(b);
        System.out.println("Enter a char");
        char c = sc.next().charAt(0);
        System.out.println(c);
        System.out.println("Enter a long");
        long l = sc.nextLong();
        System.out.println(l);
        System.out.println("Enter a short");
        short s = sc.nextShort();
        System.out.println(s);
        System.out.println("Enter a byte");
        byte by = sc.nextByte();
        System.out.println(by);
    }
}

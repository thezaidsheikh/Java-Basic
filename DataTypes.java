/**
 * Datatypes in Java
 * 
 * Datatypes are the types of data that can be stored inside a variable. In
 * Java,
 * there are two types of data types: Primitive data types and Non-primitive
 * data
 * types.
 * 
 * Primitive data types are the basic data types provided by Java. These data
 * types are not objects and do not have any methods. Primitive data types are:
 * 
 * 1. boolean: Represents a boolean value i.e. true or false
 * Example: boolean flag = true;
 * 
 * 2. char: Represents a single character
 * Example: char ch = 'a';
 * 
 * 3. byte: Represents an 8-bit signed integer
 * Example: byte b = 127;
 * 
 * 4. short: Represents a 16-bit signed integer
 * Example: short s = 32767;
 * 
 * 5. int: Represents a 32-bit signed integer
 * Example: int i = 2147483647;
 * 
 * 6. long: Represents a 64-bit signed integer
 * Example: long l = 9223372036854775807L;
 * 
 * 7. float: Represents a 32-bit floating point number
 * Example: float f = 3.14f;
 * 
 * 8. double: Represents a 64-bit floating point number
 * Example: double d = 3.14159;
 * 
 * 
 * Non-primitive data types are the types of data that are not basic data types.
 * Non-primitive data types are objects and have methods. Non-primitive data
 * types
 * are:
 * 
 * 1. String: Represents a sequence of characters
 * Example: String str = "Hello";
 * 
 * 2. Array: Represents an array of values
 * Example: int[] arr = {1,2,3};
 * 
 * 3. Class: Represents a custom class
 * Example: MyClass obj = new MyClass();
 * 
 * 4. Interface: Represents a custom interface
 * Example: MyInterface obj = new MyInterface() {
 * // Implement interface methods
 * };
 * 
 * 5. Enum: Represents a special type of class that represents a fixed set of
 * values
 * Example: enum Color {
 * RED,
 * GREEN,
 * BLUE
 * }
 * 
 * 
 * Memory Management of Data Types
 * 
 * Primitive data types are stored in stack memory. The memory is allocated and
 * deallocated by the JVM automatically. Non-primitive data types are stored in
 * heap memory. The memory is allocated and deallocated by the programmer.
 */

public class DataTypes {
    public static void main(String[] args) {
        int a = 10;
        long b = 10L;
        float c = 10.0f;
        double d = 10.0;
        boolean e = true;
        char f = 'a';
        String g = "Hello";
        System.out.println("int a = " + a);
        System.out.println("long b = " + b);
        System.out.println("float c = " + c);
        System.out.println("double d = " + d);
        System.out.println("boolean e = " + e);
        System.out.println("char f = " + f);
        System.out.println("String g = " + g);

        // Type casting
        int i = (int) c;
        System.out.println("int i = " + i);
        double j = (double) a;
        System.out.println("double j = " + j);
    }
}

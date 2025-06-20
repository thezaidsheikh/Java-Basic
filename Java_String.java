
/**
 * String in Java is a sequence of characters, for example "Hello".
 * When you create a String, it creates an object in memory.
 * String is immutable, meaning once created, it cannot be changed.
 * String is used very frequently in programming, for example, when reading user input,
 * storing data in a database, or when displaying text on a screen.
 * Java uses a special type of memory management for Strings, called the String pool.
 * The String pool is a special area in memory where all String objects are stored.
 * When you create a String, Java first checks if a String with the same value exists in the pool.
 * If it does, Java simply returns a reference to that String, if not, a new String object is created.
 * For example:
 * String str1 = "Hello";
 * String str2 = "Hello";
 * str1 and str2 will refer to the same object in memory, because "Hello" is already in the String pool.
 *
 * Other important things about string:
 * - String is a class, not a primitive data type.
 * - String is a final class, meaning it cannot be extended (sub-classed).
 * - String is a class that implements the Comparable interface, meaning you can compare two strings using the compareTo() method.
 * - String is a class that implements the CharSequence interface, meaning it can be used as a character sequence.
 * - String has a static method called valueOf() which can be used to convert a primitive type to a String.
 * - String has a method called intern() which returns a canonical representation for the string object.
 * - String has a method called substring() which returns a new String that is a substring of this string.
 * - String has a method called trim() which returns a copy of the string with leading and trailing white space omitted.
 * - String has a method called isEmpty() which returns true if the length of the string is 0.
 * - String has a method called startsWith() which returns true if the string starts with the specified prefix.
 * - String has a method called endsWith() which returns true if the string ends with the specified suffix.
 * - String has a method called indexOf() which returns the index of the first occurrence of the specified substring.
 * - String has a method called lastIndexOf() which returns the index of the last occurrence of the specified substring.
 */

import java.util.Arrays;

public class Java_String {
    public static void main(String[] args) {
        String str = "Hello"; // String variable declaration
        System.out.println("String: " + str);

        // String length
        System.out.println("String length: " + str.length());

        // String to char array
        char[] charArray = str.toCharArray();
        System.out.println("String to char array: " + Arrays.toString(charArray));

        // String to upper case
        System.out.println("String to upper case: " + str.toUpperCase());

        // String to lower case
        System.out.println("String to lower case: " + str.toLowerCase());

        // String comparison
        System.out.println("String comparison: " + str.equals("hello"));

        // String comparison
        System.out.println("String comparison: " + str.equalsIgnoreCase("hello"));

        // String index of
        System.out.println("String index of: " + str.indexOf("l"));

        // String last index of
        System.out.println("String last index of: " + str.lastIndexOf("l"));

        // String replace
        System.out.println("String replace: " + str.replace("l", "x"));

        // String replace all
        System.out.println("String replace all: " + str.replaceAll("l", "x"));

        // String replace first
        System.out.println("String replace first: " + str.replaceFirst("l", "x"));

        // String split
        System.out.println("String split: " + Arrays.toString(str.split("x")));

        // String trim
        System.out.println("String trim: " + str.trim());

        // String value of
        System.out.println("String value of: " + String.valueOf(10));

        // String value of
        System.out.println("String value of: " + String.valueOf(true));

        // String char at
        System.out.println("String char at: " + str.charAt(0));

        // String starts with
        System.out.println("String starts with: " + str.startsWith("Hello"));

        // String ends with
        System.out.println("String ends with: " + str.endsWith("Hello"));

        // String contains
        System.out.println("String contains: " + str.contains("Hello"));

        // String hash code
        System.out.println("String hash code: " + str.hashCode());

        // String concat
        System.out.println("String concat: " + str.concat(" World"));

        // Case for string concat with + operator with integer and integer
        System.out.println(10 + 20 + " String concat with + operator");

        // Case for string concat with + operator with integer and integer
        System.out.println("String concat with + operator: " + 10 + 20);
    }
}

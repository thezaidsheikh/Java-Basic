// Access Modifiers
/**
 * Private -
 * The private keyword is an access modifier that restricts access to the class
 * in which it is declared.
 * Members (variables/methods) can only be accessed within the same class
 * Cannot be accessed from subclasses or other classes
 * Used to implement encapsulation by hiding implementation details
 * 
 * class Person {
 * private String ssn; // Only accessible within the Person class
 * 
 * private void updateSSN(String newSSN) {
 * this.ssn = newSSN;
 * }
 * }
 * 
 * default (Access Modifier and Interface Method Modifier)
 * The default keyword has two distinct uses in Java:
 * 1. As an implicit access modifier (package-private access):
 * class Helper { // No explicit modifier = default access
 * void helperMethod() { // Default access method
 * // Method implementation
 * }
 * }
 *
 * 2. As a modifier for interface methods (since Java 8):
 * interface MyInterface {
 * default void defaultMethod() {
 * // Default implementation
 * }
 * }
 * As an access level: Allows access within the same package only
 * As an interface method modifier: Provides a default implementation that
 * implementing classes can use, override, or inherit
 * 
 * public -
 * Accessible from any class in any package
 * When you want to make a class, method, or field accessible to all classes
 * public class User {
 * public String username; // Accessible from anywhere
 * 
 * public void login() {
 * // Method implementation
 * }
 * }
 * 
 * protected -
 * Accessible within the same package and by subclasses
 * Use case: When you want to allow access to subclasses but restrict it from
 * unrelated classes
 * public class Animal {
 * protected void eat() { // Accessible to subclasses
 * // Method implementation
 * }
 * }
 * 
 * 
 * NON ACCESS MODIFIERS
 * 
 * static (Non-Access Modifier) -
 * The static keyword is a non-access modifier that makes a member belong to the
 * class itself rather than to any specific instance.
 * Can be applied to variables, methods, blocks, and nested classes
 * Static variables (class variables) are shared among all instances of a class
 * Static methods can be called without creating class instances
 * Cannot access non-static members directly within static methods
 * Often used for utility methods and constants
 * class Counter {
 * static int count = 0; // Class variable shared across all instances
 * 
 * static void incrementCount() { // Class method
 * count++;
 * }
 * }
 * 
 * final (Non-Access Modifier) -
 * The final keyword is a non-access modifier that restricts modification or
 * inheritance.
 * When applied to variables: Creates constants that cannot be reassigned
 * When applied to methods: Prevents method overriding in subclasses
 * When applied to classes: Prevents the class from being extended
 * Often used for immutability and design constraints
 * final class Utility { // Cannot be extended
 * final double PI = 3.14159; // Cannot be reassigned
 * 
 * final void calculate() { // Cannot be overridden
 * // Method implementation
 * }
 * }
 * 
 * 
 * abstract -
 * Indicates incomplete implementation
 * Classes: Cannot be instantiated, must be extended
 * Methods: Has no implementation, must be overridden
 * public abstract class Shape { // Cannot create Shape objects
 * abstract double calculateArea(); // No implementation
 * 
 * public void display() { // Concrete method
 * System.out.println("This is a shape");
 * }
 * }
 * 
 * 
 * synchronized -
 * Controls thread access to methods or blocks
 * Thread safety in multi-threaded environments
 * public class Counter {
 * private int count = 0;
 * 
 * public synchronized void increment() { // Only one thread can access at a
 * time
 * count++;
 * }
 * }
 * 
 * 
 * volatile -
 * Purpose: Indicates a variable might be modified by multiple threads
 * Use case: Ensuring visibility of changes to variables across threads
 * public class Status {
 * private volatile boolean ready = false; // Changes visible to all threads
 * }
 * 
 * 
 * transient -
 * Purpose: Excludes a field from serialization
 * Use case: When you don't want to save sensitive or temporary data
 * public class User implements Serializable {
 * private String username;
 * private transient String password; // Will not be serialized
 * }
 * 
 * native -
 * Purpose: Indicates a method implemented in native code (C/C++)
 * Use case: When Java code needs to use platform-specific functionality
 * public class FileSystem {
 * public native boolean deleteFile(String path); // Implemented in C/C++
 * }
 * 
 */

public class Java_Keywords {

}

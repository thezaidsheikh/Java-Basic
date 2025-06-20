/**
 * Interface in details
 *
 * Interface is a pure abstract class which is used to define a group of related
 * methods with empty bodies.
 * It is used to achieve abstraction and multiple inheritance.
 * It is also used to define the blueprint of a class.
 * It is used to loose coupling.
 * Object of interface cannot be created.
 * Reference of interface can be created.
 * Constructor cannot be defined in interface.
 * We can define variables in interface. By default they are public static
 * final (cannot be changed).
 * We can define methods in interface. By default they are public abstract.
 * We can define default methods - with implementation (Java 8) in interface. By
 * default they are public.
 * We can define static methods - with implementation (Java 8) in interface. By
 * default they are public static.
 * We can define private methods - with implementation (Java 9) in interface. By
 * default they are private.
 *
 * Memory Management:
 * Interface doesn't require any memory until it is implemented by a class.
 * Once implemented, the memory is managed by the implementing class.
 *
 * Types of Interface:
 * 1. Marker Interface - It is an empty interface which is used to provide
 * information to the JVM.
 * Example: Serializable, Cloneable
 * 2. Functional Interface - It is an interface which has only one abstract
 * method.
 * Example: Runnable, Comparable
 * 3. Normal Interface - It is an interface which has more than one abstract
 * methods.
 * Example: List, Set
 *
 * Other related terms of Interface:
 * 1. Abstract Method - It is a method which is declared without implementation.
 * 2. Default Method - It is a method which is declared with default
 * implementation.
 * 3. Static Method - It is a method which is declared with static keyword.
 * 4. Private Method - It is a method which is declared with private access
 * modifier.
 * 5. Nested Interface - It is an interface which is declared inside another
 * interface or class.
 * Example: List interface has a nested interface called ListIterator
 */

interface IMusicSystem {
    int volume = 10; // By default it is public static final variable

    // Abstract method
    void play();

    boolean isPlaying();

    void stopPlaying(int ab, String ch);

    // Default Methods - Java 8
    default void getVolume(int volume) {
        System.out.println("Volume set to " + volume);
    }

    static void setVolume(int volume) {
        System.out.println("Volume set to " + volume);
    }

    private void privateMethod() {
        System.out.println("Private method");
    }
}

class Java_Interface implements IMusicSystem {
    @Override
    public void play() {
        System.out.println("Playing");
    }

    @Override
    public boolean isPlaying() {
        return true;
    }

    @Override
    public void stopPlaying(int ab, String ch) {
        System.out.println("Stopped");
    }

    public static void main(String[] args) {
        Java_Interface inter = new Java_Interface();
        inter.play();
        System.out.println(inter.isPlaying());
        inter.getVolume(10);
        IMusicSystem.setVolume(20);
        // inter.privateMethod();
    }
}

// 1. Make a class and implement the interface.
// 2. Define interface in a class
// Example - def sh

// A functional interface is an interface which has only one abstract method.
// It can have multiple default and static methods.

// Types of functional interfaces
// 1. Predicate - It is a functional interface which takes one argument and
// returns boolean.
// Example - public static boolean isEven(int number) {
// return number % 2 == 0;
// }
// 2. Consumer - It is a functional interface which takes one argument and
// returns void.
// Example - public static void printNumber(int number) {
// System.out.println(number);
// }
// 3. Function - It is a functional interface which takes one argument and
// returns one result.
// Example - public static int doubleNumber(int number) {
// return number * 2;
// }
// 4. Supplier - It is a functional interface which takes no argument and
// returns one result.
// Example - public static int getNumber() {
// return 5;
// }

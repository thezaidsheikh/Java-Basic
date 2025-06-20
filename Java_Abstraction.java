/**
 * Abstraction is a process of hiding implementation details and showing only
 * the essential features of an object or system. It is used to reduce the
 * complexity of a system by exposing only the essential information to the
 * outside world.
 *
 * Abstraction is not only limited to objects but also applies to classes,
 * methods and interfaces. It is a fundamental concept of object-oriented
 * programming.
 *
 * Example:
 *
 * Suppose we have a class called "Car" which has a method called "startEngine".
 * The implementation of startEngine may be different depending on the type of
 * car. But the user of the class is only interested in the fact that the car
 * can be started. The details of how the engine is started is hidden from the
 * user.
 *
 * For example, the car class could have a method like this:
 *
 * public void startEngine() {
 * // implementation details are hidden from the user
 * // but the user knows that the car can be started
 * }
 *
 * The user of the class is only exposed to the interface of the class
 * (startEngine method) and the implementation details are hidden from the
 * user.
 */

// Using abstract class
// abstract class Car {
// abstract void startEngine();

// abstract void stopEngine();

// abstract boolean isEngineRunning();
// }

interface Car {
    void startEngine();

    void stopEngine();

    boolean isEngineRunning();
}

class Sedan implements Car {
    boolean isEngineRunning;

    @Override
    public void startEngine() {
        isEngineRunning = true;
    }

    @Override
    public void stopEngine() {
        isEngineRunning = false;
    }

    @Override
    public boolean isEngineRunning() {
        return isEngineRunning;
    }
}

public class Java_Abstraction {
    public static void main(String[] args) {
        Sedan sedan = new Sedan();
        sedan.startEngine();
        System.out.println("Is engine running? " + sedan.isEngineRunning());
        sedan.stopEngine();
        System.out.println("Is engine running? " + sedan.isEngineRunning());
    }
}
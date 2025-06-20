/**
 * Abstract class in Java:
 * 
 * An abstract class is a class which contains both abstract and non-abstract
 * methods. It is used to provide a blueprint for other classes to follow.
 * Abstract classes can contain both abstract and non-abstract methods.
 * Abstract methods are methods without implementation and are declared using
 * the
 * "abstract" keyword. Non-abstract methods are methods with implementation and
 * are declared without the "abstract" keyword.
 * Abstract classes cannot be instantiated and must be extended by other
 * classes.
 * Abstract classes can have constructors, static methods, and static variables.
 * Abstract classes can implement interfaces.
 * Normal class does not allow to have abstract methods.
 * 
 * Abstract classes are used to provide a common base class for a group of
 * related classes that share some common characteristics.
 * 
 * Example:
 * 
 * abstract class Animal {
 * abstract void sound();
 * void eat() {
 * System.out.println("The animal is eating");
 * }
 * }
 * 
 * class Dog extends Animal {
 * 
 * @Override
 *           void sound() {
 *           System.out.println("The dog says: bark bark");
 *           }
 *           }
 * 
 *           class Cat extends Animal {
 * @Override
 *           void sound() {
 *           System.out.println("The cat says: meow meow");
 *           }
 *           }
 * 
 *           Animal animal = new Dog();
 *           animal.sound(); // Output: The dog says: bark bark
 *           animal.eat(); // Output: The animal is eating
 * 
 *           animal = new Cat();
 *           animal.sound(); // Output: The cat says: meow meow
 *           animal.eat(); // Output: The animal is eating
 */

abstract class Employee {
    public void attendence() {
        System.out.println("Employee is attending");
    }

    Employee() {
        System.out.println("Employee is created");
    }

    abstract void work();
}

class Developer extends Employee {
    @Override
    void work() {
        System.out.println("Developer is working");
    }

    Developer() {
        System.out.println("Developer is created");
    }
}

public class Java_Abstract {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.attendence();
        developer.work();
    }
}
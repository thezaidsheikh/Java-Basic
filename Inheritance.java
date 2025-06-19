/**
 * Inheritance is a process in which one object can acquire the properties of
 * another object.
 * It is a fundamental concept in object-oriented programming.
 * It is a mechanism in Java that allows one class to inherit the properties of
 * another class.
 * Creates is-a-type-of relationship between classes.
 * 
 * Importance of Inheritance:
 * 1. Code Reusability
 * 2. Code Readability
 * 3. Code Maintainability
 * 
 * Important terms in Inheritance:
 * 
 * 1. Super Class/Parent Class: The class whose properties are inherited is
 * known as Super Class or Parent Class.
 * 2. Sub Class/Child Class: The class which is doing the inheritance is known
 * as Sub Class or Child Class.
 * 3. Inheritance: The process of acquiring the properties of one class by
 * another class.
 * 4. Single Inheritance: When a class extends only one class, it is known as
 * single inheritance.
 * 5. Multiple Inheritance: When a class extends more than one class, it is
 * known as multiple inheritance.
 * 
 * Types of Inheritance in Java
 * 1. Single Inheritance: One subclass inherits from one superclass.
 * 2. Multilevel Inheritance: A class inherits from a subclass, forming a chain.
 * 3. Hierarchical Inheritance: Multiple subclasses inherit from one superclass.
 * 4. Note: Java does not support multiple inheritance (a class inheriting from
 * more than one class) to avoid ambiguity (diamond problem). However, it can
 * be achieved using interfaces.
 * 
 * Example of Single Inheritance:
 * 
 * class Animal {
 * void eat() {
 * System.out.println("The animal is eating");
 * }
 * }
 * 
 * class Dog extends Animal {
 * void bark() {
 * System.out.println("The dog is barking");
 * }
 * }
 * 
 * Animal animal = new Animal();
 * Dog dog = new Dog();
 * 
 * animal.eat();
 * dog.eat();
 * dog.bark();
 */

class Animal {
    void eat() {
        System.out.println("The animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog is barking");
    }

    // Method overriding.
    void eat() {
        // super.eat(); // Calls the eat method of the parent class.
        System.out.println("The dog is eating");
    }
}

class Husky extends Dog {
    void run() {
        System.out.println("The husky is running");
    }
}

public class Inheritance {

    public static void main(String[] args) {
        // Case 1
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        // Case 2
        Husky husky = new Husky();
        husky.eat();
        husky.bark();
        husky.run();

        // Case 3
        Animal animal = new Animal();
        animal.eat();

        // Case 4 - Not work
        // Dog dog2 = new Animal();
        // dog2.eat();

        // Case 5 - Polymorphism
        Animal animal2 = new Dog();
        animal2.eat();
        // animal2.bark();

        // Case 6 - Polymorphism
        Animal animal3 = new Husky();
        animal3.eat();
        // animal3.bark();
        // animal3.run();
    }
}
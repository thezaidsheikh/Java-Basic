/**
 * Polymorphism in Java
 *
 * Polymorphism is the ability of an object to take on multiple forms.
 * In Java, polymorphism is achieved through method overriding or method
 * overloading.
 *
 * There are two types of polymorphism:
 * 1. Compile-time polymorphism: This type of polymorphism is achieved through
 * method overloading. It is determined at compile time which method will be
 * used.
 *
 * 2. Runtime polymorphism: This type of polymorphism is achieved through method
 * overriding. It is determined at runtime which method will be used.
 *
 * Polymorphic types: Animal, Dog, Cat
 *
 */
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Java_Polymorphism {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        animal.sound();
        dog.sound();
        cat.sound();
    }
}

/**
 * Class in Java:
 * A class is a blueprint/template for creating objects.
 * It is a user-defined data type that contains data and code: data in the form
 * of fields (variables) and code in the form of procedures (methods).
 * It is a logical entity that encapsulates data and functions.
 * It is a template that defines the characteristics of an object.
 * 
 * Important terms in a class:
 * 
 * 1. Fields (Variables): These are the data members of a class which are used
 * to store the data.
 * Example: int age;
 * 
 * 2. Constructors: These are special methods which are used to initialize
 * objects.
 * Example: public Person(String name, int age) {
 * this.name = name;
 * this.age = age;
 * }
 * 
 * 3. Methods: These are the functions in a class which are used to perform
 * operations.
 * Example: public void sayHello() {
 * System.out.println("Hello, my name is "+name);
 * }
 * 
 * 4. Properties: These are the getter and setter methods of a class which are
 * used to access and modify the fields.
 * Example: public int getAge() {
 * return age;
 * }
 * public void setAge(int age) {
 * this.age = age;
 * }
 * 
 * 5. Inheritance: It is the process of creating a new class from an existing
 * class.
 * The new class is the child/subclass and the existing class is the
 * parent/superclass.
 * The child class inherits all the fields and methods of the parent class.
 * Example: class Animal {
 * public void eat() {
 * System.out.println("The animal is eating");
 * }
 * }
 * class Dog extends Animal {
 * public void bark() {
 * System.out.println("The dog is barking");
 * }
 * }
 * 
 * 6. Polymorphism: It is the ability of an object to take many forms.
 * It is the ability of an object to behave differently in different conditions.
 * Example: class Animal {
 * public void eat() {
 * System.out.println("The animal is eating");
 * }
 * }
 * class Dog extends Animal {
 * 
 * @Override
 *           public void eat() {
 *           System.out.println("The dog is eating dog food");
 *           }
 *           }
 * 
 *           7. Encapsulation: It is the process of hiding the implementation
 *           details of an object from the outside world.
 *           It is the process of hiding the fields of an object from the
 *           outside world.
 *           Example: class Person {
 *           private int age;
 *           public int getAge() {
 *           return age;
 *           }
 *           public void setAge(int age) {
 *           this.age = age;
 *           }
 *           }
 * 
 *           8. Abstraction: It is the process of hiding the implementation
 *           details of an object from the outside world.
 *           It is the process of showing only the necessary information to the
 *           outside world.
 *           Example: class Person {
 *           private int age;
 *           public int getAge() {
 *           return age;
 *           }
 *           public void setAge(int age) {
 *           this.age = age;
 *           }
 *           }
 */

public class Java_Class {
    // Data members
    int num1 = 10;
    boolean b = true;

    // Member functions
    public void printNumber() {
        System.out.println("Number = " + num1);
    }

    public void printBoolean() {
        System.out.println("Boolean = " + b);
    }

    public static void main(String[] args) {
        // Here new keyword is used to create an object. And has been created in heap
        // memory.
        // While the reference variable is stored in stack memory contains the address
        // of the object.
        Java_Class t = new Java_Class(); // Object creation
        t.printNumber();
        t.printBoolean();
    }
}

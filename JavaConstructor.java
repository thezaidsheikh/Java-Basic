/**
 * Constructors in Java
 * 
 * A constructor is a special type of method which is used to initialize an
 * object. It is invoked when an object of the class is created. Constructors
 * have the same name as the class and do not have any return type, not even
 * void. Constructors are used to initialize the state of an object.
 * 
 * Constructors can be overloaded. This means that a class can have multiple
 * constructors with different parameters. The constructor which matches the
 * parameter list is used to create an object.
 * 
 * If we define a constructor, the default constructor is not provided by the
 * compiler. We need to define it ourselves.
 * 
 * Constructors can also be private. This is useful when we want to restrict
 * creation of objects from outside the class.
 * 
 * Constructors can also be used to copy an object. This is done by passing
 * another object of the same class as parameter to the constructor.
 * 
 * Constructors are used to set the default values for the objects.
 * 
 * Constructors can throw exceptions.
 * 
 * Important definitions and terms:
 * 
 * 1. Default constructor: A default constructor is a constructor which does
 * not take any parameters. It is used to initialize the state of an object
 * with default values.
 * 
 * 2. Parameterized constructor: A parameterized constructor is a constructor
 * which takes one or more parameters. It is used to initialize the state of an
 * object with specific values.
 * 
 * 3. Copy constructor: A copy constructor is a constructor which takes another
 * object of the same class as parameter. It is used to create a copy of an
 * object.
 * 
 * 4. Private constructor: A private constructor is a constructor which is
 * declared as private. It is used to restrict creation of objects from outside
 * the class.
 * 
 * Example:
 * 
 * Simple constructor:
 * class Test {
 * int num;
 * 
 * // Simple constructor
 * Test() {
 * num = 10;
 * }
 * }
 * 
 * Object construction:
 * Test obj = new Test();
 * 
 * Parameterized constructor:
 * class Test {
 * int num;
 * 
 * // Parameterized constructor
 * Test(int num) {
 * this.num = num;
 * }
 * }
 * 
 * Object construction:
 * Test obj = new Test(20);
 * 
 * Copy constructor:
 * class Test {
 * int num;
 * 
 * // Copy constructor
 * Test(Test obj) {
 * num = obj.num;
 * }
 * }
 * 
 * Object construction:
 * Test obj1 = new Test();
 * Test obj2 = new Test(obj1);
 */

public class JavaConstructor {
    int num;
    String name;

    JavaConstructor(int num, String name) {
        this.num = num;
        this.name = name;
    }

    void printNumber() {
        System.out.println("Number = " + num);
    }

    void printName() {
        System.out.println("Name = " + name);
    }

    public static void main(String[] args) {
        JavaConstructor obj = new JavaConstructor(10, "Zaid");
        obj.name = "Faizan";
        obj.num = 20;
        obj.printNumber();
        obj.printName();
    }
}
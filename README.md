# Java Basics: Core Concepts

## Table of Contents
1. [Primitive Data Types](#primitive-data-types)
2. [Non-Primitive Data Types](#non-primitive-data-types)
3. [Wrapper Classes](#wrapper-classes)
4. [Key Differences](#key-differences)
5. [Interfaces](#interfaces)
6. [Common Java Terms](#common-java-terms)

## Primitive Data Types

Java has 8 primitive data types that are predefined by the language and named by a reserved keyword:

1. **byte**
   - 8-bit signed integer
   - Range: -128 to 127
   - Default value: 0
   - Example: `byte b = 100;`

2. **short**
   - 16-bit signed integer
   - Range: -32,768 to 32,767
   - Default value: 0
   - Example: `short s = 10000;`

3. **int**
   - 32-bit signed integer
   - Range: -2^31 to 2^31-1
   - Default value: 0
   - Example: `int i = 100000;`

4. **long**
   - 64-bit signed integer
   - Range: -2^63 to 2^63-1
   - Default value: 0L
   - Example: `long l = 100000L;`

5. **float**
   - 32-bit IEEE 754 floating point
   - Default value: 0.0f
   - Example: `float f = 3.14f;`

6. **double**
   - 64-bit IEEE 754 floating point
   - Default value: 0.0d
   - Example: `double d = 3.14159;`

7. **boolean**
   - Represents one bit of information
   - Only two possible values: true or false
   - Default value: false
   - Example: `boolean flag = true;`

8. **char**
   - Single 16-bit Unicode character
   - Range: '\u0000' (0) to '\uffff' (65,535)
   - Default value: '\u0000'
   - Example: `char letter = 'A';`

## Non-Primitive Data Types

Non-primitive data types are also called reference types because they refer to objects. They include:

1. **String**
   - Represents a sequence of characters
   - Immutable (cannot be changed once created)
   - Null values are allowed
   - Can be initialized with values or left empty
   - String is final class
   - Can be created using String literal or new keyword
   - Can be created using String constructor
   - String is Iterable as it is character sequence
   - Example: `String name = "Java";`

2. **Arrays**
   - Container that holds a fixed number of values of a single type
   - Contiguous memory allocation (depends on the size of data type)
   - Fixed size
   - Homogeneous (all elements must be of the same type)
   - After declaration, size cannot be changed
   - Can be initialized with values or left empty
   - Can be multi-dimensional
   - Arrays are iterable
   - Example: `int[] numbers = {1, 2, 3};`


3. **Classes**
   - User-defined data types that act as blueprints for creating objects
   - Example: `class Student { ... }`

4. **Interfaces**
   - Reference types similar to classes that can contain only constants, method signatures, default methods, and static methods
   - Example: `interface Drawable { ... }`

## Wrapper Classes

Wrapper classes provide a way to use primitive data types as objects. Each primitive type has a corresponding wrapper class:

1. **Byte** - Wraps byte
   - Example: `Byte b = new Byte("100");`

2. **Short** - Wraps short
   - Example: `Short s = new Short("1000");`

3. **Integer** - Wraps int
   - Example: `Integer i = new Integer(10000);`

4. **Long** - Wraps long
   - Example: `Long l = new Long(100000L);`

5. **Float** - Wraps float
   - Example: `Float f = new Float(3.14f);`

6. **Double** - Wraps double
   - Example: `Double d = new Double(3.14159);`

7. **Boolean** - Wraps boolean
   - Example: `Boolean b = new Boolean(true);`

8. **Character** - Wraps char
   - Example: `Character c = new Character('A');`

## Key Differences

### Primitive vs Non-Primitive

| Feature | Primitive Types | Non-Primitive Types |
|---------|----------------|---------------------|
| Storage | Store values directly | Store references to objects |
| Memory | Fixed size | Variable size |
| Default | Have default values | Default is null |
| Usage | Lowercase keywords | Start with uppercase |
| Example | int, char, boolean | String, Arrays, Classes |

### Primitives vs Wrapper Classes

| Feature | Primitives | Wrapper Classes |
|---------|------------|-----------------|
| Type | Not objects | Objects |
| Memory | More efficient | Less efficient |
| Null | Cannot be null | Can be null |
| Usage | For simple values | When object is needed |
| Example | int x = 5; | Integer x = 5; |

### Autoboxing and Unboxing
- **Autoboxing**: Automatic conversion of primitive types to their corresponding wrapper classes
  ```java
  Integer num = 5; // autoboxing
  ```

- **Unboxing**: Automatic conversion of wrapper class to primitive type
  ```java
  int n = num; // unboxing
  ```

## Best Practices
1. Use primitive types when possible for better performance
2. Use wrapper classes when working with collections (which require objects)
3. Be cautious with null values when using wrapper classes
4. Use `valueOf()` method for better memory management when creating wrapper objects

## Interfaces

Interfaces in Java are reference types that are similar to classes but can only contain constants, method signatures, default methods, static methods, and nested types. They cannot contain instance fields or constructors.

### Key Characteristics:
- **Abstract Methods**: Methods without implementation (before Java 8)
- **Default Methods**: Methods with implementation (introduced in Java 8)
- **Static Methods**: Utility methods that belong to the interface
- **Constants**: All fields are implicitly `public`, `static`, and `final`

### Example:
```java
interface Drawable {
    // Abstract method
    void draw();
    
    // Default method
    default void print() {
        System.out.println("Printing...");
    }
    
    // Static method
    static void resize() {
        System.out.println("Resizing...");
    }
}
```

### Implementing Interfaces:
```java
class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
```

### Multiple Inheritance:
Java doesn't support multiple inheritance of classes but supports multiple interface implementation:
```java
class MyClass implements Interface1, Interface2, Interface3 {
    // Class implementation
}
```

## Common Java Terms

### 1. Class
- A blueprint/template for creating objects
- Can contain fields, methods, constructors, blocks, and nested classes/interfaces
- Example: `class Student { ... }`

### 2. Object
- An instance of a class
- Has state (fields) and behavior (methods)
- Created using the `new` keyword
- Example: `Student student1 = new Student();`

### 3. Inheritance
- Mechanism where one class acquires properties and behaviors of another class
- Uses `extends` keyword
- Supports code reusability and method overriding
- Example: `class Dog extends Animal { ... }`

### 4. Polymorphism
- Ability of an object to take many forms
- Two types:
  - Compile-time (method overloading)
  - Runtime (method overriding)

### 5. Encapsulation
- Wrapping data and code together as a single unit
- Achieved using access modifiers (private, protected, public)
- Provides data hiding and protection

### 6. Abstraction
- Process of hiding implementation details
- Achieved using abstract classes and interfaces
- Focuses on what an object does rather than how it does it

### 7. Exception Handling
- Mechanism to handle runtime errors
- Uses try, catch, finally, throw, and throws
- Example:
  ```java
  try {
      // code that may throw exception
  } catch (Exception e) {
      // handle exception
  }
  ```

### 8. Collections Framework
- Set of classes and interfaces for storing and manipulating groups of objects
- Core interfaces: List, Set, Queue, Map
- Example: `ArrayList`, `HashSet`, `HashMap`

*** ArrayList ***
- Implementation of List interface
- Dynamic array - Size can be changed
- Can store duplicate elements
- Maintains insertion order
- Null values are allowed - can store multiple null values
- Index based access
- Random access is fast
- Insertion and deletion is slow
- Best for frequent access
- Memory allocation is dynamic
- Example: `List<String> names = new ArrayList<>();`

*** HashSet ***
- Implementation of Set interface
- Stores unique elements
- No order guarantee
- Null values are allowed - can store only one null value
- Fast search
- Example: `Set<String> names = new HashSet<>();`

*** HashMap ***
- Implementation of Map interface
- Stores key-value pairs
- No order guarantee
- Null values are allowed - can store only one null key and multiple null values
- Fast search
- Example: `Map<String, Integer> names = new HashMap<>();`

*** LinkedList ***
- Implementation of List interface
- Dynamic array - Size can be changed
- Can store duplicate elements
- Maintains insertion order
- Null values are allowed - can store multiple null values
- Index based access
- Random access is fast
- Insertion and deletion is slow
- Best for frequent access
- Memory allocation is dynamic
- Example: `List<String> names = new LinkedList<>();`

*** Queue ***
- Implementation of Queue interface
- Stores elements in a first-in, first-out (FIFO) manner
- Null values are allowed - can store multiple null values
- Fast search
- Example: `Queue<String> names = new LinkedList<>();`

*** Stack ***
- Implementation of Stack interface
- Stores elements in a last-in, first-out (LIFO) manner
- Null values are allowed
- Fast search
- Example: `Stack<String> names = new Stack<>();`

### 9. Generics
- Enables types (classes and interfaces) to be parameters
- Provides compile-time type safety
- Example: `List<String> names = new ArrayList<>();`

### 10. Threads
- Lightweight sub-process
- Enables concurrent execution of multiple parts of a program
- Can be created by extending Thread class or implementing Runnable interface

### 11. Annotations
- Metadata about the code
- Starts with @ symbol
- Examples: `@Override`, `@Deprecated`, `@SuppressWarnings`

### 12. Lambda Expressions
- Introduced in Java 8
- Enables functional programming
- Example: `(a, b) -> a + b`

### 13. Stream API
- Introduced in Java 8
- Used for processing collections of objects
- Enables functional-style operations
- Example: 
  ```java
  list.stream()
     .filter(n -> n % 2 == 0)
     .forEach(System.out::println);
  ```

### 14. Enums
- Special class that represents a group of constants
- Type-safe alternative to traditional integer constants
- Can have fields, constructors, and methods
- Example:
  ```java
  public enum Day {
      SUNDAY("Sun"), MONDAY("Mon"), TUESDAY("Tue"),
      WEDNESDAY("Wed"), THURSDAY("Thu"),
      FRIDAY("Fri"), SATURDAY("Sat");
      
      private final String shortName;
      
      Day(String shortName) {
          this.shortName = shortName;
      }
      
      public String getShortName() {
          return shortName;
      }
  }
  ```

### 15. Access Modifiers
- Control the visibility/accessibility of classes, methods, and variables
- Types:
  - `public`: Accessible from any other class
  - `protected`: Accessible within the same package and subclasses
  - `default` (no modifier): Accessible within the same package only
  - `private`: Accessible within the same class only

### 16. Static Keyword
- Used to share the same instance of a variable or method across all objects
- Used to define constants
- Used to define utility methods
- Belongs to the class rather than any object
- Can be applied to variables, methods, blocks, and nested classes
- Example:
  ```java
  class Counter {
      static int count = 0;  // static variable
      
      static {
          // static block (executed when class is loaded)
          System.out.println("Static block called");
      }
      
      static void increment() {  // static method
          count++;
      }
  }
  ```

### 17. Final Keyword
- Can be applied to variables, methods, and classes
- `final` variable: Value cannot be changed (constant)
- `final` method: Cannot be overridden by subclasses
- `final` class: Cannot be extended
- Example:
  ```java
  final class ImmutableClass {
      private final int value;
      
      public ImmutableClass(int value) {
          this.value = value;
      }
      
      public final void display() {
          System.out.println("Value: " + value);
      }
  }
  ```

### 18. Abstract Classes
- Cannot be instantiated directly
- Can contain abstract methods (without implementation) and concrete methods
- Must be extended by a subclass that provides implementations for abstract methods
- Example:
  ```java
  abstract class Shape {
      abstract double area();  // abstract method
      
      void display() {      // concrete method
          System.out.println("This is a shape");
      }
  }
  
  class Circle extends Shape {
      double radius;
      
      @Override
      double area() {
          return Math.PI * radius * radius;
      }
  }
  ```

### 19. Type Casting
- Converting one data type to another
- Two types:
  - **Implicit/Widening**: Automatic conversion (smaller to larger type)
    ```java
    int i = 100;
    long l = i;  // implicit casting
    ```
  - **Explicit/Narrowing**: Manual conversion (larger to smaller type)
    ```java
    double d = 100.04;
    long l = (long)d;  // explicit casting
    ```

### 20. Java Memory Management
- **Stack Memory**: Stores primitive types and references to objects
- **Heap Memory**: Stores objects and their instance variables
- **Garbage Collection**: Automatic memory management that deletes unused objects

### 21. Java Packages
- Used for organizing classes and interfaces
- Helps in avoiding naming conflicts
- Example:
  ```java
  package com.example.myapp;
  
  public class MyClass {
      // class implementation
  }
  ```

### 22. JavaDoc Comments
- Used for documenting Java code
- Generates API documentation
- Example:
  ```java
  /**
   * Calculates the sum of two numbers.
   * @param a first number
   * @param b second number
   * @return sum of a and b
   */
  public int add(int a, int b) {
      return a + b;
  }
  ```

## Best Practices (Continued)
5. Prefer interfaces over abstract classes when possible
6. Use meaningful and consistent naming conventions (PascalCase for classes, camelCase for methods/variables, UPPER_SNAKE_CASE for constants)
7. Follow the principle of least privilege when setting access levels
8. Document your code using Javadoc comments for public APIs
9. Handle exceptions appropriately (catch specific exceptions, don't ignore them)
10. Write unit tests for your code
11. Use enums instead of integer constants for better type safety
12. Make classes and methods final by default unless designed for extension
13. Prefer immutable objects when possible
14. Use the `@Override` annotation when overriding methods
15. Close resources using try-with-resources statement
16. Follow the Single Responsibility Principle
17. Use `StringBuilder` for string concatenation in loops
18. Prefer `interface` types on variable declarations (e.g., `List<String> list = new ArrayList<>()`)
19. Use `final` for method parameters and local variables when they shouldn't be reassigned
20. Avoid using raw types with generics

## Common Methods in Wrapper Classes

### Integer Class Example
- `intValue()` - returns int value
- `compareTo(Integer anotherInteger)` - compares two Integer objects
- `equals(Object obj)` - compares the object with the specified object
- `parseInt(String s)` - parses the string argument as a signed decimal integer
- `toString()` - returns a String object representing this Integer's value

### Other Wrapper Classes
Similar methods are available for other wrapper classes with appropriate type conversions.

## Conclusion
## Conclusion

Understanding these core Java concepts is essential for any Java developer. From basic data types to advanced features like interfaces and collections, each concept plays a vital role in Java application development. Remember that:

- Primitive types offer better performance for simple values
- Wrapper classes provide object-oriented features and are essential for collections
- Interfaces enable abstraction and multiple inheritance
- Object-oriented principles (encapsulation, inheritance, polymorphism) form the foundation of Java programming
- Modern Java features (lambdas, streams) enable more concise and functional programming styles

As you continue your Java journey, always refer to the official Java documentation and follow best practices to write clean, efficient, and maintainable code.

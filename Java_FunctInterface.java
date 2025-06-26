import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Functional Interface:
 * - It is an interface which has only one abstract method.
 * - It is also known as Single Abstract Method (SAM) interface.
 * - It is used to define a single method which is used to perform a certain
 * task.
 * - It is used to achieve functional programming in Java.
 * - It is also used to define a lambda expression.
 * 
 * Types of Functional Interface:
 * 1. Built-in Functional Interface: It is a functional interface which is
 * provided by Java.
 * Example: Runnable, Comparable, Predicate, Function
 * 2. User-defined Functional Interface: It is a functional interface which is
 * defined by the user.
 * Example: public interface MathOperation {
 * int operation(int a, int b);
 * }
 * 
 * Memory Representation:
 * Functional Interface doesn't require any memory until it is implemented by a
 * class.
 * Once implemented, the memory is managed by the implementing class.
 * 
 * Example:
 * public interface MathOperation {
 * int operation(int a, int b);
 * }
 * 
 * public class MathOperationImpl implements MathOperation {
 * public int operation(int a, int b) {
 * return a + b;
 * }
 * }
 * 
 * MathOperationImpl obj = new MathOperationImpl();
 * int result = obj.operation(10, 20);
 * System.out.println(result); // 30
 * 
 * Consumer Functional Interface
 * - Single input and no output
 * - Example: public interface Consumer {
 * - void accept(T t);
 * - }
 * - Methods: accept
 * 
 * Supplier Functional Interface
 * - No input and single output
 * - Example: public interface Supplier {
 * - T get();
 * - }
 * - Methods: get
 * 
 * Predicate Functional Interface
 * - Single input and single output (boolean)
 * - Example: public interface Predicate {
 * - boolean test(T t);
 * - }
 * - Methods: test
 * 
 * Function Functional Interface
 * - Single input and single output
 * - Example: public interface Function {
 * - R apply(T t);
 * - }
 * - Methods: apply
 */

// Normal Interface
// interface INormal {
// default void normal() {
// return;
// }

// }

// Functional Interface
@FunctionalInterface
interface IFunctional {
    public void functional();

}

class Test implements IFunctional {

    @Override
    public void functional() {
        System.out.println("Functional");
    }

}

public class Java_FunctInterface {
    public static void main(String[] args) {
        Test test = new Test();
        test.functional();

        // Anonymous Inner Class
        IFunctional func = new IFunctional() {
            @Override
            public void functional() {
                System.out.println("Interface implemented using anonymous inner class");
            }
        };
        func.functional();

        // Lambda Expression
        IFunctional func2 = () -> System.out.println("Interface implemented using lambda expression");
        func2.functional();

        // Consumer
        Consumer<String> consumer = (String s) -> System.out.println("My Consumer printing: " + s);
        consumer.accept("Consumer");

        // Supplier
        Supplier<String> supplier = () -> "Supplier";
        System.out.println(supplier.get());

        // Predicate
        Predicate<String> predicate = (String s) -> s.length() > 5;
        System.out.println(predicate.test("Predicate"));

        // Function
        Function<String, Integer> function = (String s) -> s.length();
        System.out.println(function.apply("Function"));
    }
}

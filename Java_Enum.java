/**
 * Enum:
 * Enum is a special type of class that can have a fixed number of constants.
 * It is used to represent a fixed number of named values.
 * It is a type-safe alternative to using constants.
 * 
 * Syntax:
 * enum EnumName {
 * // constants
 * }
 * 
 * Types:
 * 1. Single Value Enum: It is an enum with a single value.
 * Example: enum Color { RED };
 * 2. Multi Value Enum: It is an enum with multiple values.
 * Example: enum Color { RED, GREEN, BLUE };
 * 3. Enum with methods: It is an enum with methods.
 * Example: enum Color {
 * RED() {
 * public void printColor() {
 * System.out.println("Red");
 * }
 * };
 * }
 * 
 * Memory Representation:
 * Enums are stored in the constant pool of the class.
 * They are created using the new keyword.
 * They are stored in the heap section of memory.
 * They are garbage collected when they go out of scope.
 * 
 * Example:
 * enum Direction {
 * NORTH, SOUTH, EAST, WEST;
 * }
 */

enum Coffee {
    ESPRESSO("Espresso"), LATTE("Latte"), AMERICANO("Americano"), CAPPUCCINO("Cappuccino");

    private final String name;

    Coffee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Java_Enum {

    public static void main(String[] args) {
        Coffee coffee = Coffee.ESPRESSO;
        System.out.println(coffee.getName());
    }
}

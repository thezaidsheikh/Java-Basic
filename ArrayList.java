
/**
 * ArrayList:
 * An ArrayList is a part of Java Collection Framework. It is a resizable array
 * implementation of the List interface. It is used to store a collection of
 * elements of the same type. It is similar to an array but it can grow and
 * shrink as elements are added or removed.
 *
 * Memory Management:
 * ArrayList is a dynamic array, so it can grow and shrink as elements are
 * added or removed. The ArrayList class manages the size of the array
 * internally. When the ArrayList needs to increase its size, it creates a new
 * array with a larger size and copies the elements from the old array to the
 * new array.
 *
 * Types of ArrayList:
 * ArrayList has two types, they are as follows:
 * 1. Synchronized ArrayList:
 * A synchronized ArrayList is a thread-safe implementation of the ArrayList
 * class. It is used in multi-threaded environments to protect the list from
 * being accessed by multiple threads at the same time.
 * 2. Unsynchronized ArrayList:
 * An unsynchronized ArrayList is a non-thread-safe implementation of the
 * ArrayList class. It is used in single-threaded environments and is faster
 * than synchronized ArrayList.
 *
 * Other related terms of ArrayList:
 * 1. Iterator:
 * An iterator is an object that is used to traverse a collection of objects.
 * It is used to access the elements of the collection one by one.
 * 2. List:
 * A List is an interface that extends the Collection interface. It is used to
 * store a collection of elements of the same type. It is similar to an array
 * but it can grow and shrink as elements are added or removed.
 * 3. Vector:
 * A Vector is a legacy class that is similar to an ArrayList. It is used to
 * store a collection of elements of the same type. It is similar to an array
 * but it can grow and shrink as elements are added or removed.
 *
 * Example:
 * ArrayList<Integer> list = new ArrayList<>();
 * list.add(1);
 * list.add(2);
 * list.add(3);
 * list.add(4);
 * System.out.println("List: " + list);
 */

import java.util.ArrayList;

class ARL {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(null);
        System.out.println("List: " + list);

        // Remove element
        list.remove(2);
        System.out.println("List after removing element: " + list);

        // Remove element by value
        list.remove(Integer.valueOf(4));
        System.out.println("List after removing element by value: " + list);

        // Set element
        list.set(2, 10);
        System.out.println("List after setting element: " + list);

        // Get element
        System.out.println("Element at index 2: " + list.get(2));

        // Size of list
        System.out.println("Size of list: " + list.size());

        // Check if list is empty
        System.out.println("Is list empty: " + list.isEmpty());

        // Clear list
        list.clear();
        System.out.println("List after clearing: " + list);

        // Check if list is empty
        System.out.println("Is list empty: " + list.isEmpty());
    }
}

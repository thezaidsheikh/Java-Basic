import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Collections Framework:
 * - It is a framework that provides a set of classes and interfaces for
 * collection of objects.
 * - It is used to store, retrieve, and manipulate data.
 * - It is used to provide a common interface for different data structures.
 * 
 * Collection (Interface) -
 * - List (Interface) -> ArrayList, LinkedList, Stack, Vector
 * - Queue (Interface) -> PriorityQueue, Deque, ArrayDeque, LinkedList
 * - Set (Interface) -> HashSet, LinkedHashSet, TreeSet, EnumSet
 * - Map (Interface) -> HashMap, LinkedHashMap, TreeMap, EnumMap
 * 
 * Fragmented Memory:
 * - It is a type of memory management where the memory is not contiguous.
 * Fragmented memory refers to the phenomenon where the available memory is
 * non-contiguous, meaning that there are gaps or fragments between used memory
 * spaces. In the context of data structures like arrays, this can lead to
 * inefficient use of memory, as arrays require a contiguous block of memory to
 * store elements.
 * 
 * 
 * LinkedList:
 * - It is a part of Java Collection Framework.
 * - It is a resizable array implementation of the List interface.
 * - It is used to store a collection of elements of the same type.
 * - It is similar to an array but it can grow and shrink as elements are added
 * or removed.
 * - Utilize fragmented memory more efficiently because they do not require
 * contiguous memory allocation
 * - They consist of nodes which can be scattered throughout the memory,
 * connected
 * through pointers or references, thus making better use of fragmented spaces.
 * 
 * Stack:
 * - It is a part of Java Collection Framework.
 * - It is a resizable array implementation of the List interface.
 * - It is used to store a collection of elements of the same type.
 * - It is similar to an array but it can grow and shrink as elements are added
 * or removed.
 * - Use Stack when you need to implement a Last In First Out (LIFO) data
 * - Peek method is used to get the top element of the stack.
 * - Pop method is used to remove the top element of the stack.
 * - Head is the first element of the stack.
 * - Tail is the last element of the stack.
 * 
 */

public class Java_Collections {

    public static void main(String[] args) {
        // Linked List
        System.out.println("=========== Linked List Start ===========");
        LinkedList<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(1);
        linkedlist.add(2);
        linkedlist.add(3);
        linkedlist.add(4);
        linkedlist.add(5);
        linkedlist.addFirst(32);
        linkedlist.addLast(32);
        System.out.println("linkedlist After add: " + linkedlist);
        linkedlist.removeFirst();
        linkedlist.removeLast();
        System.out.println("linkedlist After remove: " + linkedlist);
        System.out.println("Head: " + linkedlist.peekFirst());
        System.out.println("Tail: " + linkedlist.peekLast());
        System.out.println("Size: " + linkedlist.size());
        System.out.println("Peek: " + linkedlist.peek());
        System.out.println("=========== Linked List End ===========");

        // Stack
        System.out.println("=========== Stack Start ===========");
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Stack: " + stack);
        System.out.println("Head: " + stack.peek());
        System.out.println("Tail: " + stack.peek());
        System.out.println("Size: " + stack.size());
        stack.pop();
        System.out.println("Stack After pop: " + stack);
        System.out.println("Head: " + stack.peek());
        System.out.println("Size: " + stack.size());
        System.out.println("=========== Stack End ===========");

    }
}
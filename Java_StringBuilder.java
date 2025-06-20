/**
 * StringBuilder is a mutable sequence of characters. This class is designed
 * for use as a drop-in replacement for StringBuffer in places where the
 * string buffer was being used by a single thread (as opposed to StringBuilder
 * which is safe for use by multiple threads). Where possible, it is
 * recommended that this class be used in preference to StringBuffer as it
 * will be faster and use less memory.
 *
 * StringBuilder is more efficient than StringBuffer because it doesn't have
 * to perform synchronization. StringBuilder is not thread-safe, it is not
 * synchronized, it can be used by multiple threads at the same time, but it
 * is not thread-safe.
 *
 * Thread-safe refers to code that can be safely accessed and manipulated by
 * multiple threads at the same time. This means that the code can be run in
 * multiple threads without causing any problems.
 *
 * A thread is a separate flow of execution. It is a separate path of execution
 * that can be run at the same time as other threads. A thread can be thought of
 * as a separate program that can be run at the same time as other programs.
 * Threads are used to do multiple things at the same time. They are used to
 * make programs run faster.
 *
 * StringBuilder also has a memory management. StringBuilder has a default
 * capacity of 16 characters. When the capacity is exceeded, the StringBuilder
 * will double the capacity. If the new capacity is greater than the maximum
 * capacity, the StringBuilder will throw an OutOfMemoryError.
 *
 * StringBuilder should be used when:
 * - You are working with a single thread.
 * - You don't need to worry about thread safety.
 * - You need to use a mutable string.
 * - You need to use a string that can be modified.
 * - You need to use a string that can be extended.
 * - You need to use a string that can be inserted into.
 * - You need to use a string that can be replaced.
 *
 * The main difference between StringBuilder and StringBuffer is that
 * StringBuilder is not thread-safe while StringBuffer is thread-safe.
 *
 * @author Zaid
 */

public class Java_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Zaid ");
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        sb.insert(5, "Java");
        System.out.println("String Builder: " + sb.toString());
        // Get memory address of string builder
        System.out.println("Memory address of string builder: " + sb.hashCode());
    }
}

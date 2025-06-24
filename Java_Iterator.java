// Iterable and Iterator interfaces are used to traverse a collection of objects.
// Iterable is an interface that is implemented by a collection of objects.
// Iterator is an interface that is used to traverse a collection of objects.
// Iterable interface has a method called iterator() that returns an Iterator object.
// Iterator interface has methods called hasNext() and next() to traverse the collection.
// hasNext() method returns true if the collection has more elements.
// next() method returns the next element in the collection.
// Example:
// ArrayList<Integer> list = new ArrayList<>();
// list.add(1);
// list.add(2);
// list.add(3);
// list.add(4);
// list.add(5);
// Iterator<Integer> iterator = list.iterator();
// while (iterator.hasNext()) {
//     System.out.println(iterator.next());
// }

import java.util.ArrayList;
import java.util.Iterator;

public class Java_Iterator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

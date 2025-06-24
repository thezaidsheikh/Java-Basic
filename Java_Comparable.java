// Comparable interface is used to sort objects.
// Comparator interface is used to compare objects.
// compareTo() method is used to compare objects.
// compare() method is used to compare objects.
// Collections.sort() method is used to sort objects.
// Collections.sort() method uses the natural ordering of the objects to sort them.
// Collections.sort() method uses the comparator to sort the objects.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparator<Student> {
    int id;
    int marks;

    Student(int id, int marks) {
        this.id = id;
        this.marks = marks;
    }

    public int compareTo(Student s) {
        return this.marks - s.marks;
    }

    public int compare(Student s1, Student s2) {
        return s2.marks - s1.marks;
    }
}

public class Java_Comparable {
    public static void main(String[] args) {
        // * ArrayList with normal interger data type

        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // Collections.sort(list);
        // for (Integer i : list) {
        // System.out.println(i);
        // }

        // * ArrayList with Student data type
        ArrayList<Student> list2 = new ArrayList<>();
        list2.add(new Student(1, 90));
        list2.add(new Student(2, 80));
        list2.add(new Student(3, 70));
        list2.add(new Student(4, 60));
        list2.add(new Student(5, 50));
        // Collections.sort(list2);
        Collections.sort(list2, new Student(8, 60));
        for (Student student : list2) {
            System.out.println(student.id + " " + student.marks);
        }
    }
}

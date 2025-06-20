import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java_Stream {

    public static void main(String[] args) {
        // Creating Streams - Java Collections
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Stream<Integer> stream = list.stream();
        // stream.forEach(System.out::println);

        // Creating Streams - Array
        // From Object arrays
        String[] array = new String[] { "a", "b", "c" };
        Stream<String> arrayStream = Arrays.stream(array);

        // From primitive arrays
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        IntStream stream2 = Arrays.stream(arr);
        stream2.forEach(System.out::println);
        System.out.println(stream.map(i -> i > 2).toList());
    }
}
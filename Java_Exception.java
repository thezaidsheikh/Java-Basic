import java.io.File;
import java.util.Scanner;

abstract class CustomError extends Exception {
    int statusCode;

    public CustomError(String message) {
        super(message);
    }
}

class InternelServerException extends CustomError {
    public InternelServerException(String message) {
        super(message);
    }
}

public class Java_Exception {
    public static void main(String[] args) {
        try {
            int[] arr = { 1, 2, 3, 4, 5 };
            // This will throw an unchecked exception
            // arr[10] = 10;
            System.out.println(arr.length);

            // Checked Exception
            // File file = new File("file.txt");
            // Scanner scanner = new Scanner(file);
            // scanner.close();

            // Custom Exception
            InternelServerException internelServerException = new InternelServerException("Internal Server Error");
            throw internelServerException;
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}

import java.io.FileWriter;
import java.io.IOException;

public class Java_FileHandling {

    // read char by char
    // public static void readCharByChar(String filename) {
    // try (FileReader reader = new FileReader(filename)) {
    // int character;
    // while ((character = reader.read()) != -1) {
    // System.out.print((char) character);
    // }
    // } catch (IOException e) {
    // System.out.println("Error reading file: " + e.getMessage());
    // }
    // }

    // read line by line
    // public static void readLineByLine(String filename) {
    // try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
    // String line;
    // int lineNumber = 1;

    // while ((line = reader.readLine()) != null) {
    // System.out.println(lineNumber + ": " + line);
    // lineNumber++;
    // }
    // } catch (FileNotFoundException e) {
    // System.out.println("File not found: " + filename);
    // } catch (IOException e) {
    // System.out.println("Error reading file: " + e.getMessage());
    // }
    // }

    // BASIC WRITE
    public static void writeString(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("HELLO WORLD");
            System.out.println("WRITING IN FILE DONE");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // customizeWrite
    public static void writeString(String filename, String content) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
            System.out.println("WRITING IN FILE DONE");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static void append(String filename, String content) {
        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write(content);
            writer.write("\n");
            System.out.println("WRITING IN FILE DONE");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // readLineByLine("File1.txt");
        append("file1.txt", "RCB VS PUNJAB IN FINAL");
    }
}

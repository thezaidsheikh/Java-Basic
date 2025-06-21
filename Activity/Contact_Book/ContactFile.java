package Activity.Contact_Book;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ContactFile {
    public static boolean createFile(String filePath) throws IOException {
        File file = new File(filePath);
        try {
            if (file.exists()) {
                return true;
            }
            return file.createNewFile();
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
            return false;
        }
    }

    public static void appendToFile(String filePath, ContactBook contact) {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write("***********************************\n");
            writer.write("Name : " + contact.getName().toString() + "\n");
            writer.write("Phone Number : " + contact.getPhoneNumber() + "\n");
            writer.write("Email : " + contact.getEmail().toString() + "\n");
            writer.write("Company : " + contact.getCompany().toString() + "\n");
            writer.write("***********************************\n\n\n");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static String readFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            String content = "";
            while ((line = reader.readLine()) != null) {
                content += line + "\n";
            }
            return content;
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return "";
        }
    }

}

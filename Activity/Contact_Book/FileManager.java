package Activity.Contact_Book;

import java.io.IOException;
import java.util.ArrayList;
// import Activity.Contact_Book.ContactBook;
import java.util.Scanner;

public class FileManager {
    public static void saveContact(ArrayList<ContactBook> contacts) {
        try {
            boolean file = ContactFile.createFile("./Activity/Contact_Book/contacts.txt");
            if (file) {
                for (int i = 0; i < contacts.size(); i++) {
                    ContactFile.appendToFile("./Activity/Contact_Book/contacts.txt", contacts.get(i));
                }
                System.out.println("Contact saved successfully");
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static void getAllContacts() {
        try {
            String content = ContactFile.readFile("./Activity/Contact_Book/contacts.txt");
            System.out.println(content);
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("======================= Welcome to Contact Book =======================");
        System.out.println("Please Select the Option :\n1. Add Contact\n2. View All Contacts\n3. Exit");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        if (option == 1) {
            ArrayList<ContactBook> contacts = new ArrayList<ContactBook>();
            System.out.println("How many contacts do you want to add?");
            int contactLength = sc.nextInt();
            for (int i = 0; i < contactLength; i++) {
                System.out.println("Enter Name");
                String name = sc.nextLine();
                System.out.println("Enter Phone Number");
                long phoneNumber = sc.nextLong();
                System.out.println("Enter Email");
                String email = sc.nextLine();
                System.out.println("Enter Company");
                String company = sc.nextLine();
                ContactBook cb = new ContactBook(name, phoneNumber, email, company);
                contacts.add(cb);
            }
            if (contacts.size() > 0) {
                saveContact(contacts);
            }
        } else if (option == 2) {
            getAllContacts();
        } else if (option == 3) {
            System.out.println("Thank You");
            System.exit(0);
        }
    }
}

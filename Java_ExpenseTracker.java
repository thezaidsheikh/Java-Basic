import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.io.FileWriter;
import java.io.*;

class Expense {
    int amt;
    String cat;
    String note;
    String date;

    Expense(int amt, String cat, String note, String date) {
        this.amt = amt;
        this.cat = cat;
        this.note = note;
        this.date = date;
    }

    public String toString() {
        return amt + " " + cat + " " + note + " " + date;
    }
}

class ExpenseTracker {
    ArrayList<Expense> al = new ArrayList<>();
    Scanner scn = new Scanner(System.in);

    void setUp() {
        loadData();
        System.out.println("=========WELCOME TO EXPENSE TRACKER=====================");
        System.out.println("==========KINDLY SELECT THE OPTION======================");
        while (true) {
            System.out.println("1.ADD EXPENSE");
            System.out.println("2.VIEW ALL EXPENSES");
            System.out.println("3.SHOW TOTAL");
            System.out.println("4.SAVE & EXIT");
            System.out.println("=======================================================");

            String choice = scn.nextLine();

            if (choice.equals("1"))
                addExpense();
            else if (choice.equals("2"))
                viewExpenses();
            else if (choice.equals("3"))
                showTotal();
            else if (choice.equals("4")) {
                saveData();
                break;
            } else
                System.out.println("INVALID CHOICE");
        }
    }

    void addExpense() {
        System.out.println("ENTER THE AMOUNT");
        // int amt=scn.nextInt();
        int amt = Integer.parseInt(scn.nextLine());
        System.out.println("ENTER THE CATEGORY");
        String cat = scn.nextLine();
        System.out.println("ENTER THE NOTE");
        String note = scn.nextLine();
        System.out.println("ENTER THE DATE");
        String date = scn.nextLine();
        Expense e = new Expense(amt, cat, note, date);
        al.add(e);
        System.out.println("=====DATA ADDED SUCCESSFULLY===================");
        System.out.println("=====================================");
    }

    void viewExpenses() {
        if (al.size() == 0) {
            System.out.println("NO EXPENSES YET");
            System.out.println("=====================================");
            return;
        } else {
            System.out.println("========ALL EXPENSES==========");
            System.out.println("AMOUNT       CATEGORY      NOTE     DATE");
            for (int i = 0; i < al.size(); i++) {
                System.out.println(al.get(i));
            }
            System.out.println("=====================================");
        }
    }

    void showTotal() {
        int total = 0;
        for (int i = 0; i < al.size(); i++) {
            total = total + al.get(i).amt;
        }

        System.out.println("TOTAL EXPENSES AMT:" + total);
        System.out.println("NUMBER OF EXPENSES:" + al.size());
        System.out.println("=====================================");
    }

    void loadData() {
        try {
            Scanner filScanner = new Scanner(new File("expense.txt"));
            while (filScanner.hasNextLine()) {
                String line = filScanner.nextLine();
                String[] parts = line.split(" ");
                int amt = Integer.parseInt(parts[0]);
                String cat = parts[1];
                String note = parts[2];
                String date = parts[3];
                Expense e = new Expense(amt, cat, note, date);
                al.add(e);
            }
        } catch (Exception e) {
            System.out.println("ERROR WHILE LAODING DATA" + e);
        }

    }

    void saveData() {
        try (FileWriter writer = new FileWriter("expense.txt")) {
            for (int i = 0; i < al.size(); i++) {
                String content = al.get(i).toString();
                writer.write(content);
                writer.write("\n");
            }
            System.out.println("WRITING IN FILE DONE");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

public class Java_ExpenseTracker {

    public static void main(String[] args) {
        ExpenseTracker et = new ExpenseTracker();
        et.setUp();
    }

}

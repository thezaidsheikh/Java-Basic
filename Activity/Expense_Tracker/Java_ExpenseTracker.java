package Activity.Expense_Tracker;

import java.util.ArrayList;
import java.util.Scanner;
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

class ExpenseTracker<T> {
    ArrayList<T> al = new ArrayList<>();
    Scanner scn = new Scanner(System.in);

    protected void setUp() {
        loadData();
        System.out.println("=========WELCOME TO EXPENSE TRACKER=====================");
        System.out.println("==========KINDLY SELECT THE OPTION======================");
        while (true) {
            System.out.println("1.ADD EXPENSE");
            System.out.println("2.VIEW ALL EXPENSES");
            System.out.println("3.SHOW TOTAL");
            System.out.println("4.Filter");
            System.out.println("5.SAVE & EXIT");
            System.out.println("=======================================================");

            String choice = scn.nextLine();
            System.out.println("You have selected: " + choice);

            if (choice.equals("1"))
                addExpense();
            else if (choice.equals("2"))
                viewExpenses();
            else if (choice.equals("3"))
                showTotal();
            else if (choice.equals("4")) {
                applyFilter();
                break;
            } else if (choice.equals("5")) {
                saveData();
                break;
            } else
                System.out.println("INVALID CHOICE");
        }
    }

    private void addExpense() {
        System.out.println("========================== ADD EXPENSE =============================");
        System.out.print("ENTER THE AMOUNT: ");
        // int amt=scn.nextInt();
        int amt = Integer.parseInt(scn.nextLine());
        System.out.print("ENTER THE CATEGORY: ");
        String cat = scn.nextLine();
        System.out.print("ENTER THE NOTE: ");
        String note = scn.nextLine();
        System.out.print("ENTER THE DATE: ");
        String date = scn.nextLine();
        T e = (T) new Expense(amt, cat, note, date);
        al.add(e);
        System.out.println("===== DATA ADDED SUCCESSFULLY ====================");
        System.out.println("=====================================");
    }

    private void viewExpenses() {
        System.out.println("========================== VIEW EXPENSES =============================");
        if (al.size() == 0) {
            System.out.println("NO EXPENSES YET");
            System.out.println("=====================================");
            return;
        } else {
            System.out.println("AMOUNT\t\tCATEGORY\t\tNOTE\t\tDATE");
            for (int i = 0; i < al.size(); i++) {
                System.out.println(
                        ((Expense) al.get(i)).amt + "\t\t" + ((Expense) al.get(i)).cat + "\t\t"
                                + ((Expense) al.get(i)).note + "\t\t" + ((Expense) al.get(i)).date);
            }
            System.out.println("=====================================");
        }
    }

    private void showTotal() {
        System.out.println("========================== SHOW TOTAL =============================");
        int total = 0;
        for (int i = 0; i < al.size(); i++) {
            total = total + ((Expense) al.get(i)).amt;
        }

        System.out.println("TOTAL EXPENSES AMT:" + total);
        System.out.println("NUMBER OF EXPENSES:" + al.size());
        System.out.println("=====================================");
    }

    private void loadData() {
        try {
            Scanner filScanner = new Scanner(new File("./Activity/Expense_Tracker/expense.txt"));
            while (filScanner.hasNextLine()) {
                String line = filScanner.nextLine();
                String[] parts = line.split(" ");
                int amt = Integer.parseInt(parts[0]);
                String cat = parts[1];
                String note = parts[2];
                String date = parts[3];
                T e = (T) new Expense(amt, cat, note, date);
                al.add(e);
            }
        } catch (Exception e) {
            System.out.println("ERROR WHILE LAODING DATA" + e);
        }

    }

    private void saveData() {
        try (FileWriter writer = new FileWriter("./Activity/Expense_Tracker/expense.txt")) {
            for (int i = 0; i < al.size(); i++) {
                String content = ((Expense) al.get(i)).toString();
                writer.write(content);
                writer.write("\n");
            }
            System.out.println("WRITING IN FILE DONE");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    private void applyFilter() {
        System.out.println("========================== APPLY FILTER =============================");
        System.out.println("Enter the amount to filter with");
        int amount = Integer.parseInt(scn.nextLine());

        System.out.println("AMOUNT\t\tCATEGORY\t\tNOTE\t\tDATE");
        for (int i = 0; i < al.size(); i++) {
            if (((Expense) al.get(i)).amt >= amount) {
                System.out.println(
                        ((Expense) al.get(i)).amt + "\t\t" + ((Expense) al.get(i)).cat + "\t\t"
                                + ((Expense) al.get(i)).note + "\t\t" + ((Expense) al.get(i)).date);
            }
        }
    }
}

public class Java_ExpenseTracker {

    public static void main(String[] args) {
        ExpenseTracker<Expense> et = (ExpenseTracker<Expense>) new ExpenseTracker();
        et.setUp();
    }

}

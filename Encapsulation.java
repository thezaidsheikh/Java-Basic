import java.util.Scanner;

/**
 * Encapsulation in Java:
 * 
 * Encapsulation is a process of combining data and methods in a single unit
 * called class.
 * It is a mechanism of hiding the implementation details of an object from the
 * outside world.
 * It is a fundamental concept of object-oriented programming (OOP).
 * 
 * In encapsulation, the variables of a class are hidden from other classes, and
 * can be accessed only through the methods of their current class.
 * This is known as data hiding.
 * 
 * Advantages of Encapsulation:
 * 1. Data Hiding: The main advantage of encapsulation is that it provides data
 * hiding.
 * 2. Code Reusability: Encapsulation promotes code reusability.
 * 3. Improved Code Readability: Encapsulation makes the code more readable.
 * 4. Improved Code Maintainability: Encapsulation makes the code more
 * maintainable.
 * 
 * Example:
 * 
 * class Student {
 * private int age;
 * 
 * public int getAge() {
 * return age;
 * }
 * 
 * public void setAge(int age) {
 * this.age = age;
 * }
 * }
 * 
 * In the above example, the variable age is hidden from the outside world and
 * can be accessed only through the methods getAge() and setAge().
 * 
 * Terms related to Encapsulation:
 * 
 * 1. Abstraction: Abstraction is the process of showing only the necessary
 * information to the outside world while hiding the implementation details.
 * 2. Data Hiding: Data hiding is the process of hiding the implementation
 * details of an object from the outside world.
 * 3. Information Hiding: Information hiding is the process of hiding the
 * implementation details of an object from the outside world.
 * 4. Access Modifiers: Access modifiers are used to control the access of a
 * class and its members.
 * 5. Constructors: Constructors are special methods that are used to initialize
 * objects.
 * 6. Getters and Setters: Getters and setters are methods that are used to
 * access and modify the state of an object.
 * 
 * 
 * Difference between Abstraction and Encapsulation:
 * 
 * Abstraction is the process of showing only the necessary information to the
 * outside world while hiding the implementation details.
 * Encapsulation is the process of combining data and methods in a single unit
 * called class.
 * 
 * Abstraction and encapsulation are related concepts, but they are not the same
 * thing.
 * Abstraction deals with hiding the implementation details of an object from
 * the outside world.
 * Encapsulation deals with hiding the implementation details of an object from
 * the outside world and combining data and methods in a single unit called
 * class.
 * 
 * Access Modifiers:
 * 
 * Access modifiers are used to control the access of a class and its members.
 * There are four access modifiers in Java: public, private, protected, and
 * default.
 * 
 * 1. Public: The public access modifier is used to make a class and its members
 * accessible to all other classes.
 * 2. Private: The private access modifier is used to make a class and its
 * members accessible only within the same class.
 * 3. Protected: The protected access modifier is used to make a class and its
 * members accessible within the same package and subclasses.
 * 4. Default: The default access modifier is used to make a class and its
 * members accessible within the same package.
 */

class Bank {
    private int accountNumber;
    private int balance;

    // Default constructor
    public Bank() {
        this.accountNumber = (int) (Math.random() * 1000000);
        this.balance = 0;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public String withdraw(int amount) {
        if (balance < amount)
            return "Insufficient balance";
        balance -= amount;
        return "Withdrawal successful";
    }

    public int getBalance() {
        return balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        int accountNumber = bank.getAccountNumber();
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Choose an option\n1. Deposit\n2. Withdraw\n3. Check Balance");
        int option = sc.nextInt();
        if (option == 1) {
            System.out.println("Enter amount to deposit");
            int amount = sc.nextInt();
            bank.deposit(amount);
            System.out.println("Ammount deposited: " + amount + "\nCurrent Balance: " + bank.getBalance());
        } else if (option == 2) {
            System.out.println("Enter amount to withdraw");
            int amount = sc.nextInt();
            System.out.println(bank.withdraw(amount));
            System.out.println("Ammount Withdrawn: " + amount + "\nCurrent Balance: " + bank.getBalance());
        } else if (option == 3) {
            System.out.println("Current Balance: " + bank.getBalance());
        }
    }
}

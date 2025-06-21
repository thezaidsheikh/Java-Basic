package Activity.Contact_Book;

import java.util.Scanner;

public class ContactBook {
    String name;
    long phoneNumber;
    String email;
    String company;

    ContactBook(String name, long phoneNumber, String email, String company) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

}

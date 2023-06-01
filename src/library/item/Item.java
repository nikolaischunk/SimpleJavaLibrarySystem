package library.item;

import library.person.Customer;

import java.util.ArrayList;

public class Item {
    String title;
    boolean isAvailable = true;
    ArrayList<Customer> borrowHistory = new ArrayList<Customer>();

    public Item() {
    }

    public Item(String title) {
        this.title = title;

    }

    public void borrow(Customer customer) {
        borrowHistory.add(customer);
        isAvailable = false;
    }



}

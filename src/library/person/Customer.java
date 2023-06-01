package library.person;

import library.item.Item;

import java.util.ArrayList;

public class Customer extends Person {
    ArrayList<Item> itemsBorrowed = new ArrayList<Item>();
    ArrayList<Item> itemsBorrowedAllTime = new ArrayList<Item>();

    public Customer(String firstName, String lastName, String emailAddress, int age, String street, int number, String city, String postalCode) {
        super(firstName, lastName, emailAddress, age, street, number, city, postalCode);
    }

    public void borrowItem(Item item) {
        itemsBorrowed.add(item);
        itemsBorrowedAllTime.add(item);
    }

    public void returnItem(Item item) {
        itemsBorrowed.remove(item);
    }

    public ArrayList<Item> getItemsBorrowed() {
        return itemsBorrowed;
    }

    public void setItemsBorrowed(ArrayList<Item> itemsBorrowed) {
        this.itemsBorrowed = itemsBorrowed;
    }

    public ArrayList<Item> getItemsBorrowedAllTime() {
        return itemsBorrowedAllTime;
    }

    public void setItemsBorrowedAllTime(ArrayList<Item> itemsBorrowedAllTime) {
        this.itemsBorrowedAllTime = itemsBorrowedAllTime;
    }
}
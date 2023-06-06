package library.person;

import library.item.Item;

import java.util.ArrayList;

public class Customer extends Person {
    ArrayList<Item> itemsBorrowed = new ArrayList<Item>();
    ArrayList<Item> itemsBorrowedAllTime = new ArrayList<Item>();

    public Customer(int id, String firstName, String lastName, String emailAddress, int age, String street, int number, String city, String postalCode) {
        super(id, firstName, lastName, emailAddress, age, street, number, city, postalCode);
    }

    public void borrowItem(Item item) {
        itemsBorrowed.add(item);
        itemsBorrowedAllTime.add(item);
        item.setAvailable(false);
        item.addToBorrowHistory(this);
        item.setCurrentBorrower(this);
    }

    public void returnItem(Item item) {
        itemsBorrowed.remove(item);
        item.setAvailable(true);
        item.setCurrentBorrower(null);
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
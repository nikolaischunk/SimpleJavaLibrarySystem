package library.person;

import library.item.Item;

import java.util.HashSet;

public class Customer extends Person {
    HashSet<Item> itemsBorrowed = new HashSet<Item>();
    HashSet<Item> itemsBorrowedAllTime = new HashSet<Item>();

    public Customer(int id, String firstName, String lastName, String emailAddress, int age, String street, int number, String city, String postalCode) {
        super(id, firstName, lastName, emailAddress, age, street, number, city, postalCode);
    }

    private void addBorrowedItem(Item item) {
        this.itemsBorrowed.add(item);
        this.itemsBorrowedAllTime.add(item);
    }

    public HashSet<Item> getItemsBorrowed() {
        return itemsBorrowed;
    }

    public void borrowItem(Item item) {
        addBorrowedItem(item);
    }

    public void returnItem(Item item) {
        itemsBorrowed.remove(item);
    }
}
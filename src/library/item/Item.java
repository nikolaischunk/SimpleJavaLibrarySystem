package library.item;

import library.person.Customer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static utils.Display.print;
import static utils.Display.spacer;

public abstract class Item {
    int itemId;
    String title;
    boolean isAvailable = true;
    List<Customer> borrowHistory = new ArrayList<Customer>();
    Customer currentBorrower;

    public Item() {
    }

    public Item(int id, String title) {
        this.itemId = id;
        this.title = title;
    }

    public String getItemType() {
        return "Item";
    }

    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public Customer getCurrentBorrower(){
        return this.currentBorrower;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    private void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String isAvailableString() {
        return isAvailable ? "Available" : "Not Available";
    }

    public void addToBorrowHistory(Customer customer) {
        borrowHistory.add(customer);
    }

    public void setCurrentBorrower(Customer currentBorrower) {
        this.currentBorrower = currentBorrower;
    }

    public void displayBorrowHistory() {
        spacer("Borrow History");
        if (this.borrowHistory.isEmpty()) {
            print("No Borrow History");
        } else {
            this.borrowHistory.forEach(customer -> {
                print(customer.getFullName());
            });
        }
        spacer();
    }

    public void displayItem() {
        print("Item ID: " + this.itemId);
        print("Title: " + this.title);
        print("Available: " + this.isAvailableString());
    }

    public void displayItem(boolean detailed) {
        print("Item ID: " + this.itemId);
        print("Title: " + this.title);
        print("Available: " + this.isAvailableString());
        if (detailed) this.displayBorrowHistory();
        if (detailed && !isAvailable) print("Current borrower: " + currentBorrower.getFullName());
    }

    public void borrow(Customer customer) {
        setAvailable(false);
        addToBorrowHistory(customer);
        setCurrentBorrower(customer);
    }

    public void bringBack() {
        this.setAvailable(true);
        this.setCurrentBorrower(null);

    }
}

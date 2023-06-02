package library.item;

import library.person.Customer;

import java.util.ArrayList;

import static utils.Display.print;

public class Item {
    int itemId;
    String title;
    boolean isAvailable = true;
    ArrayList<Customer> borrowHistory = new ArrayList<Customer>();
    Customer currentBorrower;

    public Item() {
    }

    public Item(int id, String title) {
        this.itemId = id;
        this.title = title;
    }

    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public ArrayList<Customer> getBorrowHistory() {
        return borrowHistory;
    }

    public void setBorrowHistory(ArrayList<Customer> borrowHistory) {
        this.borrowHistory = borrowHistory;
    }

    public Customer getCurrentBorrower() {
        return currentBorrower;
    }

    public void setCurrentBorrower(Customer currentBorrower) {
        this.currentBorrower = currentBorrower;
    }

    public void displayItem() {
        print("Item ID: " + itemId);
        print("Title: " + title);
        print("Available: " + isAvailable);
    }
    public void displayItem(boolean detailed){
        print("Item ID: " + itemId);
        print("Title: " + title);
        print("Available: " + isAvailable);
        if(detailed) print("Borrow history: " + borrowHistory);
        if(detailed) print("Current borrower: " + currentBorrower);
    }
}

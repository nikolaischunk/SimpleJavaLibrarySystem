package library;

import library.item.Item;
import library.person.Customer;

import java.util.HashSet;
import java.util.List;

import static utils.Display.*;

public class LibraryMenu {


    private LibraryMenu() {

    }

    public static void displayLoginMenu() {
        print("Display Login Menu");
        print("==== Login Menu ====");
        print("Please enter your user id: ");
    }

    public static void displayCustomerMenu() {
        topSpacer("Customer Terminal Menu");
        print("1. Display Inventory");
        print("2. Display Item Details");
        print("3. Borrow Item");
        print("4. Return Item");
        print("9. Account Overview");
        print("0. Logout");
        bottomSpacer();
        print("Enter your choice: ");
    }

    public static void displayEmployeeMenu() {
        topSpacer("Employee Menu");
        print("1. Display All Customers");
        print("2. Display Inventory");
        print("3. Display Item Details");
        print("4. Display Customer Details");
        print("5. Add Item");
        print("6. Remove Item");
        print("7. Add Customer");
        print("8. Remove Customer");
        print("0. Exit");
        bottomSpacer();
        print("Enter your choice: ");
    }

    public static void displayCustomer() {
        print("Display all Customer");
    }

    public static void displayCustomer(Customer customer) {
        print("Display Customer");
        displayAccountDetails(customer);
    }

    public static void displayItem(Item item) {
        topSpacer("Display Item");
        item.displayItem(true);
        bottomSpacer();
    }

    public static void displayBorrowHistory(Customer customer) {
        print("Display Borrow History");
    }

    public static void displayItemBorrowHistory(Item item) {
        print("Display Item Borrow History");
    }

    public static void displayInventory(HashSet<Item> inventory) {
        topSpacer("Inventory");
        if (!inventory.isEmpty()) {
            for (Item item : inventory) {
                print(item.getItemId() + ") " + item + " - " + item.isAvailableString());
            }
        } else {
            print("Empty");
        }
        bottomSpacer();
    }

    public static void displayCustomerList(List<Customer> customers) {
        topSpacer("Customer List");
        for (Customer customer : customers) {
            print(customer.getId() + ") " + customer);
        }
        bottomSpacer();
    }

    public static void displayAccountDetails(Customer customer) {
        topSpacer("Account");
        print("Name: " + customer.getFullName());
        displayInventory(customer.getItemsBorrowed());
        bottomSpacer();
    }
}

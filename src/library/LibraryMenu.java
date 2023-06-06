package library;

import library.item.Item;
import library.person.Customer;

import java.util.List;

import static utils.Display.print;
import static utils.Display.spacer;

public class LibraryMenu {


    private LibraryMenu() {

    }

    public static void displayLoginMenu() {
        print("Display Login Menu");
        print("==== Login Menu ====");
        print("Please enter your user id: ");
    }

    public static void displayCustomerMenu() {
        spacer(true);
        print("==== Customer Terminal Menu ====");
        spacer("Customer Terminal Menu");
        print("1. Display Inventory");
        print("2. Display Item Details");
        print("3. Borrow Item");
        print("4. Return Item");
        print("0. Exit");
        spacer(false);
        print("Enter your choice: ");
    }

    public static void displayEmployeeMenu() {
        print("==== Employee Menu ====");
        print("1. Display All Customers");
        print("2. Display Inventory");
        print("3. Display Item Details");
        print("4. Display Customer Details");
        print("5. Add Item");
        print("6. Remove Item");
        print("7. Add Customer");
        print("8. Remove Customer");
        print("0. Exit");
        spacer();
        spacer();
        print("Enter your choice: ");
    }

    public static void displayCustomer() {
        print("Display all Customer");
    }

    public static void displayCustomer(Customer customer) {
        print("Display Customer");
    }

    public static void displayItem(Item item) {
        print("Display Item");
        item.displayItem(true);
    }

    public static void displayBorrowHistory(Customer customer) {
        print("Display Borrow History");
    }

    public static void displayItemBorrowHistory(Item item) {
        print("Display Item Borrow History");
    }

    public static void displayInventory(List<Item> inventory) {
        spacer(true);
        for (Item item : inventory) {
            System.out.println(item.getItemId() + ") " + item.toString());
        }
        spacer(false);
    }


}

package library;

import library.item.Item;
import library.person.Customer;

import static utils.Display.print;

public class LibraryMenu {


    private LibraryMenu() {

    }

    public static void displayLoginMenu() {
        print("Display Login Menu");
        print("==== Login Menu ====");
        print("Please enter your user id: ");
    }

    public static void displayCustomerMenu() {
        print("Display Customer Menu");
        print("==== Customer Terminal Menu ====");
        print("1. Display Inventory");
        print("2. Borrow Item");
        print("3. Return Item");
        print("0. Exit");
        print("================================");
        print("Enter your choice: ");
    }

    public static void displayEmployeeMenu() {
        print("Display Employee Menu");
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
        print("=======================");
        print("Enter your choice: ");
    }

    public static void displayCustomer() {
        print("Display all Customer");
    }

    public static void displayCustomer(Customer customer) {
        print("Display Customer");
    }

    public static void displayItem() {
        print("Display Item");
    }

    public static void displayBorrowHistory(Customer customer) {
        print("Display Borrow History");
    }

    public static void displayItemBorrowHistory(Item item) {
        print("Display Item Borrow History");
    }
}

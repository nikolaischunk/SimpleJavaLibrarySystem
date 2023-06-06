package library;

import library.item.Item;
import library.person.Customer;
import library.person.Employee;
import library.person.Person;
import repositories.UserRepository;

import java.util.List;
import java.util.Scanner;

import static library.LibraryMenu.*;
import static utils.Display.print;
import static utils.Util.getInput;

public class LibraryManager {
    private static LibraryManager instance;
    private final Scanner scanner;
    UserRepository userRepository = new UserRepository();
    InventoryManager inventoryManager = new InventoryManager();
    List<Item> inventory = inventoryManager.getInventory();

    private LibraryManager() {
        scanner = new Scanner(System.in);
    }

    // @ singleton
    public static LibraryManager getInstance() {
        if (instance == null) {
            instance = new LibraryManager();
        }
        return instance;
    }


    public void start() {
        print("Start");
        displayMenu();
    }

    public void displayMenu() {
        boolean exitMenu = false;
        boolean isLoggedIn = false;
        Person user = null;
        while (!exitMenu) {
            // login display
            displayLoginMenu();
            int userId = Integer.parseInt(getInput());
            user = userRepository.getUserById(userId);
            if (user == null) {
                print("User not found, please try again");
                continue;
            }
            if (user instanceof Customer) {
                customerFlow((Customer) user);
            } else if (user instanceof Employee) {
                employeeFlow((Employee) user);
            }
        }
    }

    private void customerFlow(Customer customer) {
        boolean exitMenu = false;
        //enhanced switch menu
        while (!exitMenu) {
            displayCustomerMenu();
            int choice = Integer.parseInt(getInput());
            switch (choice) {
                case 1 -> displayInventory(inventory);
                case 2 -> {
                    print("Enter item id: ");
                    int itemId = Integer.parseInt(getInput());
                    Item item = inventoryManager.getItemById(itemId);
                    displayItem(item);
                }
                case 3 -> borrowItem();
                case 4 -> returnItem();
                case 0 -> {
                    print("Exiting...");
                    exitMenu = true;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void employeeFlow(Employee employee) {
        // display employee menu
        //
    }

    public void borrowItem() {
        print("Borrow Item");
    }

    public void returnItem() {
        print("Return Item");
    }

    public void addItem() {
        print("Add Item");
    }

    public void removeItem() {
        print("Remove Item");
    }

    public void addCustomer() {
        print("Add Customer");
    }

    public void removeCustomer() {
        print("Remove Customer");
    }




    /*
        public void borrowItem(Customer customer) {
        borrowHistory.add(customer);
        currentBorrower = customer;
        isAvailable = false;
    }

    public void returnItem() {
        currentBorrower = null;
        isAvailable = true;
    }
    */
}

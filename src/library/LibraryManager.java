package library;

import library.item.Item;
import library.person.Customer;
import library.person.Employee;
import library.person.Person;
import repositories.UserRepository;

import java.util.HashSet;
import java.util.Objects;

import static library.LibraryMenu.*;
import static utils.Display.print;
import static utils.Util.getInput;

public class LibraryManager {
    private static LibraryManager instance;
    Person user;
    UserRepository userRepository = new UserRepository();
    InventoryManager inventoryManager = new InventoryManager();
    CustomerManager customerManager = new CustomerManager();
    HashSet<Item> inventory = inventoryManager.getInventory();

    private LibraryManager() {
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

        while (!exitMenu) {
            // login display
            displayLoginMenu();
            String input = getInput();
            if (Objects.equals(input, "exit")) {
                exitMenu = true;
                continue;
            }
            int userId = Integer.parseInt(input);
            this.user = userRepository.getUserById(userId);
            if (this.user == null) {
                print("User not found, please try again");
                continue;
            }
            print("Welcome back " + user.getFirstName());
            if (this.user instanceof Customer) {
                customerFlow((Customer) user);
            } else if (this.user instanceof Employee) {
                employeeFlow((Employee) user);
            }
        }
    }

    private void customerFlow(Customer customer) {
        boolean exitMenu = false;
        //enhanced switch menu
        while (!exitMenu) {
            displayCustomerMenu();
            int choice;
            try {
                choice = Integer.parseInt(getInput());
            } catch (NumberFormatException e) {
                choice = -1;
            }
            switch (choice) {
                case 1 -> displayInventory(inventory);
                case 2 -> {
                    print("Enter item id: ");
                    int itemId = Integer.parseInt(getInput());
                    Item item = inventoryManager.getItemById(itemId);
                    displayItem(item);
                }
                case 3 -> borrowItem(customer);
                case 4 -> returnItem(customer);
                case 9 -> displayCustomer(customer);
                case 0 -> {
                    print("Exiting...");
                    exitMenu = true;
                }
                default -> print("Invalid choice. Please try again.");
            }
            getInput();
        }
    }

    private void employeeFlow(Employee employee) {
        // display employee menu
        boolean exitMenu = false;
        while (!exitMenu) {
            displayEmployeeMenu();
            int choice = Integer.parseInt(getInput());
            switch (choice) {
                case 1 -> {
                    displayCustomerList(userRepository.getCustomerList());
                }
                case 2 -> displayInventory(inventory);
                case 3 -> {
                    print("Enter item id: ");
                    int itemId = Integer.parseInt(getInput());
                    Item item = inventoryManager.getItemById(itemId);
                    displayItem(item);
                }
                case 4 -> {
                    print("Enter customer id: ");
                    int customerId = Integer.parseInt(getInput());
                    Customer customer = customerManager.getCustomerById(customerId);
                    displayCustomer(customer);
                }
                case 5 -> addItem();
                case 6 -> removeItem();
                case 7 -> addCustomer();
                case 8 -> removeCustomer();
                case 0 -> {
                    print("Exiting...");
                    exitMenu = true;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
            getInput();
        }
    }

    public void borrowItem(Customer customer) {
        print("Borrow Item");
        print("Enter item id: ");
        int itemId = Integer.parseInt(getInput());
        Item item = inventoryManager.getItemById(itemId);
        if (item == null) {
            print("Please enter a valid ItemId.");
        } else if (!item.isAvailable()) {
            print("This item is already borrowed.");
        } else {
            inventoryManager.borrowItem(item, customer);
            print("You borrowed the " + item.getItemType() + " " + item.getTitle());
        }
    }

    public void returnItem(Customer customer) {
        print("Return Item");
        print("Enter item id: ");
        int itemId = Integer.parseInt(getInput());
        Item item = inventoryManager.getItemById(itemId);
        if (item == null) {
            print("Please enter a valid ItemId.");
        } else if (item.isAvailable() || item.getCurrentBorrower() != customer) {
            print("You did not borrow this " + item.getItemType());
        } else {
            inventoryManager.returnItem(item, customer);
            print("You returned the " + item.getItemType() + " " + item.getTitle());
        }
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

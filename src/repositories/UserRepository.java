package repositories;

import library.person.Customer;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private List<Customer> customerList;

    public UserRepository() {
        customerList = new ArrayList<>();
        initializeCustomers();
    }

    private void initializeCustomers() {
        Customer customer1 = new Customer("John", "Doe", "john@example.com", 30, "Main Street", 123, "City", "12345");
        Customer customer2 = new Customer("Jane", "Smith", "jane@example.com", 25, "First Avenue", 456, "Town", "67890");
        Customer customer3 = new Customer("Alice", "Johnson", "alice@example.com", 35, "Oak Road", 789, "Village", "54321");
        Customer customer4 = new Customer("Bob", "Williams", "bob@example.com", 28, "Maple Lane", 987, "County", "13579");
        Customer customer5 = new Customer("Sarah", "Taylor", "sarah@example.com", 32, "Cedar Street", 654, "Hamlet", "97531");

        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
        customerList.add(customer5);
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }
}

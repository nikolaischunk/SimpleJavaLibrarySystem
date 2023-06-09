package repositories;

import library.person.Customer;
import library.person.Employee;
import library.person.Person;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UserRepository {

    private List<Customer> customerList;
    private List<Employee> employeeList;
    private HashSet<Person> people = new HashSet<Person>();

    public UserRepository() {
        customerList = new ArrayList<>();
        employeeList = new ArrayList<>();

        initializeCustomers();
        initializeEmployees();
        people.addAll(customerList);
        people.addAll(employeeList);
    }

    private void initializeCustomers() {
        Customer customer1 = new Customer(1, "John", "Doe", "john@example.com", 30, "Main Street", 123, "City", "12345");
        Customer customer2 = new Customer(2, "Jane", "Smith", "jane@example.com", 25, "First Avenue", 456, "Town", "67890");
        Customer customer3 = new Customer(3, "Alice", "Johnson", "alice@example.com", 35, "Oak Road", 789, "Village", "54321");
        Customer customer4 = new Customer(4, "Bob", "Williams", "bob@example.com", 28, "Maple Lane", 987, "County", "13579");
        Customer customer5 = new Customer(5, "Sarah", "Taylor", "sarah@example.com", 32, "Cedar Street", 654, "Hamlet", "97531");

        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
        customerList.add(customer5);
    }

    private void initializeEmployees() {
        Employee employee1 = new Employee(10, "Admin", "John", "Doe", "j.d@mail.com", 30, "Main Street", 123, "City", "12345");
        Employee employee2 = new Employee(11, "Admin", "Jane", "Smith", "j.s@mail.com", 25, "First Avenue", 456, "Town", "67890");
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public HashSet<Person> getPeople() {
        return people;
    }

    public Person getUserById(int id) {
        for (Person person : customerList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

}

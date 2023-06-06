package library;

import library.person.Customer;
import repositories.UserRepository;

import java.util.List;

public class CustomerManager {
    UserRepository userRepository = new UserRepository();
    List<Customer> customers = userRepository.getCustomerList();

    public CustomerManager() {
    }

    public Customer getCustomerById(int id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }
}

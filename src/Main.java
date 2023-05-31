import shop.Customer;
import shop.VIPCustomer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!\n");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        Customer customer = new VIPCustomer();
        customer.setFirstName("Nikolai");
        customer.setInterests(Arrays.asList("Programming"));

        System.out.println("Customer " + customer.getFirstName() + " loves " + customer.getInterests().get(0));
    }
}
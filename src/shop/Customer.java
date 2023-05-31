package shop;

import java.util.List;

public class Customer {
    private String firstName;
    private List<String> interests;
    private Address address;

    // Empty Constructor
    public Customer() {
    }

    public Customer(String firstName, List<String> interests, Address address) {
        this.firstName = firstName;
        this.interests = interests;
        this.address = address;
    }

    public void returnItem(String item) {
        System.out.println("Customer " + firstName + " returned " + item);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }

    public Address getAddress() {
        return address;
    }
}

package library.person;

import static utils.Util.generateRandomId;

public class Person {
    int id;
    String firstName;
    String lastName;
    String emailAddress;
    int age;
    String street;
    int number;
    String city;
    String postalCode;

    public Person(String firstName, String lastName, String emailAddress, int age, String street, int number, String city, String postalCode) {
        this.id = generateRandomId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.age = age;
        this.street = street;
        this.number = number;
        this.city = city;
        this.postalCode = postalCode;
    }
}

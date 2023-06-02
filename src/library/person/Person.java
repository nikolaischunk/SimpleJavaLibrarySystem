package library.person;

import static utils.Util.generateRandomAge;

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

    public Person(int id, String firstName, String lastName, String emailAddress, int age, String street, int number, String city, String postalCode) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.age = generateRandomAge();
        this.street = street;
        this.number = number;
        this.city = city;
        this.postalCode = postalCode;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }
}

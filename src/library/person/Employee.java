package library.person;

public class Employee extends Person {

    String jobTitle;

    public Employee(int id, String jobTitle, String firstName, String lastName, String emailAddress, int age, String street, int number, String city, String postalCode) {
        super(id, firstName, lastName, emailAddress, age, street, number, city, postalCode);
        this.jobTitle = jobTitle;
    }
}

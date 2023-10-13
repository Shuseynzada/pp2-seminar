package week5.ex8;

public class Person {
    private String firstName;
    private String lastName;
    private String gender;

    // Constructor
    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    // Getter methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    // Setter methods
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // toString() method to provide a string representation of the object
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    // equals() method to compare two Person objects for equality
    public boolean equals(Person p) {
        if (this == p) return true;
        if (p == null || getClass() != p.getClass()) return false;

        Person person = (Person) p;

        if (!firstName.equals(person.firstName)) return false;
        if (!lastName.equals(person.lastName)) return false;
        return gender.equals(person.gender);
    }

    public void Person(String firstName2, String lastName2, String gender2) {
    }
}


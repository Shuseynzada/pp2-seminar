package week5.ex8;

import java.util.Arrays;

public class Teacher extends Person {
    private String department;
    private String[] courses;

    public Teacher(String firstName, String lastName, String gender, String department, String[] courses) {
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }

    // Getter methods
    public String getDepartment() {
        return department;
    }

    public String[] getCourses() {
        return courses;
    }

    // Setter methods
    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public String toString() {
        return "Teacher{" +
                "firstName='" + this.getFirstName() + '\'' +
                ", lastName='" + this.getLastName() + '\'' +
                ", gender='" + this.getGender() + '\'' +
                ", department='" + this.department + '\'' +
                ", courses=" + Arrays.toString(this.courses) +
                '}';
    }
}

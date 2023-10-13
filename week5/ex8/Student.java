package week5.ex8;

public class Student extends Person {
    private int studentId;
    
    public Student(String firstName, String lastName, String gender, int studentId) {
        super(firstName, lastName, gender);
        this.studentId = studentId;
    }

    // Getters
    public int getStudentId() {
        return this.studentId;
    }

    // Setters
    public void setStudentId(int a) {
        this.studentId = a;
    }

    public String toString() {
        return "Student{" +
                "firstName='" + super.getFirstName() + '\'' +
                "lastname='" + this.getLastName() + '\'' +
                ", gender='" + this.getGender() + '\'' +
                ", studentid='" + this.studentId + '\''
                + "}";
    }

    public  boolean equals(Student s){
        if(this == s) return true;
        if(s == null || !super.equals(s)) return false;
        return studentId == s.studentId;
    }
}

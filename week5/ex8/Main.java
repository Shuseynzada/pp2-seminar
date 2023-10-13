package week5.ex8;

public class Main {
    public static void main(String[] args) {
        // Sample data
        Teacher teacher = new Teacher("John", "Doe", "Male", "Math", new String[]{"Math101", "Math201"});
        Student student = new Student("Alice", "Smith", "Female", 12345);
        PhdStudent phdStudent = new PhdStudent("Bob", "Johnson", "Male", 67890, "Computer Science", new String[]{"CS101", "CS202"});

        // Print the objects
        System.out.println(teacher.toString());
        System.out.println(student);
        System.out.println(phdStudent);
    }
}
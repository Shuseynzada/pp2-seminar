package week12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {
    static class Person {
        private int id;
        private String firstName;
        private String lastName;
        private int age;

        // Constructor
        public Person(int id, String firstName, String lastName, int age) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        // Getter methods
        public int getId() {
            return id;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return id + "," + firstName + "," + lastName + "," + age;
        }
    }

    public static void main(String[] args) {
        String inputFilePath = "week12/Resources/input.csv";
        String outputFilePathYoung = "week12/Resources/young.csv";
        String outputFilePathOld = "week12/Resources/old.csv";

        List<Person> persons = readCSV(inputFilePath);
        if (persons.isEmpty()) {
            System.out.println("No records found in the input CSV.");
            return;
        }

        double averageAge = calculateAverageAge(persons);
        System.out.println("Average Age: " + averageAge);

        writeYoungPersons(persons, averageAge, outputFilePathYoung);
        writeOldPersons(persons, averageAge, outputFilePathOld);

    }

    public static List<Person> readCSV(String filePath) {
        List<Person> persons = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    int id = Integer.parseInt(parts[0]);
                    String firstName = parts[1];
                    String lastName = parts[2];
                    int age = Integer.parseInt(parts[3]);
                    persons.add(new Person(id, firstName, lastName, age));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return persons;
    }

    private static void writeYoungPersons(List<Person> persons, double averageAge, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Person person : persons) {
                if (person.getAge() < averageAge) {
                    writer.write(person.toString());
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeOldPersons(List<Person> persons, double averageAge, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Person person : persons) {
                if (person.getAge() >= averageAge) {
                    writer.write(person.toString());
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static double calculateAverageAge(List<Person> persons) {
        if (persons.isEmpty()) {
            return 0.0;
        }

        int totalAge = 0;
        for (Person person : persons) {
            totalAge += person.getAge();
        }

        return (double) totalAge / persons.size();
    }
}

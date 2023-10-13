package week5.ex8;

import java.util.Arrays;


class PhdStudent extends Student {
    private String department;
    private String[] courses;

    public PhdStudent(String firstName, String lastName, String gender, int studentId, String department,
            String[] courses) {
        super(firstName, lastName, gender, studentId);
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment() {
        return department;
    }

    public String[] getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return "PhdStudent{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", studentId=" + getStudentId() +
                ", department='" + department + '\'' +
                ", courses=" + Arrays.toString(courses) +
                '}';
    }

    public boolean equals(PhdStudent pStud) {
        if (this == pStud)
            return true;
        if (pStud == null || getClass() != pStud.getClass())
            return false;
        if (!super.equals(pStud))
            return false;
        PhdStudent phdStudent = (PhdStudent) pStud;
        if (!department.equals(phdStudent.department))
            return false;
        return Arrays.equals(courses, phdStudent.courses);
    }
}
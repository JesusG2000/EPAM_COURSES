package etc.by.task1.entity;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String surname;
    private String initials;
    private int groupNumber;
    private int[] marks;

    public Student(String surname, String initials, int groupNumber, int[] marks) {
        this.surname = surname;
        this.initials = initials;
        this.groupNumber = groupNumber;
        this.marks = marks;
    }

    public String getSurname() {
        return surname;
    }

    public int[] getMarks() {
        return marks;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", initials='" + initials + '\'' +
                ", groupNumber=" + groupNumber +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return groupNumber == student.groupNumber &&
                Objects.equals(surname, student.surname) &&
                Objects.equals(initials, student.initials) &&
                Arrays.equals(marks, student.marks);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(surname, initials, groupNumber);
        result = 31 * result + Arrays.hashCode(marks);
        return result;
    }
}

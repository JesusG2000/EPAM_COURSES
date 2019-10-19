package etc.by.task1.entity;

import java.util.Arrays;

public class University {
   private Student[] students;

    public University(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public Student getStudent(int index){return students[index];}

    public void setStudent(Student student ,int index){students[index]=student;}

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        University that = (University) o;
        return Arrays.equals(students, that.students);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(students);
    }

    @Override
    public String toString() {
        return "University{" +
                "students=" + Arrays.toString(students) +
                '}';
    }
}

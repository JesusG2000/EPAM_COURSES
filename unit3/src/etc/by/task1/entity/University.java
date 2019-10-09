package etc.by.task1.entity;

public class University {
   private Student[] students;

    public University(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}

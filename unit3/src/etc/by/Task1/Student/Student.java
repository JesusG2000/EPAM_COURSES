package etc.by.Task1.Student;

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
}

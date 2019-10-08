package etc.by.Task1.Student;

import java.util.Arrays;

public class StudentLogic {
   private Student []students;

    public StudentLogic(Student[] students) {
        this.students = students;
    }
    public void getStudentWith9Or10(){
        for(int i=0 ; i < students.length;i++){
           if(more8(students[i])){
               System.out.println("Surname: "+students[i].getSurname() +" Group number "+ students[i].getGroupNumber());
               System.out.println(Arrays.toString(students[i].getMarks()));
           }
        }
    }

    private boolean more8(Student student) {
        int []mas=student.getMarks();
        for(int i = 0 ;i< mas.length;i++){
            if(mas[i]!=9 && mas[i]!=10){
                return false;
            }
        }

        return true;
    }
}

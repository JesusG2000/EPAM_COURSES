package etc.by.task1.logic;

import etc.by.task1.entity.Student;
import etc.by.task1.entity.University;

public class UniversityLogic {

    public static Student[] getStudentWith9Or10(University university){
        Student[] studentList;

        Student[]students=university.getStudents();
        studentList=new Student[students.length];

        for(int i=0 ,y=0; i < students.length;i++){
           if(more8(students[i])){
               studentList[y]=students[i];
               y++;
           }
        }
        return studentList;
    }

    private static boolean more8(Student student) {
        int []mas=student.getMarks();
        for(int i = 0 ;i< mas.length;i++){
            if(mas[i]!=9 && mas[i]!=10){
                return false;
            }
        }

        return true;
    }
}

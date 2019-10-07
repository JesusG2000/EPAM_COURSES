package etc.by.Task1;

import etc.by.Task1.Student.Student;
import etc.by.Task1.Student.StudentLogic;

//Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы,
//успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте
//возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
public class StudentTest {
    public static void main(String[] args) {
        Student[] students= new Student[10000];
        int[] marks;
        for(int i =0  ; i<students.length;i++){
            marks = new int[5];
            for(int y=0 ;y < marks.length ;y++){
                marks[y]=(int)(Math.random()*10+1);
            }
            students[i]=new Student(i+"",i+10+"",i+1,marks);
        }
        StudentLogic studentLogic =new StudentLogic(students);
        studentLogic.getStudentWith9Or10();
    }
}

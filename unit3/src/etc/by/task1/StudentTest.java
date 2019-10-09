package etc.by.task1;

import etc.by.task1.logic.UniversityLogic;
import etc.by.task1.entity.Student;
import etc.by.task1.entity.University;

//Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы,
//успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте
//возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
public class StudentTest {
    public static void main(String[] args) {
        University university;
        Student[] students;


        students= new Student[10000];
        int[] marks;
        for(int i =0  ; i<students.length;i++){
            marks = new int[5];
            for(int y=0 ;y < marks.length ;y++){
                marks[y]=(int)(Math.random()*10+1);
            }
            students[i]=new Student(i+"",i+10+"",i+1,marks);
        }
        university=new University(students);
       Student[] studentList= UniversityLogic.getStudentWith9Or10(university);
       for(Student s : studentList) {
           if (s != null) {
               System.out.println(s);
           }
       }
    }
}

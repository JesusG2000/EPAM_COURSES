package etc.linear_program;
//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
//Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
//ННч ММмин SSc.
public class Task22 {
    public static void main(String[] args) {
        int number;
        int hour;
        int min;
        int sec;

        number=166619;

        hour=number/3600;
        number-=3600*hour;
        min=number/60;
        number-=60*min;
        sec=number;

        System.out.println("HH"+hour+" MM"+min+" SS"+sec);
    }
}

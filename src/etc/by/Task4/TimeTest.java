package etc.by.Task4;

import etc.by.Task4.Time.Time;
import etc.by.Task4.Time.TimeLogic;
//Составьте описание класса для представления времени. Предусмотрте возможности установки
//времени и изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых
//значений. В случае недопустимых значений полей поле устанавливается в значение 0. Создать методы
//изменения времени на заданное количество часов, минут и секунд.
public class TimeTest {
    public static void main(String[] args) {
        Time time = new Time(12,39,20);
        TimeLogic timeLogic=new TimeLogic(time);
        timeLogic.changeBySec(40);
        timeLogic.changeByMin(21);
        timeLogic.changeByHour(3);
        timeLogic.showTime();

    }
}

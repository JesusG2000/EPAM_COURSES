package etc.by.Task4;

import etc.by.Task4.Time.Time;

//Составьте описание класса для представления времени. Предусмотрте возможности установки
//времени и изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых
//значений. В случае недопустимых значений полей поле устанавливается в значение 0. Создать методы
//изменения времени на заданное количество часов, минут и секунд.
public class TimeTest {
    public static void main(String[] args) {
        Time time = new Time(12,39,20);

        time.changeBySec(40);
        time.changeByMin(21);
        time.changeByHour(3);

        time.showTime();

    }
}

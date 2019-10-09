package etc.by.task3;

import etc.by.task3.counter.Counter;

//3. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое
//значение на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по
//умолчанию и произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния,
//и метод позволяющее получить его текущее состояние. Написать код, демонстрирующий все
//возможности класса.
public class CounterTest {
    public static void main(String[] args) {
        Counter counter = new Counter(10,5,9);

        counter.increment();
        counter.increment();
        counter.decrement();
        System.out.println("value = " + counter.getValue());
        System.out.println("begin = " + counter.getBegin());
        System.out.println("end = " + counter.getEnd());
    }
}

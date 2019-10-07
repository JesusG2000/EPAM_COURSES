package etc.by.Task2;

import etc.by.Task2.Train.Train;
import etc.by.Task2.Train.TrainLogic;
//Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время
//отправления. Создайте данные в массив из пяти элементов типа Train, добавьте возможность
//сортировки элементов массива по номерам поездов. Добавьте возможность вывода информации о поезде,
//номер которого введен пользователем. Добавьте возможность сортировки массив по пункту назначения,
//причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени
//отправления.
public class TrainTest {
    public static void main(String[] args) {
        Train[] trains = new Train[5];

        String[] place = new String[]{"Vitebsck", "Minsk", "Grodno", "Gomel", "Brest"};
        int[] number = new int[]{1, 2, 3, 4, 5, 6};
        for (int i = 0; i < trains.length; i++) {
            int getPlace = (int) (Math.random() * place.length);
            int getNumber = (int) (Math.random() * number.length);
            int getHour = (int) (Math.random() * 25);
            int getMin = (int) (Math.random() * 61);
            trains[i] = new Train(place[getPlace], number[getNumber], getHour, getMin);
        }
        TrainLogic trainLogic = new TrainLogic(trains);
        trainLogic.getInfo(0);
        System.out.println();

        trainLogic.sortByPlace();
        for (int i = 0; i < trains.length; i++) {
            trainLogic.getInfo(i);
        }
        trainLogic.sortByTrainNumber();
        System.out.println();

        for (int i = 0; i < trains.length; i++) {
            trainLogic.getInfo(i);
        }

    }
}

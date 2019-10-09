package etc.by.task2;

import etc.by.task2.entity.Station;
import etc.by.task2.entity.Train;
import etc.by.task2.logic.StationLogic;
//Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время
//отправления. Создайте данные в массив из пяти элементов типа Train, добавьте возможность
//сортировки элементов массива по номерам поездов. Добавьте возможность вывода информации о поезде,
//номер которого введен пользователем. Добавьте возможность сортировки массив по пункту назначения,
//причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени
//отправления.
public class TrainTest {
    public static void main(String[] args) {
        Train[] trains;
        Station station;
        trains = new Train[5];

        String[] place = new String[]{"Vitebsck", "Minsk", "Grodno", "Gomel", "Brest"};
        int[] number = new int[]{1, 2, 3, 4, 5, 6};
        for (int i = 0; i < trains.length; i++) {
            int getPlace = (int) (Math.random() * place.length);
            int getNumber = (int) (Math.random() * number.length);
            int getHour = (int) (Math.random() * 25);
            int getMin = (int) (Math.random() * 61);
            trains[i] = new Train(place[getPlace], number[getNumber], getHour, getMin);
        }
        station = new Station(trains);

        Train[] trains1 = StationLogic.sortByPlace(station);

        for (Train t : trains1) {
            System.out.println(t);
        }

        Train[] trains2 = StationLogic.sortByTrainNumber(station);

        System.out.println();
        for (Train t : trains2) {
            System.out.println(t);
        }

        System.out.println();
        System.out.println(StationLogic.info(station, 0));
    }
}

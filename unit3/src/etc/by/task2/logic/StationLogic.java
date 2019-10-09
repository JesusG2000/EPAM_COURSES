package etc.by.task2.logic;

import etc.by.task2.entity.Station;
import etc.by.task2.entity.Train;

public class StationLogic {

    public static Train[] sortByTrainNumber(Station station) {
        Train[] trains;

        trains = station.getTrains();

        for (int i = 0; i < trains.length; i++) {
            for (int y = 0; y < trains.length; y++) {
                if (trains[i].getTrainNumber() < trains[y].getTrainNumber()) {
                    Train replace = trains[i];
                    trains[i] = trains[y];
                    trains[y] = replace;
                }
            }
        }
        return trains;
    }


    public static Train info(Station station,int number) {
        return station.getTrains()[number];

    }

    public static Train[] sortByPlace(Station station) {
        Train[] trains;

        trains = station.getTrains();

        for (int i = 0; i < trains.length; i++) {
            for (int y = 0; y < trains.length; y++) {
                if (trains[i].getPlace().toLowerCase().charAt(0) <= trains[y].getPlace().toLowerCase().charAt(0)) {
                    Train replace = trains[i];
                    trains[i] = trains[y];
                    trains[y] = replace;
                }
            }
        }
        for (int i = 0; i < trains.length; i++) {
            for (int y = 0; y < trains.length; y++) {
                if (trains[i].getPlace().equals(trains[y].getPlace())) {
                    int timeFirst = trains[i].getHour() * 60 + trains[i].getMin();
                    int timeSecond = trains[y].getHour() * 60 + trains[y].getMin();
                    if (timeFirst < timeSecond) {
                        Train replace = trains[i];
                        trains[i] = trains[y];
                        trains[y] = replace;
                    }
                }
            }
        }
        return trains;
    }
}

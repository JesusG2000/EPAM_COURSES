package etc.by.task2.entity;

import java.util.Arrays;

public class Station {
    private Train[] trains;

    public Station(Train[] trains) {
        this.trains = trains;
    }

    public Train[] getTrains() {
        return trains;
    }

    public Train getTrain(int index){return trains[index];}

    public void setTrain(Train train ,int index){trains[index]=train;}
    public void setTrains(Train[] trains) {
        this.trains = trains;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Station station = (Station) o;
        return Arrays.equals(trains, station.trains);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(trains);
    }

    @Override
    public String toString() {
        return "Station{" +
                "trains=" + Arrays.toString(trains) +
                '}';
    }
}

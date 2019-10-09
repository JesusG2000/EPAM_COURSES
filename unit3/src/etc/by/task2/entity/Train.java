package etc.by.task2.entity;

import java.util.Objects;

public class Train {
   private String place;
   private int trainNumber;
   private int hour;
   private int min;

   public Train(String place, int trainNumber, int hour, int min) {
        this.place = place;
        this.trainNumber = trainNumber;
        this.hour = hour;
        this.min = min;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    @Override
    public String toString() {
        return "Train{" +
                "place='" + place + '\'' +
                ", trainNumber=" + trainNumber +
                ", hour=" + hour +
                ", min=" + min +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return trainNumber == train.trainNumber &&
                hour == train.hour &&
                min == train.min &&
                Objects.equals(place, train.place);
    }

    @Override
    public int hashCode() {
        return Objects.hash(place, trainNumber, hour, min);
    }
}

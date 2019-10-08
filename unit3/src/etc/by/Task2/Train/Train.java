package etc.by.Task2.Train;

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

    String getPlace() {
        return place;
    }

     int getTrainNumber() {
        return trainNumber;
    }

     int getHour() {
        return hour;
    }

     int getMin() {
        return min;
    }
}

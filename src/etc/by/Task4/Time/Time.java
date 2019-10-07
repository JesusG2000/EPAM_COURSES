package etc.by.Task4.Time;

public class Time {
   private int hour;
   private int min;
   private int sec;

    public Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public Time() {
        this.hour = 0;
        this.min = 0;
        this.sec = 0;
    }

    int getHour() {
        return hour;
    }

    void setHour(int hour) {
        this.hour = hour;
    }

    int getMin() {
        return min;
    }

    void setMin(int min) {
        this.min = min;
    }

    int getSec() {
        return sec;
    }

    void setSec(int sec) {
        this.sec = sec;
    }
}

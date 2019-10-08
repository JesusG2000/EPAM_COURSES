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

    public void changeBySec(int sec) {
        sec+=this.sec;
        int hour = sec / 3600;
        sec -= 3600 * hour;
        int min = sec / 60;
        sec -= 60 * min;
        setTime(hour + this.hour, min + this.min, sec );

    }

    public void changeByMin(int min) {
        min+=this.min;
        int hour = min / 60;
        min -= 60 * hour;
        setTime(hour + this.hour, min , this.sec);

    }

    public void changeByHour(int hour) {
        setTime(hour + this.hour, this.min, this.sec);

    }

    public void setTime(int hour, int min, int sec) {
        if (checkHour(hour)) {
            this.hour=hour;
        } else {
            this.hour=0;
        }
        if (checkMin(min)) {
            this.min=min;
        } else {
            this.min=0;
        }
        if (checkSec(sec)) {
            this.sec=sec;
        } else {
            this.sec=0;
        }
    }

    public void showTime() {
        System.out.println(hour + "." + min + "." + sec);
    }

    private boolean checkHour(int hour) {
        return hour >= 0 && hour <= 23;
    }

    private boolean checkMin(int min) {
        return min >= 0 && min <= 59;
    }

    private boolean checkSec(int sec) {
        return sec >= 0 && sec <= 59;
    }


}

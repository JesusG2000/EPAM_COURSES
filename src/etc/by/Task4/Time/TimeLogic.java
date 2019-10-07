package etc.by.Task4.Time;

public class TimeLogic {
    private Time time;

    public TimeLogic(Time time) {
        this.time = time;
    }
   public void changeBySec(int sec) {
        sec+=time.getSec();
        int hour = sec / 3600;
        sec -= 3600 * hour;
        int min = sec / 60;
        sec -= 60 * min;
        setTime(hour + time.getHour(), min + time.getMin(), sec );

    }

   public void changeByMin(int min) {
        min+=time.getMin();
        int hour = min / 60;
        min -= 60 * hour;
        setTime(hour + time.getHour(), min , time.getSec());

    }

   public void changeByHour(int hour) {
        setTime(hour + time.getHour(), time.getMin(), time.getSec());

    }

   public void setTime(int hour, int min, int sec) {
        if (checkHour(hour)) {
            time.setHour(hour);
        } else {
            time.setHour(0);
        }
        if (checkMin(min)) {
            time.setMin(min);
        } else {
            time.setMin(0);
        }
        if (checkSec(sec)) {
            time.setSec(sec);
        } else {
            time.setSec(0);
        }
    }

   public void showTime() {
        System.out.println(time.getHour() + "." + time.getMin() + "." + time.getSec());
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

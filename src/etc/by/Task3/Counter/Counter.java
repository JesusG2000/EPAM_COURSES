package etc.by.Task3.Counter;

public class Counter {
   private int begin;
   private int end;
   private int value;

    public Counter() {
        this.begin=0;
        this.end=10;
        this.value=0;
    }

    public Counter(int begin, int end, int value) {
        if (begin > end || begin + 10 != end) {
            while (begin + 10 != end) {
                end++;
            }
        }
        if (value >= begin && end >= value) {
            this.value = value;
        } else {
            this.value = begin;
        }
        this.begin = begin;
        this.end = end;
    }

    public int getBegin() {
        return begin;
    }

    public int getEnd() {
        return end;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

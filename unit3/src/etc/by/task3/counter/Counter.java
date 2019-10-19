package etc.by.task3.counter;

import java.util.Objects;

public class Counter {
    private int begin;
    private int end;
    private int value;

    public Counter() {
        this.begin = 0;
        this.end = 10;
        this.value = 0;
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

    public void increment() {
        if (value != end) {
            int number = value;
            number++;
            value = number;
        }
    }

    public void decrement() {
        if (value != begin) {
            int number = value;
            number--;
            value = number;
        }
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Counter counter = (Counter) o;
        return begin == counter.begin &&
                end == counter.end &&
                value == counter.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(begin, end, value);
    }

    @Override
    public String toString() {
        return "Counter{" +
                "begin=" + begin +
                ", end=" + end +
                ", value=" + value +
                '}';
    }
}

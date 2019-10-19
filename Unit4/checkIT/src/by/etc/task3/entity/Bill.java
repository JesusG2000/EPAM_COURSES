package by.etc.task3.entity;

import java.util.Objects;

public class Bill {
    private int number;
    private int money;
    private boolean lock;

    public Bill(int number, int money) {
        this.number = number;
        this.money = money;
        lock = money < 0;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public boolean isLock() {
        return lock;
    }

    public void setLock(boolean lock) {
        this.lock = lock;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "number=" + number +
                ", money=" + money +
                ", isLock=" + lock +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bill bill = (Bill) o;
        return number == bill.number &&
                money == bill.money &&
                lock == bill.lock;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, money, lock);
    }
}

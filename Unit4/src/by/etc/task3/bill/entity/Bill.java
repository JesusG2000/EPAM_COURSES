package by.etc.task3.bill.entity;

public class Bill {
    private int number;
    private int money;
    private boolean isLock;

    public Bill(int number, int money) {
        this.number = number;
        this.money = money;
        isLock= money < 0;
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
        return isLock;
    }

    public void setLock(boolean lock) {
        isLock = lock;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "number=" + number +
                ", money=" + money +
                ", isLock=" + isLock +
                '}';
    }
}

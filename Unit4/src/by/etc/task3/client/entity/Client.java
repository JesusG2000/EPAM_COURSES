package by.etc.task3.client.entity;

import by.etc.task3.bill.entity.Bill;

import java.util.Arrays;

public class Client {
    private Bill []bills;
    private String name;

    public Client(Bill[] bills, String name) {
        this.bills = bills;
        this.name = name;
    }

    public Bill[] getBills() {
        return bills;
    }

    public void setBills(Bill[] bills) {
        this.bills = bills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Client{" +
                "bills=" + Arrays.toString(bills) +
                ", name='" + name + '\'' +
                '}';
    }
}

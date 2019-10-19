package by.etc.task3.entity;

import java.util.Arrays;
import java.util.Objects;

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

    public Bill getBill(int index){return bills[index]; }

    public void setBill(Bill bill , int index){bills[index]=bill;}

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Arrays.equals(bills, client.bills) &&
                Objects.equals(name, client.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = 31 * result + Arrays.hashCode(bills);
        return result;
    }
}

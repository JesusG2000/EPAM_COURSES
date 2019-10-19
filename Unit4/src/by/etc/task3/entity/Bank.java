package by.etc.task3.entity;

import by.etc.task3.entity.Client;

import java.util.Arrays;

public class Bank {
    private Client[] clients;

    public Bank(Client[] clients) {
        this.clients = clients;
    }

    public Client[] getClients() {
        return clients;
    }

    public Client getClient(int index){return clients[index];}

    public void setClient(Client client , int index){clients[index]=client;}

    public void setClients(Client[] clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "clients=" + Arrays.toString(clients) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Arrays.equals(clients, bank.clients);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(clients);
    }
}

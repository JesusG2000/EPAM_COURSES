package by.etc.task3.bank.entity;

import by.etc.task3.client.entity.Client;

import java.util.Arrays;

public class Bank {
    private Client[] clients;

    public Bank(Client[] clients) {
        this.clients = clients;
    }

    public Client[] getClients() {
        return clients;
    }

    public void setClients(Client[] clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "clients=" + Arrays.toString(clients) +
                '}';
    }
}

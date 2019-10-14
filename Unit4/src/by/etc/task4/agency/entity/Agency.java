package by.etc.task4.agency.entity;



import by.etc.task4.client.entity.Client;

import java.util.Arrays;

public class Agency {
   private Client[] clients;

    public Agency(Client[] clients) {
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
        return "Agency{" +
                "clients=" + Arrays.toString(clients) +
                '}';
    }
}

package by.etc.task4.entity;

import java.util.Arrays;

public class Agency {

    private Client[] clients;
    private Trip[] trips;

    public Agency(Client[] clients, Trip[] trips) {
        this.clients = clients;
        this.trips = trips;
    }

    public Client[] getClients() {
        return clients;
    }

    public void setClients(Client[] clients) {
        this.clients = clients;
    }

    public Trip[] getTrips() {
        return trips;
    }

    public void setTrips(Trip[] trips) {
        this.trips = trips;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agency agency = (Agency) o;
        return Arrays.equals(clients, agency.clients) &&
                Arrays.equals(trips, agency.trips);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(clients);
        result = 31 * result + Arrays.hashCode(trips);
        return result;
    }

    @Override
    public String toString() {
        return "Agency{" +
                "clients=" + Arrays.toString(clients) +
                ", trips=" + Arrays.toString(trips) +
                '}';
    }
}

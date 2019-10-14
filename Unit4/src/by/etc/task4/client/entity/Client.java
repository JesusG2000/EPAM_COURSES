package by.etc.task4.client.entity;

import by.etc.task4.trip.entity.Trip;

import java.util.Arrays;
import java.util.Objects;

public class Client {
    private String name;
    private Trip[] trips;

    public Client(String name, Trip[] trips) {
        this.name = name;
        this.trips = trips;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Trip[] getTrips() {
        return trips;
    }

    public void setTrips(Trip[] trips) {
        this.trips = trips;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", trips=" + Arrays.toString(trips) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name) &&
                Arrays.equals(trips, client.trips);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = 31 * result + Arrays.hashCode(trips);
        return result;
    }
}

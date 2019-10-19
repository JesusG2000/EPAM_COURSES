package by.etc.task4.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client {

    private List<Trip> trips;
    private String name;

    public Client(String name) {
        this.name=name;
        trips = new ArrayList<>();
    }

    public List<Trip> getTrips() {
        return trips;
    }

    public Trip getTrip(int index){return trips.get(index);}

    public void setTrip(Trip trip,int index){trips.set(index,trip);}

    public void setTrips(List<Trip> trips) {
        this.trips = trips;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(trips, client.trips) &&
                Objects.equals(name, client.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trips, name);
    }

    @Override
    public String toString() {
        return "Client{" +
                "trips=" + trips +
                ", name='" + name + '\'' +
                '}';
    }
}

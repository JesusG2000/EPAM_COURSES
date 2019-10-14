package by.etc.task4.trip.entity;

import java.util.Objects;

public class Trip {
    private String type;
    private String transport;
    private String food;
    private int days;

    public Trip(String type, String transport, String food, int days) {
        this.type = type;
        this.transport = transport;
        this.food = food;
        this.days = days;
    }
    public Trip(){
        type="rest";
        transport="car";
        food="juice";
        days=7;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "type='" + type + '\'' +
                ", transport='" + transport + '\'' +
                ", food='" + food + '\'' +
                ", days=" + days +
                '}';
    }
// public static void pickType(Agency agency, int clientId, int tripId, String type) {
//        Client[] clients=agency.getClients();
//        Trip[]trips=clients[clientId].getTrips();
//        trips[tripId].setType(type);
//        agency.setClients(clients);
//    }
//
//    public static void pickTransport(Agency agency, int clientId, int tripId, String transport) {
//        Client[] clients=agency.getClients();
//        Trip[]trips=clients[clientId].getTrips();
//        trips[tripId].setTransport(transport);
//        agency.setClients(clients);
//    }
//
//    public static void pickFood(Agency agency, int clientId, int tripId, String food) {
//        Client[] clients=agency.getClients();
//        Trip[]trips=clients[clientId].getTrips();
//        trips[tripId].setFood(food);
//        agency.setClients(clients);
//
//    }
//
//    public static void pickDays(Agency agency, int clientId, int tripId, int days) {
//        Client[] clients=agency.getClients();
//        Trip[]trips=clients[clientId].getTrips();
//        trips[tripId].setDays(days);
//        agency.setClients(clients);
//    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trip trip = (Trip) o;
        return days == trip.days &&
                Objects.equals(type, trip.type) &&
                Objects.equals(transport, trip.transport) &&
                Objects.equals(food, trip.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, transport, food, days);
    }
}

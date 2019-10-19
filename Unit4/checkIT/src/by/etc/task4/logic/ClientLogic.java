package by.etc.task4.logic;

import by.etc.task4.entity.Client;
import by.etc.task4.entity.Trip;

public class ClientLogic {
    public void addTrip(Client client, Trip trip) {
        client.getTrips().add(trip);
    }

    public void removeTrip(Client client, Trip trip) {
        client.getTrips().remove(trip);
    }
}

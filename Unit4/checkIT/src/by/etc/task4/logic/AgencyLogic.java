package by.etc.task4.logic;

import by.etc.task4.entity.Agency;
import by.etc.task4.entity.Client;
import by.etc.task4.entity.Trip;

import java.util.List;


public class AgencyLogic {
    public  void pickType(Agency agency, int clientId, Trip trip) {
        ClientLogic logic =new ClientLogic();
        Client[] clients = agency.getClients();
        logic.addTrip(clients[clientId],trip);
        agency.setClients(clients);
    }

    public  void pickTransport(Agency agency, int clientId, int tripId, String transport) {
        Client[] clients = agency.getClients();
        List<Trip> trips= clients[clientId].getTrips();
        trips.get(tripId).setTransport(transport);
        clients[clientId].setTrips(trips);
        agency.setClients(clients);
    }
//
    public  void pickFood(Agency agency, int clientId, int tripId, String food) {
        Client[] clients = agency.getClients();
        List<Trip> trips= clients[clientId].getTrips();
        trips.get(tripId).setFood(food);
        clients[clientId].setTrips(trips);
        agency.setClients(clients);

    }
//
    public  void pickDays(Agency agency, int clientId, int tripId, int days) {
        Client[] clients = agency.getClients();
        List<Trip> trips= clients[clientId].getTrips();
        trips.get(tripId).setDays(days);
        clients[clientId].setTrips(trips);
        agency.setClients(clients);
    }
//
    public  void sortTripsByDays(Agency agency) {
        Trip[] trips = agency.getTrips();

        for (int i = 0; i < trips.length; i++) {
            for (int y = 0; y < trips.length; y++) {
                if (trips[i].getDays() < trips[y].getDays()) {
                    Trip replace = trips[i];
                    trips[i] = trips[y];
                    trips[y] = replace;
                }
            }
        }
        agency.setTrips(trips);
    }
}


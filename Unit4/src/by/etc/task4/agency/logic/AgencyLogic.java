package by.etc.task4.agency.logic;

import by.etc.task4.agency.entity.Agency;
import by.etc.task4.client.entity.Client;
import by.etc.task4.trip.entity.Trip;


public class AgencyLogic {
    public static void pickType(Agency agency, int clientId, int tripId, String type) {
        Client[] clients = agency.getClients();
        Trip[] trips = clients[clientId].getTrips();
        trips[tripId].setType(type);
        agency.setClients(clients);
    }

    public static void pickTransport(Agency agency, int clientId, int tripId, String transport) {
        Client[] clients = agency.getClients();
        Trip[] trips = clients[clientId].getTrips();
        trips[tripId].setTransport(transport);
        agency.setClients(clients);
    }

    public static void pickFood(Agency agency, int clientId, int tripId, String food) {
        Client[] clients = agency.getClients();
        Trip[] trips = clients[clientId].getTrips();
        trips[tripId].setFood(food);
        agency.setClients(clients);

    }

    public static void pickDays(Agency agency, int clientId, int tripId, int days) {
        Client[] clients = agency.getClients();
        Trip[] trips = clients[clientId].getTrips();
        trips[tripId].setDays(days);
        agency.setClients(clients);
    }

    public static void sortTripsByDays(Client client) {
        Trip[] trips = client.getTrips();

        for (int i = 0; i < trips.length; i++) {
            for (int y = 0; y < trips.length; y++) {
                if (trips[i].getDays() < trips[y].getDays()) {
                    Trip replace = trips[i];
                    trips[i] = trips[y];
                    trips[y] = replace;
                }
            }
        }
        client.setTrips(trips);
    }

}


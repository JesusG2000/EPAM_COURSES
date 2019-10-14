package by.etc.task4;

import by.etc.task4.agency.entity.Agency;
import by.etc.task4.agency.logic.AgencyLogic;
import by.etc.task4.client.entity.Client;
import by.etc.task4.trip.entity.Trip;
//Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного
//типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность выбора
//транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
public class AgencyTest {
    public static void main(String[] args) {
        Trip[] trips=null;
        Client[]clients;
        Agency agency;

        clients=new Client[2];

        for(int i= 0 ; i< clients.length;i++){
            trips=new Trip[2];
            for(int y= 0 ; y < trips.length;y++){
                trips[y]=new Trip();
            }
            clients[i]=new Client(i+"",trips);
        }
        agency=new Agency(clients);



          AgencyLogic.pickFood(agency,0,0,"aaaa");
          AgencyLogic.pickDays(agency,0,0,15);
          AgencyLogic.pickTransport(agency,0,0,"bus");
          AgencyLogic.pickType(agency,0,0,"diving");
         AgencyLogic.sortTripsByDays(clients[0]);
        for(Client c :agency.getClients()){
            System.out.println(c);
        }
    }
}

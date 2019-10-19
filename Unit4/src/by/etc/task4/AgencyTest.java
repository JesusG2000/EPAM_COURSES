package by.etc.task4;

import by.etc.task4.entity.Agency;
import by.etc.task4.logic.AgencyLogic;
import by.etc.task4.entity.Client;
import by.etc.task4.entity.Trip;
//Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного
//типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность выбора
//транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
public class AgencyTest {
    public static void main(String[] args) {
      Trip[]trips;
      Client[]clients;

      Agency agency;
      int counter=0;
      trips=new Trip[5];
      clients=new Client[3];

      for(int i=0 ; i < clients.length;i++){
          clients[i]=new Client(i+"");
      }

      for(Trip t : Trip.values()){
          trips[counter]=t;
          counter++;
      }

      agency=new Agency(clients,trips);
      AgencyLogic logic = new AgencyLogic();

      logic.pickType(agency,0,Trip.CRUISE);
      logic.pickType(agency,1,Trip.TREATMENT);
      logic.pickType(agency,2,Trip.EXCURSION);

      logic.pickDays(agency,0,0,40);
      logic.pickFood(agency,0,0,"eggs");
      logic.pickTransport(agency,0,0,"plane");

      logic.sortTripsByDays(agency);

        for (Trip t:agency.getTrips()) {
            System.out.println(t);
        }
        System.out.println();
        for (Client c:agency.getClients()) {
            System.out.println(c);
        }

    }
}

package by.etc.task3;

import by.etc.task3.entity.Bank;
import by.etc.task3.logic.BankLogic;
import by.etc.task3.entity.Bill;
import by.etc.task3.entity.Client;
// Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
//Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
//имеющим положительный и отрицательный балансы отдельно.
public class BankTest {
    public static void main(String[] args) {
        Bill[] bills;
        Client[] clients;

        Bank bank;
        clients=new Client[4];
        int billNumber=0;

        for(int i = 0 ;i< clients.length;i++){
            bills=new Bill[3];
            for(int y = 0 ;y < bills.length;y++){
                bills[y]=new Bill(billNumber,(int)(Math.random()*1000-300));
                billNumber++;
            }
            clients[i]=new Client(bills,i+"");
        }

        bank=new Bank(clients);
        BankLogic logic =new BankLogic();

        System.out.println(logic.bankNegativeMoney(bank));
        System.out.println(logic.bankPositiveMoney(bank));
        System.out.println(logic.clientMoney(clients[1]));
        System.out.println(logic.findBill(bank,0));
        logic.sortByBillNumber(clients[2]);

    }
}

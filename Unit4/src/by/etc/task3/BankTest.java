package by.etc.task3;

import by.etc.task3.bank.entity.Bank;
import by.etc.task3.bank.logic.BankLogic;
import by.etc.task3.bill.entity.Bill;
import by.etc.task3.client.entity.Client;
// Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
//Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
//имеющим положительный и отрицательный балансы отдельно.
public class BankTest {
    public static void main(String[] args) {
        Bill[] bills;
        Client[] clients=new Client[4];
        Bank bank;
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
        System.out.println(BankLogic.BankNegativeMoney(bank));
        System.out.println(BankLogic.BankPositiveMoney(bank));
        System.out.println(BankLogic.ClientMoney(clients[1]));
        System.out.println(BankLogic.findBill(bank,0));
        BankLogic.sortByBillNumber(clients[2]);

    }
}

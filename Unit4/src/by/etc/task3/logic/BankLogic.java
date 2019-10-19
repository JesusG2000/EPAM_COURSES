package by.etc.task3.logic;

import by.etc.task3.entity.Bank;
import by.etc.task3.entity.Bill;
import by.etc.task3.entity.Client;

import java.util.Arrays;


public class BankLogic {
    public  Client findBill(Bank bank, int number) {
        Client[] clients = bank.getClients();
        Client client = null;
        Bill[] bills;
        for (int i = 0; i < clients.length; i++) {
            bills = clients[i].getBills();

            for (int y = 0; y < bills.length; y++) {
                if (bills[y].getNumber() == number) {
                    client = clients[i];
                    break;
                }
            }
        }
        return client;
    }

    public  void sortByBillNumber(Client client) {
        Bill[] bills = client.getBills();
        for (int i = 0; i < bills.length; i++) {
            for (int y = 0; y < bills.length; y++) {
                if (bills[i].getNumber() < bills[y].getNumber()) {
                    Bill replace = bills[i];
                    bills[i] = bills[y];
                    bills[y] = replace;
                }
            }
        }
        client.setBills(bills);
    }

    public  int clientMoney(Client client) {
        int sum = 0;
        for (Bill b : client.getBills()) {
            sum += b.getMoney();
        }
        return sum;
    }

    public  int bankPositiveMoney(Bank bank) {
        Client[] clients = bank.getClients();
        Bill[] bills;
        int sum = 0;
        for (Client client : clients) {
            bills = client.getBills();
            for (Bill bill : bills) {
                if (bill.getMoney() > 0) {
                    sum += bill.getMoney();
                }
            }
        }
        return sum;

    }public  int bankNegativeMoney(Bank bank) {
        Client[] clients = bank.getClients();
        Bill[] bills;
        int sum = 0;
        for (Client client : clients) {
            bills = client.getBills();
            for (Bill bill : bills) {
                if (bill.getMoney() < 0) {
                    sum += bill.getMoney();
                }
            }
        }
        return sum;
    }
}

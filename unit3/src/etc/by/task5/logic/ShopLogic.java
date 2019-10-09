package etc.by.task5.logic;

import etc.by.task5.entity.Customer;
import etc.by.task5.entity.Shop;

public class ShopLogic {


    public static Customer[] customers(Shop shop) {
        Customer[] customers;

        customers = shop.getCustomers();

        for (int i = 0; i < customers.length; i++) {
            for (int y = 0; y < customers.length; y++) {
                if (customers[i].getName().toLowerCase().charAt(0) < customers[y].getName().toLowerCase().charAt(0)) {
                    Customer replace = customers[i];
                    customers[i] = customers[y];
                    customers[y] = replace;
                }
            }
        }
        return customers;
    }

    public static Customer[] cards(Shop shop, int begin, int end) {
        Customer[] customers;
        Customer[] customerList;

        customers = shop.getCustomers();
        customerList = new Customer[customers.length];

        for (int i = 0, y = 0; i < customers.length; i++) {
            if (customers[i].getCardNumber() >= begin && customers[i].getCardNumber() <= end) {
                customerList[y] = customers[i];
                y++;
            }
        }
        return customerList;
    }

    public static Customer[] customersById(Shop shop, int id) {
        return customerByParameter(shop, id, "id");
    }

    public static Customer[] customersByName(Shop shop, String name) {
        return customerByParameter(shop, name, "name");
    }

    public static Customer[] customersByPatronymic(Shop shop, String patronymic) {
        return customerByParameter(shop, patronymic, "patronymic");
    }

    public static Customer[] customersByAddress(Shop shop, String address) {
        return customerByParameter(shop, address, "address");
    }

    public static Customer[] customersByCardNumber(Shop shop, int cardNumber) {
        return customerByParameter(shop, cardNumber, "cardNumber");
    }

    public static Customer[] customersByBankBillNumber(Shop shop, int bankBillNumber) {
        return customerByParameter(shop, bankBillNumber, "bankBillNumber");
    }

    private static <T> Customer[] customerByParameter(Shop shop, T t, String type) {
        Customer[] customers;
        Customer[] listOfCustomers;

        customers = shop.getCustomers();
        listOfCustomers = new Customer[customers.length];

        for (int i = 0, y = 0; i < customers.length; i++) {
            switch (type) {
                case "id": {
                    if (customers[i].getId() == (int) t) {
                        listOfCustomers[y] = customers[i];
                        y++;
                    }
                    break;
                }
                case "name": {
                    if (customers[i].getName() == t) {
                        listOfCustomers[y] = customers[i];
                        y++;
                    }
                    break;
                }
                case "patronymic": {
                    if (customers[i].getPatronymic() == t) {
                        listOfCustomers[y] = customers[i];
                        y++;
                    }
                    break;
                }
                case "address": {
                    if (customers[i].getAddress() == t) {
                        listOfCustomers[y] = customers[i];
                        y++;
                    }
                    break;
                }
                case "cardNumber": {
                    if (customers[i].getCardNumber() == (int) t) {
                        listOfCustomers[y] = customers[i];
                        y++;
                    }
                    break;
                }
                case "bankBillNumber": {
                    if (customers[i].getBankBillNumber() == (int) t) {
                        listOfCustomers[y] = customers[i];
                        y++;
                    }
                    break;
                }
            }
        }
        return listOfCustomers;
    }
}

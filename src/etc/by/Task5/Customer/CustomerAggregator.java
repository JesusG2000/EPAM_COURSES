package etc.by.Task5.Customer;

public class CustomerAggregator {
    private Customer[] customers;

    public CustomerAggregator(Customer[] customers) {
        this.customers = customers;
    }

    public void showCustomers() {
        for (int i = 0; i < customers.length; i++) {
            for (int y = 0; y < customers.length; y++) {
                if (customers[i].getName().toLowerCase().charAt(0) < customers[y].getName().toLowerCase().charAt(0)) {
                    Customer replace = customers[i];
                    customers[i] = customers[y];
                    customers[y] = replace;
                }
            }
        }
        for (Customer c : customers) {
            System.out.println(c.getName());
        }
    }

    public void showCards(int begin, int end) {
        boolean available = false;
        for (Customer c : customers) {
            if (c.getCardNumber() >= begin && c.getCardNumber() <= end) {
                available = true;
                System.out.println(c.getName() + " " + c.getPatronymic() + " card number =" + c.getCardNumber());
            }
        }
        if (!available) {
            System.out.println("Nobody is found");
        }
    }

    public void showCustomersById(int id) {
        getCustomerByParameter(id, "id");
    }

    public void showCustomersByName(String name) {
        getCustomerByParameter(name, "name");
    }

    public void showCustomersByPatronymic(String patronymic) {
        getCustomerByParameter(patronymic, "patronymic");
    }

    public void showCustomersByAddress(String address) {
        getCustomerByParameter(address, "address");
    }

    public void showCustomersByCardNumber(int cardNumber) {
        getCustomerByParameter(cardNumber, "cardNumber");
    }

    public void showCustomersByBankBillNumber(int bankBillNumber) {
        getCustomerByParameter(bankBillNumber, "bankBillNumber");
    }

    private <T> void getCustomerByParameter(T t, String type) {
        Customer[] listOfCustomers = new Customer[customers.length];
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
        for(int i=0 ;i <listOfCustomers.length;i++) {
            if (listOfCustomers[i] != null) {
                System.out.println(listOfCustomers[i]);
            }
        }
    }
}

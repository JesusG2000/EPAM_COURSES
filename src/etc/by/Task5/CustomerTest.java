package etc.by.Task5;

import etc.by.Task5.Customer.Customer;
import etc.by.Task5.Customer.CustomerAggregator;

// Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и
//get- методы и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с
//подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на
//консоль.
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского
//счета.
//Найти и вывести:
//a) список покупателей в алфавитном порядке;
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
public class CustomerTest {
    public static void main(String[] args) {
        Customer[] customer = new Customer[10];
        String[] name = new String[]{"Ivan", "Petr", "Vova", "Andrew"};
        String[] patronymic = new String[]{"Ivanov", "Sergeyevich"};
        String[] address = new String[]{"Chkalova", "Belorussian"};
        int cardNumber;
        int bankBillNumber;
        for (int i = 0; i < customer.length; i++) {
            int setPatronymic = (int) (Math.random() * patronymic.length);
            int setAddress = (int) (Math.random() * address.length);
            int setName = (int) (Math.random() * name.length);
            cardNumber = (int) (Math.random() * 900 + 100);
            bankBillNumber = (int) (Math.random() * 900 + 100);
            customer[i] = new Customer(i, name[setName], patronymic[setPatronymic], address[setAddress], cardNumber, bankBillNumber);
        }
        CustomerAggregator customerAggregator = new CustomerAggregator(customer);
        customerAggregator.showCustomers();
        customerAggregator.showCards(100, 200);
        customerAggregator.showCustomersByAddress("Chkalova");
    }
}

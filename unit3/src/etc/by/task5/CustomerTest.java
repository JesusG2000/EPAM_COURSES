package etc.by.task5;

import etc.by.task5.entity.Customer;
import etc.by.task5.entity.Shop;
import etc.by.task5.logic.ShopLogic;

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
        Customer[] customer;
        Shop shop;
        int cardNumber;
        int bankBillNumber;

        String[] name = new String[]{"Ivan", "Petr", "Vova", "Andrew"};
        String[] patronymic = new String[]{"Ivanov", "Sergeyevich"};
        String[] address = new String[]{"Chkalova", "Belorussian"};
        customer = new Customer[10];

        for (int i = 0; i < customer.length; i++) {
            int setPatronymic = (int) (Math.random() * patronymic.length);
            int setAddress = (int) (Math.random() * address.length);
            int setName = (int) (Math.random() * name.length);
            cardNumber = (int) (Math.random() * 900 + 100);
            bankBillNumber = (int) (Math.random() * 900 + 100);
            customer[i] = new Customer(i, name[setName], patronymic[setPatronymic], address[setAddress], cardNumber, bankBillNumber);
        }

        shop = new Shop(customer);
        Customer[] customers1 = ShopLogic.cards(shop, 100, 500);

        for (Customer c : customers1) {
            if (c != null) {
                System.out.println(c);
            }
        }
    }
}

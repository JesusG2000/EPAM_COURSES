package etc.by.Task5.Customer;

public class Customer {
    private int id;
    private String name;
    private String patronymic;
    private String address;
    private int cardNumber;
    private int bankBillNumber;

    public Customer(int id, String name, String patronymic, String address, int cardNumber, int bankBillNumber) {
        this.id = id;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.cardNumber = cardNumber;
        this.bankBillNumber = bankBillNumber;
    }

     int getId() {
        return id;
    }

     String getName() {
        return name;
    }

     String getPatronymic() {
        return patronymic;
    }

     String getAddress() {
        return address;
    }

     int getCardNumber() {
        return cardNumber;
    }

     int getBankBillNumber() {
        return bankBillNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", cardNumber=" + cardNumber +
                ", bankBillNumber=" + bankBillNumber +
                '}';
    }
}

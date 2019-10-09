package etc.by.task5.entity;

import java.util.Objects;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getBankBillNumber() {
        return bankBillNumber;
    }

    public void setBankBillNumber(int bankBillNumber) {
        this.bankBillNumber = bankBillNumber;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id &&
                cardNumber == customer.cardNumber &&
                bankBillNumber == customer.bankBillNumber &&
                Objects.equals(name, customer.name) &&
                Objects.equals(patronymic, customer.patronymic) &&
                Objects.equals(address, customer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, patronymic, address, cardNumber, bankBillNumber);
    }
}

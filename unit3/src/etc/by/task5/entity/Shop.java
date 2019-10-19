package etc.by.task5.entity;

import java.util.Arrays;

public class Shop {
    private Customer[] customers;

    public Shop(Customer[] customers) {
        this.customers = customers;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public Customer getCustomer(int index){return customers[index];}

    public void setCustomer(Customer customer ,int index){customers[index]=customer;}

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return Arrays.equals(customers, shop.customers);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(customers);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "customers=" + Arrays.toString(customers) +
                '}';
    }
}

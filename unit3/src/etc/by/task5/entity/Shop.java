package etc.by.task5.entity;

public class Shop {
    private Customer[] customers;

    public Shop(Customer[] customers) {
        this.customers = customers;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }
}

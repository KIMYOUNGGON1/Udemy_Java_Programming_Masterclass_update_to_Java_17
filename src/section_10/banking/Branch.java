package section_10.banking;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String nameOfCustomer, double initialTransaction) {
        if (findCustomer(nameOfCustomer) == null) {
            customers.add(new Customer(nameOfCustomer, initialTransaction));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String nameOfCustomer, double transaction) {
        if (findCustomer(nameOfCustomer) != null) {
            findCustomer(nameOfCustomer).addTransaction(transaction);
            return true;
        }
        return false;
    }

    public Customer findCustomer(String nameOfCustomer) {
        for (var customer : customers) {
            if (customer.getName().equalsIgnoreCase(nameOfCustomer)) {
                return customer;
            }
        }
        return null;
    }
}

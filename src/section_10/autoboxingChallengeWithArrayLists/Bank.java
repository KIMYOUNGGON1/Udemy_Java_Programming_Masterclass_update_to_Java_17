package section_10.autoboxingChallengeWithArrayLists;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public boolean addCustomer(String name) {
        if (findCustomer(name) == null) {
            customers.add(new Customer(name));
            return true;
        }
        return false;
    }

    public boolean addTransaction(String name, double amount) {
        Customer customer = findCustomer(name);
        if (customer != null) {
            customer.addTransaction(amount);
            return true;
        }
        return false;
    }

    public void printCustomerTransactions(String customerName) {
        Customer customer = findCustomer(customerName);
        if (customer != null) {
            System.out.println("Transactions for customer " + customer.getName() + ":");
        }
    }
    private Customer findCustomer(String name) {
        for (Customer customer : customers) {
            if (customer.getName().equals(name)) {
                return customer;
            }
        }
        return null;
    }
}

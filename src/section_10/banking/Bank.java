package section_10.banking;

import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions) {
    public Customer {

    }
}

public class Bank {
    private String name;
    private ArrayList<Branch> branches = new ArrayList<>();
}

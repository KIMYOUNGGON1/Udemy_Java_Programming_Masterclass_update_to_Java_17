package section_11.abstractClassChallenge;

import java.util.ArrayList;

public abstract class ProductForSale {
    private String type;
    private double price;
    private String description;


    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int quantity) {
        return price * quantity;
    }

    public void printPricedLineItem() {
        ArrayList<OrderItem> itemArrayList = new ArrayList<>();
        for (var item : itemArrayList) {
            System.out.println(item.getClass().getSimpleName() + " ( " + type + " ) " );
        }
    }

    public abstract void showDetails();
}

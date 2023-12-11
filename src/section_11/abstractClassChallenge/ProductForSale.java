package section_11.abstractClassChallenge;

import java.util.ArrayList;

public abstract class ProductForSale {
    private String type;
    private int price;
    private String description;

    public ProductForSale(String type, int price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public int getSalesPrice(int quantity) {
        return price * quantity;
    }

    public void printPricedLineItem(int quantity) {
        ArrayList<String> itemArrayList = new ArrayList<>();
        for (String item : itemArrayList) {
            System.out.println("The item is this and price is this.");
        }
    }

    public abstract void showDetails();
}

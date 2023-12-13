package section_11.abstractClassChallenge;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private final List<ProductForSale> products = new ArrayList<>();
    private final List<OrderItem> order = new ArrayList<>();

    public static void main(String[] args) {

    }

    private void setUpStore() {
        products.add(new Snack("Chips", 1.50, "Potato chips"));
    }

    public void addOrderItem(OrderItem item) {
        order.add(item);
    }

    public void printReceipt() {
        for (OrderItem item : order) {
            item.getProductForSale().printPricedLineItem(item.getQuantity());
        }
    }
}

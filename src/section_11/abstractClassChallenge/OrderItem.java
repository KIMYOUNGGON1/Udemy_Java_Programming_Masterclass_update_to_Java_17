package section_11.abstractClassChallenge;

public class OrderItem {
    private final int quantity;
    private final ProductForSale productForSale;

    public OrderItem(int quantity, ProductForSale productForSale) {
        this.quantity = quantity;
        this.productForSale = productForSale;
    }

    public int getQuantity() {
        return quantity;
    }

    public ProductForSale getProductForSale() {
        return productForSale;
    }
}

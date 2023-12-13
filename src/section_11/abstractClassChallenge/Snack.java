package section_11.abstractClassChallenge;

public class Snack extends ProductForSale{

    public Snack(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Product Type: " + getClass().getSimpleName() +
                ", Description: " + ", Price: $" + getSalesPrice(1));
    }
}

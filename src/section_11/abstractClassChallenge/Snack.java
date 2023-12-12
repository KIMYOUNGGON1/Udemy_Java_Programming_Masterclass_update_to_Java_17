package section_11.abstractClassChallenge;

public class Snack extends ProductForSale{

    public Snack(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("The product type is " + getClass().getSimpleName() +
                " and the price of the product is " );
    }
}

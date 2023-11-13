package sectoin_8;

public class Hamburger {
    private String burgerType;
    private int price;
    private int topping;
    private boolean addTopping;
    private String kindOfTopping;

    public Hamburger(String burgerType, int price) {
        this.burgerType = burgerType;
        this.price = price;
        this.topping = 0;
        this.addTopping = false;
        this.kindOfTopping = "BASIC";
    }

    public void orderHamburger() {
        System.out.println(this.topping + getClass().getSimpleName() +
                " is ordering by customer.");
    }

    public boolean addingTopping(boolean customerChoose) {
        if (customerChoose) {
            this.addTopping = true;
        }

        return this.addTopping;
    }
}

class chickenBurger extends Hamburger {
    public chickenBurger(String burgerType, int price) {
        super(burgerType, price);
    }
}

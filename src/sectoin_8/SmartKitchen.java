package sectoin_8;

public class SmartKitchen extends Kitchen{
    private CoffeeMaker coffeeMaker;
    private DishWasher dishWasher;
    private Refrigerator refrigerator;

    public SmartKitchen(boolean hasWorkToDo, CoffeeMaker coffeeMaker, DishWasher dishWasher, Refrigerator refrigerator) {
        super(hasWorkToDo);
        this.coffeeMaker = coffeeMaker;
        this.dishWasher = dishWasher;
        this.refrigerator = refrigerator;
    }

    public void addWater() {
        coffeeMaker.setHasWorkToDo();
    }

    public void pourMilk() {
        refrigerator.setHasWorkToDo();
    }

    public void loadDishWasher() {
        dishWasher.setHasWorkToDo();
    }

    public void setKitchenState() {
        coffeeMaker.setHasWorkToDo();
        refrigerator.setHasWorkToDo();
        dishWasher.setHasWorkToDo();
    }

    public void doKitchenWork() {
        if (coffeeMaker.isHasWorkToDo() && refrigerator.isHasWorkToDo() &&
                dishWasher.isHasWorkToDo()) {
            System.out.println();
        }
    }
}



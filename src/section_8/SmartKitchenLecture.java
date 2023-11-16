package section_8;

public class SmartKitchenLecture {
    private CoffeeMakerLecture brewMaster;
    private RefrigeratorLecture iceBox;
    private DishWasherLecture dishWasherLecture;

    public SmartKitchenLecture() {
        brewMaster = new CoffeeMakerLecture();
        iceBox = new RefrigeratorLecture();
        dishWasherLecture = new DishWasherLecture();
    }

    public CoffeeMakerLecture getBrewMaster() {
        return brewMaster;
    }

    public RefrigeratorLecture getIceBox() {
        return iceBox;
    }

    public DishWasherLecture getDishWasherLecture() {
        return dishWasherLecture;
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag) {
        brewMaster.setHasWorkToDo(coffeeFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
        dishWasherLecture.setHasWorkToDo(dishWasherFlag);
    }

    public void doKitchenWork() {
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasherLecture.doDishes();
    }
}

class CoffeeMakerLecture {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("Brewing Coffee");
            hasWorkToDo = false;
        }
    }
}

class RefrigeratorLecture {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Ordering Food");
            hasWorkToDo = false;
        }
    }
}

class DishWasherLecture {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Washing Dishes");
            hasWorkToDo = false;
        }
    }
}
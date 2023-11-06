package sectoin_8;

public class Kitchen {
    private boolean hasWorkToDo;

    public Kitchen(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}

class Refrigerator extends Kitchen {
    private boolean hasWorkToDo;

    public Refrigerator(boolean hasWorkToDog, boolean hasWorkToDo) {
        super(hasWorkToDog);
        this.hasWorkToDo = hasWorkToDo;
    }

    public void setHasWorkToDo() {
        this.hasWorkToDo = true;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void orderFood() {
        if (isHasWorkToDo()) {
            System.out.println("The Refrigerator's work is being done.");
        }
    }
}

class DishWasher extends Kitchen {
    private boolean hasWorkToDo;

    public DishWasher(boolean hasWorkToDo, boolean hasWorkToDo1) {
        super(hasWorkToDo);
        this.hasWorkToDo = hasWorkToDo1;
    }

    public void setHasWorkToDo() {
        this.hasWorkToDo = true;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void doDishes() {
        if (isHasWorkToDo()) {
            System.out.println("The DishWasher's work is being done.");
        }
    }
}

class CoffeeMaker extends Kitchen {
    private boolean hasWorkToDo;

    public CoffeeMaker(boolean hasWorkToDo, boolean hasWorkToDo1) {
        super(hasWorkToDo);
        this.hasWorkToDo = hasWorkToDo1;
    }

    public void setHasWorkToDo() {
        this.hasWorkToDo = true;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void brewCoffee() {
        if (isHasWorkToDo()) {
            System.out.println("The CoffeMaker's work is being done.");
        }
    }
}

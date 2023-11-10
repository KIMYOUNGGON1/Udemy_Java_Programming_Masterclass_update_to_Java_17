package sectoin_8;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("The Engine is started!");
    }

    public void drive() {
        System.out.println("A driver drive the car now!");
    }

    protected void runEngine() {
        System.out.println("The Car class runEngine method is operate");
    }
}

class GasPowerdCar extends Car {
    private double avgKmPerLiter;
    private int cylinders;

    public GasPowerdCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }
}

class ElectricCar extends Car {
    private double avgKmPerLiter;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerLiter, int batterySize) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
    }
}

class HybridCar extends Car {
    private double avgKmPerLiter;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, double avgKmPerLiter, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }
}

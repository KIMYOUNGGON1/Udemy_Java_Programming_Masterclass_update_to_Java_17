package sectoin_8;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("The " + description + "Engine is started!");
    }

    public void drive() {
        System.out.println(description + " driver drive the car now!");
    }

    protected void runEngine() {
        System.out.println("The " + description + "Car runEngine method is operate");
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

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println(cylinders + "make sound");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println(avgKmPerLiter + "can go");
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("engine is started");
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

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Electric Car is silence");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("electric car is move.");
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("The battery size is " + batterySize);
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

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Hybrid Car is less make noise than normal car.");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Driver drive hybrid car now");
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("hybrid car make sound");
    }
}

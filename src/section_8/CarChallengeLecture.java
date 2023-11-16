package section_8;

public class CarChallengeLecture {
    private String description;

    public CarChallengeLecture(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Car -> startEngine");
    }

    protected void runEngine() {
        System.out.println("Car -> runEngine");
    }

    public void drive() {
        System.out.println("Car -> driving, type is " + getClass().getSimpleName());
        runEngine();

    }
}

class GasPoweredCarLecture extends CarChallengeLecture {
    private double avgKmPerLiter;
    private int cylinders = 6;

    public GasPoweredCarLecture(String description) {
        super(description);
    }

    public GasPoweredCarLecture(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLiter);
    }
}

class ElectricCarLecture extends CarChallengeLecture {
    private double avgKmPerCharge;
    private int batterySize = 6;

    public ElectricCarLecture(String description) {
        super(description);
    }

    public ElectricCarLecture(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("BEV -> switch %d KWh battery on, Ready!%n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("BEV -> usage under the average: %.2f %n", avgKmPerCharge);
    }
}

class HybridCarLecture extends CarChallengeLecture {
    private double avgKmPerLiter;
    private int cylinders = 6;
    private int batterySize;

    public HybridCarLecture(String description) {
        super(description);
    }

    public HybridCarLecture(String description, double avgKmPerLiter, int cylinders,
                            int batterySize) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> %d cylinders are fired up.%n", cylinders);
        System.out.printf("Hybrid -> switch %d KWh battery on, Ready%n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> usage below average: %.2f %n", avgKmPerLiter);
    }
}

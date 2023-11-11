package sectoin_8;

public class PolymorphismChallenge {
    public static void main(String[] args) {
        CarChallengeLecture car = new CarChallengeLecture("2022 Blue Ferrari 296 GTS");
        runRace(car);
    }

    public static void runRace(CarChallengeLecture car) {
        car.startEngine();
        car.drive();
    }
}

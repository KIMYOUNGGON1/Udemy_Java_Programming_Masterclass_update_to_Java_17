package section_8;

public class PolymorphismChallenge {
    public static void main(String[] args) {
        CarChallengeLecture car = new CarChallengeLecture("2022 Blue Ferrari 296 GTS");
        runRace(car);

        CarChallengeLecture ferrari =
                new ElectricCarLecture("2022 Blue Ferrari 296 GTS", 15.4, 6);
        runRace(ferrari);

        CarChallengeLecture tesla =
                new ElectricCarLecture("2022 Red Tesla Model 3", 568, 75);
        runRace(tesla);

        CarChallengeLecture ferrariHybrid = new HybridCarLecture("2022 Black Ferrari SF90 Stradale",
                16, 8, 8);
        runRace(ferrariHybrid);
    }

    public static void runRace(CarChallengeLecture car) {
        car.startEngine();
        car.drive();
    }
}

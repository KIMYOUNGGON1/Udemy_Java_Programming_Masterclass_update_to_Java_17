package section_11.interface_lecture;

public interface FlightEnabled {

    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;
    void takeOff();

    void land();

    void fly();

    default FlightStages transition(FlightStages stages) {
//        System.out.println("transition not implemented on " + getClass().getName());
//        return null;

        FlightStages nextStage = stages.getNextStage();
        System.out.println("Transitioning from " + stages + " to " + nextStage);
        return nextStage;
    }
}

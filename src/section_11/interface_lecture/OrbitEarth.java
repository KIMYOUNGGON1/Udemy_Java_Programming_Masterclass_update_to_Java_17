package section_11.interface_lecture;

interface OrbitEarth extends FlightEnabled {
    void achieveOrbit();

    private static void log(String description) {
        var today = new java.util.Date();
        System.out.println(today + ": " + description);
    }

    private void logStage(FlightStages stage, String description) {

        description = stage + ": " + description;
        log(description);
    }

    @Override
    default FlightStages transition(FlightStages stages) {

        FlightStages nextStage = FlightEnabled.super.transition(stages);
        logStage(stages, "Beginning Transition to " + nextStage);
        return nextStage;
    }
}

package sectoin_8;

public class CompositionChallengeLecture {
    public static void main(String[] args) {
        SmartKitchenLecture kitchenLecture = new SmartKitchenLecture();

//        kitchenLecture.getDishWasherLecture().setHasWorkToDo(true);
//        kitchenLecture.getIceBox().setHasWorkToDo(true);
//        kitchenLecture.getBrewMaster().setHasWorkToDo(true);
//
//        kitchenLecture.getDishWasherLecture().doDishes();
//        kitchenLecture.getIceBox().orderFood();
//        kitchenLecture.getBrewMaster().brewCoffee();

        kitchenLecture.setKitchenState(true, false, true);
        kitchenLecture.doKitchenWork();
    }
}

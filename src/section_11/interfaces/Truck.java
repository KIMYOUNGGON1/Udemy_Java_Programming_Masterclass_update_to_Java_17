package src.section_11.interfaces;

public class Truck implements Trackable{
    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s coordinates recorded");
    }
}

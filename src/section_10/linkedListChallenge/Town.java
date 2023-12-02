package section_10.linkedListChallenge;

public class Town {
    private String placeName;
    private int distance;

    public Town(String placeName, int distance) {
        this.placeName = placeName;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Town : " + placeName + " / Distance from Sydney (in Km) : " + distance;
    }
}

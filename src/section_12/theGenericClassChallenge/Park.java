package section_12.theGenericClassChallenge;

public class Park extends Point{
    private String name;
    private String type;
    private Location googledLocations;

    public Park(String name, String type, Location googledLocations) {
        this.name = name;
        this.type = type;
        this.googledLocations = googledLocations;
    }
}

package section_12.theGenericClassChallenge;

public class Park extends Point{
    private String name;
    private String type;
    private String googledLocations;

    public Park(String name, String type, String googledLocations) {
        this.name = name;
        this.type = type;
        this.googledLocations = googledLocations;
    }
}

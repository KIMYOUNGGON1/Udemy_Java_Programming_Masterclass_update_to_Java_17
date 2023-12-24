package section_12.theGenericClassChallenge;

import java.util.ArrayList;
import java.util.List;

public class River extends Line{
    private String name;
    private String type;
    private List<Location> googledLocations = new ArrayList<>();

    public River(String name, String type, List<Location> googledLocations) {
        this.name = name;
        this.type = type;
        this.googledLocations = googledLocations;
    }


}

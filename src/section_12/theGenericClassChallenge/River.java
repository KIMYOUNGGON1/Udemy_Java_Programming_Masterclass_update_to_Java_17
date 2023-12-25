package section_12.theGenericClassChallenge;

import java.util.ArrayList;
import java.util.List;

public class River extends Line{
    private String name;
    private String riverType;
    private List<Location> googledLocations = new ArrayList<>();

    public River(String name, String riverType, List<Location> googledLocations) {
        this.name = name;
        this.riverType = riverType;
        this.googledLocations = googledLocations;
    }


}

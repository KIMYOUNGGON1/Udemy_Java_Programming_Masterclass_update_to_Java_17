package section_11.theInterfaceChallenge;

public class Building implements Mappable{
    private String name;
    private String usage;

    public Building(String name, String usage) {
        this.name = name;
        this.usage = usage;
    }

    @Override
    public String getLabel() {
        return name + " (" + usage + ")";
    }

    @Override
    public String getGeometryType() {
        return "POINT";
    }

    @Override
    public String getIconType() {
        return "RED STAR";
    }

    @Override
    public String toJSON() {
        return String.format(JSON_PROPERTY, String.join(", ",
                "\"type\": \"" + getGeometryType() + "\"",
                "\"label\": \"" + getLabel() + "\"",
                "\"marker\": \"" + getIconType() + "\"",
                "\"name\": \"" + name + "\"",
                "\"usage\": \"" + usage + "\""));
    }
}

package section_11.theInterfaceChallenge;

public class UtilityLine implements Mappable{
    private String name;
    private String usage;

    public UtilityLine(String name, String usage) {
        this.name = name;
        this.usage = usage;
    }

    @Override
    public String getLabel() {
        return name + " (" + usage + ")";
    }

    @Override
    public String getGeometryType() {
        return "LINE";
    }

    @Override
    public String getIconType() {
        return "GREEN DOTTED";
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

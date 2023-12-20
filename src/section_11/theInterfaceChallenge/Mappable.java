package section_11.theInterfaceChallenge;

public interface Mappable {
    String JSON_PROPERTY = "\"properties\":{%s}";
    String getLabel();

    String getGeometryType();

    String getIconType();

    default String toJSON() {
        return String.format(JSON_PROPERTY, String.join(", ",
                "\"type\": \"" + getGeometryType() + "\"",
                "\"label\": \"" + getLabel() + "\"",
                "\"marker\": \"" + getIconType() + "\""));
    }

    static String getProperties(Mappable mappable) {
        return mappable.toJSON();
    }
}

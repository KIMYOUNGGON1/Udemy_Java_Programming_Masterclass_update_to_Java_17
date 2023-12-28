package section_12.genericsExtra;

public record Employee(String name) implements QueryItem {
    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        return false;
    }
}

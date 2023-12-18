package section_11.anotherAbstractClassChallenge;

public interface NodeList {
    abstract ListItem getRoot();

    abstract boolean addItem(ListItem item);

    abstract boolean removeItem(ListItem item);
    abstract boolean traverse(ListItem item);
}

package section_11.anotherAbstractClassChallenge;

public interface NodeList {
    abstract ListItem getRoot();

    abstract boolean addItem(ListItem item);

    abstract void removeItem();
    abstract void traverse();
}

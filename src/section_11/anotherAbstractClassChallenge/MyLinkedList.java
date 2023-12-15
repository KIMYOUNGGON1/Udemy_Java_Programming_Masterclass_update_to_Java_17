package section_11.anotherAbstractClassChallenge;

public class MyLinkedList implements NodeList {
    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem item) {
        return true;
    }

    @Override
    public void removeItem() {

    }

    @Override
    public void traverse() {

    }
}

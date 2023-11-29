package section_10.linkedLists;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

        removeElements(placesToVisit);
        System.out.println(placesToVisit);
    }

    private static void addMoreElements(LinkedList<String> list) {
        list.addFirst("Darwin");
        list.addLast("Hobart");
        //Queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");
        //Stack methods
        list.push("Alice Springs");
    }

    private static void removeElements(LinkedList<String> list) {
        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String remove = list.remove(); // removes first element
        System.out.println(remove + " was removed");

        String remove2 = list.removeFirst(); // removes first element
        System.out.println(remove2 + " was removed");

        String remove3 = list.removeLast(); // removes last element
        System.out.println(remove3 + " was removed");

        // Queue/Deque poll methods
        String poll = list.poll(); // removes first element
        System.out.println(poll + " was removed" );
        String poll_2 = list.pollFirst(); // removes first element
        System.out.println(poll_2 + " was removed" );
        String poll_3 = list.pollLast(); // removes last element
        System.out.println(poll_3 + " was removed" );

        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);

        String poll_4 = list.pop(); // removes fisrt element
        System.out.println(poll_4 + " was removed" );
    }
}

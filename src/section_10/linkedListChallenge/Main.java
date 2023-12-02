package section_10.linkedListChallenge;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var townList = new LinkedList<Town>();

        townList.add(new Town("Adelaide", 1374));
        townList.add(new Town("Alice Springs", 2771));
        townList.add(new Town("Brisbane", 917));
        townList.add(new Town("Darwin", 3972));
        townList.add(new Town("Melbourne", 877));
        townList.add(new Town("Perth", 3923));

        callScannerObject(townList);
    }

    private static void callScannerObject(LinkedList<Town> linkedList) {
        printScannerInputMessage();
        Scanner scanner = new Scanner(System.in);
        String nextOperation = scanner.next().toLowerCase();

        ListIterator<Town> iterator = linkedList.listIterator();

        if (nextOperation.equals("f") || nextOperation.equals("forward")) {
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        } else if (nextOperation.equals("b") || nextOperation.equals("backward")) {
            while (iterator.hasPrevious()) {
                System.out.println(iterator.previous());
            }
        } else if (nextOperation.equals("l") || nextOperation.equals("list places")) {
            linkedList.forEach(System.out::println);
        } else if (nextOperation.equals("q") || nextOperation.equals("quit")) {
            scanner.close();
        }
    }

    private static void printScannerInputMessage() {
        System.out.println("""
                Available actions (select word or letter) :
                (F)orward
                (B)ackward
                (L)ist places
                (M)enu
                (Q)uit
                """);
    }
}

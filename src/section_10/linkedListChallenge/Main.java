package section_10.linkedListChallenge;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var townList = new LinkedList<Town>();

        townList.add(new Town("Adelaide", "1374"));
        townList.add(new Town("Alice Springs", "2771"));
        townList.add(new Town("Brisbane", "917"));
        townList.add(new Town("Darwin", "3972"));
        townList.add(new Town("Melbourne", "877"));
        townList.add(new Town("Perth", "3923"));

    }

    private static void callScannerObject() {
        Scanner scanner = new Scanner(System.in);
        String nextOperation = scanner.next();
    }

    private static void printScannerInputMessage() {

    }
}

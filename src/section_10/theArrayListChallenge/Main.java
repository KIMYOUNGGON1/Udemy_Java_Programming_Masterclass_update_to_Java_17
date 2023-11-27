package section_10.theArrayListChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> groceryList = new ArrayList<>();
        boolean flag = true;

        while (flag) {
            System.out.println("Available actions:\n" +
                    "0 - to shutdown\n" +
                    "1 - to add item(s) to list (comma delimited list)\n" +
                    "2 - to remove any items (comma delimited list)\n" +
                    "Enter a number for which action you want to do:");

            int enteredInt = makeIntScannerObject();

            if (enteredInt == 0) {
                System.out.println("Grocery List: " + groceryList);
                flag = false;
            } else if (enteredInt == 1) {
                System.out.println("Enter item(s) to add (comma delimited):");
                String enteredString = makeStringScannerObject();
                String[] itemsToAdd = enteredString.split(",");
                for (String item : itemsToAdd) {
                    if (!groceryList.contains(item.trim())) {
                        groceryList.add(item.trim());
                    }
                }
                System.out.println("Grocery List: " + groceryList);
            } else if (enteredInt == 2) {
                System.out.println("Enter item(s) to remove (comma delimited):");
                String enteredString = makeStringScannerObject();
                String[] itemsToRemove = enteredString.split(",");
                for (String item : itemsToRemove) {
                    groceryList.remove(item.trim());
                }
                System.out.println("Grocery List: " + groceryList);
            }
        }
    }

    private static int makeIntScannerObject() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static String makeStringScannerObject() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}

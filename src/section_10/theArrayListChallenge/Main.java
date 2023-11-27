package section_10.theArrayListChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> groceryList = new ArrayList<>();
        boolean flag = true;

        while (flag) {
            printMenu();
            int enteredInt = getIntInput();

            switch (enteredInt) {
                case 0:
                    System.out.println(groceryList);
                    flag = false;
                    break;
                case 1:
                    addItems(groceryList);
                    break;
                case 2:
                    removeItems(groceryList);
                    break;
                default:
                    System.out.println("Invalid input. Please enter 0, 1, or 2.");
            }
        }

        // Close the scanner after use
        scanner.close();
    }

    private static void printMenu() {
        System.out.println("Available actions:");
        System.out.println("0 - to shutdown");
        System.out.println("1 - to add item(s) to list (comma delimited list)");
        System.out.println("2 - to remove any items (comma delimited list)");
        System.out.print("Enter a number for which action you want to do: ");
    }

    private static int getIntInput() {
        return scanner.nextInt();
    }

    private static void addItems(ArrayList<String> list) {
        System.out.print("Enter item(s) to add (comma delimited): ");
        scanner.nextLine(); // Consume the newline character left by nextInt()
        String enteredString = scanner.nextLine();
        String[] items = enteredString.split(",");

        for (String item : items) {
            if (!list.contains(item.trim())) {
                list.add(item.trim());
            }
        }

        System.out.println("Updated list: " + list);
    }

    private static void removeItems(ArrayList<String> list) {
        System.out.print("Enter item(s) to remove (comma delimited): ");
        scanner.nextLine(); // Consume the newline character left by nextInt()
        String enteredString = scanner.nextLine();
        String[] items = enteredString.split(",");

        for (String item : items) {
            list.remove(item.trim());
        }

        System.out.println("Updated list: " + list);
    }
}

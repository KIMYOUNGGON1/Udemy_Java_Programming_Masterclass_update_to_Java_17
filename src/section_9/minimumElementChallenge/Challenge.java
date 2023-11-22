package section_9.minimumElementChallenge;

import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        int readIntegerValue = readInteger();

        int[] ints = readElements(readIntegerValue);

        System.out.println("Minimum value is: " + findMin(ints));

    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        return scanner.nextInt();
    }

    private static int[] readElements(int inputValue) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[inputValue];
        System.out.println("Enter the elements:");

        for (int i = 0; i < inputValue; i++) {
            intArray[i] = scanner.nextInt();
        }
        
        return intArray;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }

        return min;
    }

}



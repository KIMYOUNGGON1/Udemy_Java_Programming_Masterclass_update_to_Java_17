package section_9.arrayChallenge;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] integers = getIntegers(sc);
        printArray(integers);

        int[] sortedArray = sortIntegers(integers);
        printArray(sortedArray);
    }

    public static int[] getIntegers(Scanner scanner) {
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        int[] integerArray = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            integerArray[i] = scanner.nextInt();
        }

        return integerArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + "contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] unsortedArray) {
        int[] sortedArray = Arrays.copyOf(unsortedArray, unsortedArray.length);
        boolean flag = true;

        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }
}

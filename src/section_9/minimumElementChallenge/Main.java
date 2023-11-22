package section_9.minimumElementChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] ints = readInteger();
        System.out.println(Arrays.toString(ints));

        int min = findMin(ints);
        System.out.println("Min value : " + min);

    }

    public static int[] readInteger() {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        
        String[] tokens = line.split(",");
        int[] values = new int[tokens.length];

        for (int i = 0; i < values.length; i++) {
            values[i] = Integer.parseInt(tokens[i].trim());
        }

        return values;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }

        return min;
    }
}

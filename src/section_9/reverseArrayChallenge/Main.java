package section_9.reverseArrayChallenge;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] testArray = new int[]{56, 78, 90};
        System.out.println("This is original array's value = " + Arrays.toString(testArray));

        reverse(testArray);
        System.out.println("This is reversed array's value = " + Arrays.toString(testArray));
    }

    private static void reverse(int[] array) {
        int[] reversedArray = new int[array.length];

        for (int i = 0; i < reversedArray.length; i++) {
            reversedArray[i] = array[array.length - i - 1];
        }

        System.arraycopy(reversedArray, 0, array, 0, array.length);
    }
}

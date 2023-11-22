package section_9.minimumElementChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ints = readInteger(sc);
        System.out.println(Arrays.toString(ints));


    }

    public static int[] readInteger(Scanner scanner) {
        scanner.useDelimiter(",");

        List<Integer> integerList = new ArrayList<>();

        while (scanner.hasNext()) {
            int tempInt = scanner.nextInt();
            integerList.add(tempInt);
        }

        int[] resultArray = new int[integerList.size()];
        for (int i = 0; i < integerList.size(); i++) {
            resultArray[i] = integerList.get(i);
        }

        return resultArray;
    }

    public static int findMin(int[] array) {
        int min = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] <= array[i + 1]) {
                min = array[i];
            } else if (array[i] > array[i + 1]) {
                min = array[i + 1];
            }
        }

        return min;
    }
}

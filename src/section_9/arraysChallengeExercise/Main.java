package section_9.arraysChallengeExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] randomArrays = createRandomArrays(5);
        System.out.println("The Original randomArrays value is = " + Arrays.toString(randomArrays));
        Arrays.sort(randomArrays);
        System.out.println("The Sorting Ascending randomArrays value is = " + Arrays.toString(randomArrays));
//        Arrays.sort(randomArrays, Collections.reverseOrder());

    }

    public static int[] createRandomArrays(int len) {
        Random random = new Random();
        int[] randomNumber = new int[len];
        for (int i = 0; i < len; i++) {
            randomNumber[i] = random.nextInt(100);
        }

        return randomNumber;
    }
}

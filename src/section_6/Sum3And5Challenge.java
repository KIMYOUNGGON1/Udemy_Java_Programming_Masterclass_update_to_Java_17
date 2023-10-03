package section_6;

public class Sum3And5Challenge {
    public static void main(String[] args) {
        int conditions = 0;
        int sumOfCanBeDivided = 0;

        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                conditions++;
                sumOfCanBeDivided += i;
                System.out.println("Found a match = " + i);
            }

            if (conditions == 5) {
                break;
            }
        }
        System.out.println("Sum = " + sumOfCanBeDivided);
    }
}

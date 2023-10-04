package section_6;

public class WhileLoopChallenge {
    public static void main(String[] args) {
        int testNum = 4;
        int countEvenNum = 0;
        int sumEvenNum = 0;

        while (testNum < 21) {
            testNum++;
            if (isEvenNumber(testNum)) {
                countEvenNum++;
                System.out.println("Count Even Number is " + countEvenNum);
                System.out.println("Even number is " + testNum);
                sumEvenNum += testNum;
                System.out.println(sumEvenNum);
                if (countEvenNum >= 5) {
                    break;
                }
            }
        }

        System.out.println("Total Odd numbers found = " + countEvenNum + "\n" +
                "Total even numbers found = " + sumEvenNum);
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

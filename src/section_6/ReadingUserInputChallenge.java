package section_6;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int countInput = 1;
        double sum = 0.0;

        do {
            System.out.println("Enter number #" + countInput + " : ");
            String nextNumber = sc.nextLine();
            try {
//                int number = Integer.parseInt(nextNumber
//                );
                double number = Double.parseDouble(nextNumber);
                countInput++;
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid Number");
            }
        } while (countInput <= 5);

        System.out.println("The sum of the 5 numbers = " + sum);
    }
}

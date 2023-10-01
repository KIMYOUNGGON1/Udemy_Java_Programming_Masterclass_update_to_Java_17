package section_6;

public class TheForLoopSmallChallenge {
    public static void main(String[] args) {
        for (double rate = 7.5; rate <= 10.0; rate += 0.25){
            double interestAmount = calculateInterest(100.0, rate);
            if (interestAmount > 8.5) {
                break;
            }
            System.out.println("$100.00 dollars at " + rate + "% interest = $ " + interestAmount + " dollars");
        }
    }

    public static double calculateInterest(double dollar, double interestRate) {
        return (dollar * (interestRate / 100));
    }
}

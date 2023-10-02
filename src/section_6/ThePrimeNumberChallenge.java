package section_6;

public class ThePrimeNumberChallenge {
    public static void main(String[] args) {
        int primeNumberCount = 0;

        for (int i = 10; primeNumberCount < 3 && i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println("The " + i + " number is a Prime number");
                primeNumberCount++;
            }
        }
    }

    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}

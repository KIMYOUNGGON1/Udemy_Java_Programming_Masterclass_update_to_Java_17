package section_6;

public class SharedDigit {
    public static void main(String[] args) {
//        Shared Digit
//        Write a method named hasSharedDigit with two parameters of type int.
//
//                Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
//
//                The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
//
//
//
//                EXAMPLE INPUT/OUTPUT:
//
//        hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
//
//        hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
//
//        hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
//
//
//
//        NOTE: The method hasSharedDigit​ should be defined as public static like we have been doing so far in the course.
//
//        NOTE: Do not add a main method to the solution code.
        boolean b = hasSharedDigit(12, 23);
        System.out.println(b);
    }

    public static boolean hasSharedDigit(int firstParam, int secondParam) {
        if (((firstParam >= 10) && (firstParam <= 99)) &&
                ((secondParam >= 10) && (secondParam <= 99))) {

            int firstLastDigit = firstParam % 10;
            int secondLastDigit = secondParam % 10;

            while (true) {
                firstParam /= 10;
                secondParam /= 10;

                int firstValue = firstParam % 10;
                int secondValue = secondParam % 10;

                if ((firstLastDigit == secondLastDigit) ||
                        (firstValue == secondValue) ||
                        (firstValue == secondLastDigit) ||
                        (secondValue == firstLastDigit)) {
                    return true;
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
    }
}

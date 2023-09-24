package section_5;

public class DecimalComparator {
    //    EXAMPLES OF INPUT/OUTPUT:
//
//    areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.
//
//    areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places
//
//    areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.
//
//    areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.
//
//
//
//    TIP: Use paper and pencil.
//
//    TIP: Use casting.
//
//    NOTE: The areEqualByThreeDecimalPlaces method  needs to be defined as public static ​like we have been doing so far in the course.
//    NOTE: Do not add a  main method to solution code.
    public static boolean areEqualByThreeDecimalPlaces(double firstValue, double secondValue) {
        int firstCast = (int) (firstValue * 1000);
        int secondCast = (int) (secondValue * 1000);

        if (firstCast == secondCast) {
            return true;
        } else {
            return false;
        }
    }
}

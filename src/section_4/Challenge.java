package section_4;

public class Challenge {
    public static void main(String[] args) {
        /*
            My answer
         */
        double firstValue = 20.00;
        double secondValue = 80.00;
        double addValue = firstValue + secondValue;
        double multiple = 100.00;
        double multipleAddValue = addValue * multiple;

        System.out.println(multipleAddValue);

        double modula = 60.00;
        double modulValue = multipleAddValue % modula;

        System.out.println("modulValue = " + modulValue);

        boolean isEven = (modulValue == 0.00) ? true : false;

        System.out.println("isEven = " + isEven);

        if (!isEven) {
            System.out.println("Get some remainder.");
        }

        /*
            Lecture's answer
         */

        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("myValuesTotal = " + myValuesTotal);
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("theRemainder = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}

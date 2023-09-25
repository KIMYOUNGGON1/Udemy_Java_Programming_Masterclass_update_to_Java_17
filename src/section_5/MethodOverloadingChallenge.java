package section_5;

public class MethodOverloadingChallenge {
    /*
        my solution
     */
    public static void main(String[] args) {
        convertToCentimeters(5);
        convertToCentimeters(5, 8);
    }

    public static double convertToCentimeters(int inches) {
        double calculateAnswer = (double) inches * 2.54;
        System.out.println(inches + " inches can convert to " + calculateAnswer + " centimeters");
        return calculateAnswer;
        //lecture's answer
//        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
        int calculateFeetToInches = feet * 12;
        int sumOfCalcFeetWithInches = calculateFeetToInches + inches;

        double theAnswerOfMethod = convertToCentimeters(sumOfCalcFeetWithInches);
        System.out.println(feet + " feet and " + inches + " inches " + "can convert to "
                + theAnswerOfMethod + " centimeters");
        return theAnswerOfMethod;
        //lecture's answer
//        return ((feet * 12) + inches) * 2.54;
//        return convertToCentimeters((feet * 12) + inches);
    }


}

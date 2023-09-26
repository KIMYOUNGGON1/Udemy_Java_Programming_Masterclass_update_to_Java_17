package section_5;

public class MinutesToYearsDaysCalculator {
    //    Minutes To Years and Days Calculator
//    Write a method printYearsAndDays with parameter of type long named minutes.
//
//    The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.
//
//    If the parameter is less than 0, print text "Invalid Value".
//
//    Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".
//
//    XX represents the original value minutes.
//    YY represents the calculated years.
//    ZZ represents the calculated days.
//
//
//
//    EXAMPLES OF INPUT/OUTPUT:
//
//    printYearsAndDays(525600);  → should print "525600 min = 1 y and 0 d"
//
//    printYearsAndDays(1051200); → should print "1051200 min = 2 y and 0 d"
//
//    printYearsAndDays(561600);  → should print "561600 min = 1 y and 25 d"
//
//
//
//    TIPS:
//
//    Be extra careful about spaces in the printed message.
//
//    Use the remainder operator
//
//1 hour = 60 minutes
//
//1 day = 24 hours
//
//1 year = 365 days
//
//            NOTES
//
//    The printYearsAndDays method needs to be defined as public static ​like we have been doing so far in the course.
//
//    Do not add main method to solution code.
//
//    The solution will not be accepted if there are extra spaces
    public static void main(String[] args) {
        printYearsAndDays(581760);
    }
    public static void printYearsAndDays(long minutes) {
        // 분을 시로 환산
        long calcMinutesToHours = minutes / 60;

        long calcHoursToDay = 0L;
        long calcDaysToYear_1 = 0L;
        long calcDaysToYear_2 = 0L;

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            // 시간을 일자로 변환
            calcHoursToDay = calcMinutesToHours / 24;

            // 일자를 년으로 변환
            calcDaysToYear_1 = calcHoursToDay / 365;

            // 년으로 변환 후 남은 일자 반환
            calcDaysToYear_2 = calcHoursToDay % 365;

            if (calcDaysToYear_1 > 0) {
                //년으로 변환 가능할 경우 년으로 변환 후 남은 일자 반환
                System.out.println(minutes + " min = " + calcDaysToYear_1 + " y and " + calcDaysToYear_2 + " d");
            } else {
                // 그렇지 않을 경우 분을 일자로 변경한 내용을 반환
                System.out.println(minutes + " min = " + calcDaysToYear_1 + " y and " + calcHoursToDay + " d");
            }
        }
    }
}

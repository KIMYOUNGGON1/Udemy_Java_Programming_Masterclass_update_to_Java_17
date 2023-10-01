package section_6;

public class NumberInWord {
    //    Number In Word
//    Write a method called printNumberInWord. The method has one parameter number which is the whole number. The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9 or other for any other number including negative numbers. You can use if-else statement or switch statement whatever is easier for you.
//
//
//
//            NOTE: Method printNumberInWord needs to be public static for now, we are only using static methods.
//
//            NOTE: Do not add main method to solution code.
    public static void main(String[] args) {
        printNumberInWord(3);
    }
    public static void printNumberInWord(int number) {
        String caseNumber;
        switch (number) {
            case 0:
                caseNumber = "ZERO";
                break;
            case 1:
                caseNumber = "ONE";
                break;
            case 2:
                caseNumber = "TWO";
                break;
            case 3:
                caseNumber = "THREE";
                break;
            case 4:
                caseNumber = "FOUR";
                break;
            case 5:
                caseNumber = "FIVE";
                break;
            case 6:
                caseNumber = "SIX";
                break;
            case 7:
                caseNumber = "SEVEN";
                break;
            case 8:
                caseNumber = "EIGHT";
                break;
            case 9:
                caseNumber = "NINE";
                break;
            default:
                caseNumber = "OTHER";
                break;
        }
        System.out.println(caseNumber);
    }
}

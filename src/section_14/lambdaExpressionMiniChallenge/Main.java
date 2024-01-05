package section_14.lambdaExpressionMiniChallenge;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Consumer<String> printTheParts = (String s) -> {
            String[] parts = s.split(" ");
            for (String part : parts) {
                System.out.println("part = " + part);
            }
        };

        // This is code to test code for do check out that I made the right lambda expression.
        printTheParts.accept("Let's split this up into an array");

        System.out.println("-".repeat(30));

        Consumer<String> printThePartsForEach = (String s) -> {
            String[] parts = s.split(" ");
            Arrays.asList(parts).forEach(sentence -> System.out.println(sentence));
        };

        // This code is a test to verify that I have created the correct lambda expression.
        printThePartsForEach.accept("Let's split this up into an array");

        System.out.println("-".repeat(30));

        Consumer<String> printThePartsConcise = (String s) -> {
            Arrays.asList(s.split(" ")).forEach(sentence -> System.out.println("sentence = " + sentence));
        };

        // This code is a test to verify that I have created the correct lambda expression.
        printThePartsConcise.accept("Let's split this up into an array");

        System.out.println("-".repeat(50));
        System.out.println("Below this line is Mini Challenge 2");
        System.out.println("-".repeat(50));

        UnaryOperator<String> everySecondChar = source -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };

        System.out.println("-".repeat(50));
        System.out.println("Below this line is Mini Challenge 3");
        System.out.println("-".repeat(50));

        System.out.println(everySecondChar.apply("1234567890"));

        System.out.println("-".repeat(50));
        System.out.println("Below this line is Mini Challenge 4");
        System.out.println("-".repeat(50));

        System.out.println("-".repeat(50));
        System.out.println("Below this line is Mini Challenge 5");
        System.out.println("-".repeat(50));

        String s = everySecondCharacter(everySecondChar, "1234567890");
        System.out.println("s = " + s);

        System.out.println("-".repeat(50));
        System.out.println("Below this line is Mini Challenge 6");
        System.out.println("-".repeat(50));

        Supplier<String> iLoveJava = () -> "I Love Java!";
        Supplier<String> iLoveJava_2 = () -> {
            return "I Love Java!";
        };

        System.out.println("-".repeat(50));
        System.out.println("Below this line is Mini Challenge 7");
        System.out.println("-".repeat(50));

        System.out.println(iLoveJava.get());
        System.out.println(iLoveJava_2.get());
    }

    public static String everySecondCharacter(Function<String, String> function, String source) {
        return function.apply(source);
    }
}

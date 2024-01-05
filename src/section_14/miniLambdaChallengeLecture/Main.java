package section_14.miniLambdaChallengeLecture;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Consumer<String> printWords = sentence -> {
            String[] parts = sentence.split(" ");
            for (String part : parts) {
                System.out.println("part = " + part);
            }
        };

        printWords.accept("Let's split this up into an array");

        System.out.println("-".repeat(30));

        Consumer<String> printWordsForEach = sentence -> {
            String[] parts = sentence.split(" ");
            Arrays.asList(parts).forEach(s -> System.out.println(s));
        };

        printWordsForEach.accept("Let's split this up into an array");

        System.out.println("-".repeat(30));

        Consumer<String> printWordsConcise = sentence -> {
            Arrays.asList(sentence.split(" ")).forEach(s -> System.out.println(s));
        };

        printWordsForEach.accept("Let's split this up into an array");

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

        String result = everySecondCharacter(everySecondChar, "1234567890");
        System.out.println("s = " + result);

        System.out.println("-".repeat(50));
        System.out.println("Below this line is Mini Challenge 6");
        System.out.println("-".repeat(50));

        Supplier<String> iLoveJava = () -> "I love Java!";
        Supplier<String> iLoveJava2 = () -> {
            return "I love Java!";
        };

        System.out.println("-".repeat(50));
        System.out.println("Below this line is Mini Challenge 7");
        System.out.println("-".repeat(50));

        System.out.println(iLoveJava.get());
        System.out.println(iLoveJava2.get());
    }

    public static String everySecondCharacter(Function<String, String> function, String source) {
        return function.apply(source);
    }
}

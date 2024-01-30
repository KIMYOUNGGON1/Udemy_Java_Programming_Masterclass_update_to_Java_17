package section_14.chainingLambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        String name = "Tim";

        // Function 객체 uCase: 문자열을 대문자로 변환
        Function<String, String> uCase = String::toUpperCase;

        // uCase 함수를 사용하여 name을 대문자로 변환하고 출력
        System.out.println(uCase.apply(name)); // "TIM"

        // Function 객체 lastName: 문자열 끝에 " Buchalka"를 추가
        Function<String, String> lastName = s -> s.concat(" Buchalka");

        // uCase 함수와 lastName 함수를 연결: name을 대문자로 변환하고 " Buchalka" 추가
        Function<String, String> uCaseLastName = uCase.andThen(lastName);
        System.out.println(uCaseLastName.apply(name)); // "TIM BUCHALKA"

        // uCaseLastName을 다시 정의: lastName 함수를 먼저 적용한 다음 uCase 함수 적용
        uCaseLastName = uCase.compose(lastName);
        System.out.println(uCaseLastName.apply(name)); // "TIM BUCHALKA"

        // Function 체이닝: 문자열을 대문자로 변환, " Buchalka" 추가, 공백으로 분할
        Function<String, String[]> f0 = uCase
                .andThen(s -> s.concat(" Buchalka"))
                .andThen(s -> s.split(" "));
        System.out.println(Arrays.toString(f0.apply(name))); // ["TIM", "BUCHALKA"]

        // Function 체이닝: 문자열 변환 후 배열의 요소를 재조합하여 새 문자열 생성
        Function<String, String> f1 = uCase
                .andThen(s -> s.concat(" Buchalka"))
                .andThen(s -> s.split(" "))
                .andThen(s -> s[1].toUpperCase() + ", " + s[0]);
        System.out.println(f1.apply(name)); // "BUCHALKA, TIM"

        // Function 체이닝: 문자열 변환, 배열로 변환, 문자열로 합친 후 길이 반환
        Function<String, Integer> f2 = uCase
                .andThen(s -> s.concat(" Buchalka"))
                .andThen(s -> s.split(" "))
                .andThen(s -> String.join(", ", s))
                .andThen(String::length);
        System.out.println(f2.apply(name)); // 16

        // Consumer 람다 표현식: 배열의 문자열 처리
        String[] names = {"Ann", "Bob", "Carol"};

        // Consumer 체이닝: 배열 요소의 첫 글자를 출력하고 "-" 추가 후 줄 바꿈
        Consumer<String> s0 = s -> System.out.print(s.charAt(0));
        Consumer<String> s1 = System.out::println;
        Arrays.asList(names).forEach(s0
                .andThen(s -> System.out.print(" - "))
                .andThen(s1)); // "A - B - C - "

        // Predicate 람다 표현식: 문자열 조건 검사
        Predicate<String> p1 = s -> s.equals("TIM");
        Predicate<String> p2 = s -> s.equalsIgnoreCase("Tim");
        Predicate<String> p3 = s -> s.startsWith("T");
        Predicate<String> p4 = s -> s.endsWith("e");

        // p1과 p2를 OR 연산: 조건 조합
        Predicate<String> combined1 = p1.or(p2);
        System.out.println("combined1 = " + combined1.test(name)); // true

        // p3와 p4를 AND 연산: 조건 조합
        Predicate<String> combined2 = p3.and(p4);
        System.out.println("combined2 = " + combined2.test(name)); // false

        // p3와 p4를 AND 연산 후 negate: 조건 반전
        Predicate<String> combined3 = p3.and(p4).negate();
        System.out.println("combined3 = " + combined3.test(name)); // true

        record Person(String firstName, String lastName) {

        }

        List<Person> list = new ArrayList<>(Arrays.asList(
                new Person("Peter", "Pan"),
                new Person("Peter", "PumpkinEater"),
                new Person("Minnie", "Mouse"),
                new Person("Mickey", "Mouse")
        ));

        list.sort((o1, o2) -> o1.lastName.compareTo(o2.lastName));
        list.forEach(System.out::println);

        System.out.println("-".repeat(30));
        list.sort(Comparator.comparing(Person::lastName));
        list.forEach(System.out::println);

        System.out.println("-".repeat(30));
        list.sort(Comparator.comparing(Person::lastName)
                .thenComparing(Person::firstName));
        list.forEach(System.out::println);

        System.out.println("-".repeat(30));
        list.sort(Comparator.comparing(Person::lastName)
                .thenComparing(Person::firstName).reversed());
        list.forEach(System.out::println);
    }
}

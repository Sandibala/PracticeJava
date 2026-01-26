package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> input = new ArrayList<>();
        System.out.println("Enter the strings:");

        while (true){
            String s = in.nextLine();
            if(s.isEmpty())
                break;
            input.add(s);
        }

        Function<String, String> trim = s -> s.trim();
        Predicate<String> notEmpty = s -> !s.isEmpty();
        Function<String, Integer> parse = s -> {
            try {
                return Integer.parseInt(s);
            } catch (Exception e) {
                return null;
            }
        };

        Predicate<Integer> notNull = n -> n != null;
        Predicate<Integer> even = n -> n % 2 == 0;

        int sum = 0;
        for (String s : input) {
            s = trim.apply(s);
            if (!notEmpty.test(s)) continue;
            Integer number = parse.apply(s);
            if (!notNull.test(number)) continue;
            if (!even.test(number)) continue;
            sum += number;
        }
        System.out.println(sum);
    }
}


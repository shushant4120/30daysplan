package com.prepration.concept.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PlayGround {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 3, 4, 5, 8, 8, 9, 10);

        int n = 2;
        list.stream().sorted(Comparator.reverseOrder())
                .distinct()
                .skip(n - 1)
                .findFirst()
                .ifPresentOrElse(System.out::println, () -> System.out.println("No such element"));

        list.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet().stream().filter(y -> y.getValue() > 1)
                .sorted(Map.Entry.<Integer, Long>comparingByKey().reversed()).findFirst()
                .ifPresentOrElse(x -> System.out.println(x.getKey() + " appears " + x.getValue() + " times"),
                        () -> System.out.println("No repeated elements"));
    }
}

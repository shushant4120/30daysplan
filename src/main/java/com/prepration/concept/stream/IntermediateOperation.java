package com.prepration.concept.stream;

import java.util.Arrays;
import java.util.List;

// filter
// map
// flatMap
// skip
// sorted
// distinct
// findFirst
// findAny
// limit
public class IntermediateOperation {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "David", "Eve","Alice");

        names.stream().filter(n -> n.startsWith("D")).forEach((name) -> System.out.println(name));
        names.stream().map(n -> n.concat(" Kumar")).forEach(nm -> System.out.println(nm));
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Alice", "Bob"),
                Arrays.asList("Charlie", "David"),
                Arrays.asList("Eve"));
        listOfLists.stream().flatMap(List::stream).forEach(System.out::println);
        names.stream().skip(2).forEach(System.out::println);
        names.stream().sorted().forEach(System.out::println);
        names.stream().distinct().forEach(System.out::println);
        names.stream().findFirst().ifPresent(System.out::println);
        names.stream().findAny().ifPresent(System.out::println);
        names.stream().limit(3).forEach(System.out::println);
    }
}

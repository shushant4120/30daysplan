package com.prepration.concept.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Demo {
    
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(70);

        list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().ifPresent(System.out::println);
    // Natural order sorting of integers
    list.stream().sorted().forEach(System.out::println);
        HashMap<Integer, String> map = new HashMap<>();
        map.put(3, "three");
        map.put(7, "Seven");
        map.put(2, "two");
        map.entrySet().stream().sorted(Comparator.comparingInt(e -> e.getKey())).forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
        String str= "shushant";
        char[] chars = str.toCharArray();
        LinkedHashMap<Character, Integer> charCountMap = new LinkedHashMap<>();
        for(char c: chars){
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        charCountMap.entrySet().stream().filter(key-> key.getValue()>  1).findFirst().ifPresent(e -> System.out.println("First repeating character: " + e.getKey() + " with count: " + e.getValue()));

    }
}

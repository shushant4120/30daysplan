package com.prepration.concept.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NthHighest {

public static void main(String[] args) {
    
     Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 30);
        map.put("C", 20);
        map.put("D", 50);
        map.put("E", 40);
        List<Integer> list = Arrays.asList(2,3,4,5,6,7,8,9,10);
int nn = 1; // Change this value to get the nth highest
        list.stream().sorted(Comparator.reverseOrder()).skip(nn - 1).findFirst().ifPresent(System.out::println); 
int n = 3; // Change this value to get the nth highest
        map.values().stream().sorted(Comparator.reverseOrder()).skip(n-1).findFirst().ifPresent(System.out::println);
}

}
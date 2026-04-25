package com.prepration.concept.stream;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        
        String str= "aabbbcccccddddd";
       Map<Object,Long> re= str.chars().mapToObj(x-> (char)x).collect(Collectors.groupingBy(x->x, Collectors.counting()));
       System.out.println(re);
Map<Character, Integer> map= new HashMap<>();
for(char c: str.toCharArray()){
    map.put(c,map.getOrDefault(c,0)+1);
    }

map.entrySet().stream().forEach(x-> System.out.println(x.getKey() + " appears " + x.getValue() + " times"));
    }
}

package com.prepration.concept.problems;

import java.util.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Alstate {
    
    public static void main(String[] args) {
        System.out.println("Hello World");
        String name= "Shushant";
       // s2h2u1a1n1t1

       char[] charArray = name.toLowerCase().toCharArray();
       System.out.println(name.length());
       //LinkedHashMap maintain insertion order and HashMap does not maintain any order
       Map<Character, Integer> charCountMap = new LinkedHashMap<>();
       Map<Character, Integer> charCountMap1 = new HashMap<>();

       for(int i=name.length()-1; i>=0;i--){
       
        charCountMap.put(charArray[i], charCountMap.getOrDefault(charArray[i], 0)+1);
        charCountMap1.put(charArray[i], charCountMap1.getOrDefault(charArray[i], 0)+1);

       }
       System.out.println(charCountMap);
       System.out.println(charCountMap1);

    }
}

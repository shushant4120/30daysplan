package com.prepration.concept.oops;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class StringConcept {

    public static void main(String[] args) {

        String s1 = "Shushant";
        String s2 = "Shushant";
        String s3 = new String("Shushant");
        // 👉 intern() → moves reference to String Pool
        // System.out.println(s1==s3.intern());
        // System.out.println(s1.hashCode() + " "+ s2.hashCode() + " "+ s3.hashCode());
        // System.out.println(s1.concat(" Kumar") + " "+ s1);
        String s4 = "";
        Map<Character, Integer> map = new HashMap<>();
        char[] ch = s1.toLowerCase().toCharArray();
        for (char c : ch) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            s4 += c;
        }

        List<Map.Entry<Character, Integer>> list = map.entrySet().stream().filter(n -> n.getValue() > 1).toList();
        list.forEach(n -> System.out.print(n.getKey() + " " + n.getValue()));

        String s5 = "Sameer";
        StringBuilder sb = new StringBuilder(s5);
        sb.append("Kumar");
        sb.reverse();
        System.out.println(sb);

        String s6 = "";
        System.out.println(s5.length());
        for(int i=s5.length()-1; i>=0;i--){

           s6+= s5.charAt(i);
        }
        System.out.println(s6);
    }
}

package com.prepration.concept.oops;

public class StringConcept {
    
    String s1 = "sky";
    String s2= "nipu";

    public static void main(String[] args) {
        StringConcept sc = new StringConcept();
        sc.s1 = sc.s2;
        System.out.println(sc.s1);
        System.out.println(sc.s1.getClass().getTypeName());
    }
}

package com.prepration.concept.problems;

public class NonRepating {

    public static void main(String[] args) {
        // Implementation for finding non-repeating characters
        String str = "aabbccde";

        char[] chars = str.toCharArray();
        System.out.println(chars.length);
        for (char c : chars) {
            int count = 0;
            for (int j = 1; j < chars.length; j++) {

                System.out.println("c: " + c + " chars[j]: " + chars[j]);
                if (c == chars[j]) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(c);

            }

        }
    }
}

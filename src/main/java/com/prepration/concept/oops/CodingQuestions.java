package com.prepration.concept.oops;

// 💥 Most Important Interview Takeaways
// String is immutable
// == vs .equals() 🔥
// String Pool concept 🔥🔥
// intern() 🔥🔥🔥
// Compile vs runtime concatenation
// StringBuilder vs StringBuffer
public class CodingQuestions {

    public Boolean checkPalandrome(String str) {

        String rev = new StringBuilder(str).reverse().toString();
        if (str.equals(rev))
            return true;
        else
            return false;

    }

    public int getCount(String str) {

        return str.length();
    }

    public String removeDuplicate(String str) {
        String result = "";
        for (char c : str.toCharArray()) {

            if (result.indexOf(c) == -1) {
                result += c;
            }
        }
        System.out.println("the result is " + result);
        return result;

    }

    public int countVowels(String str) {

        int count = 0;
        for (char c : str.toCharArray()) {
            if ("aeiou".contains(String.valueOf(c).toLowerCase())) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "madam";
        System.out.println(new CodingQuestions().checkPalandrome(str) + " and the count is "
                + new CodingQuestions().getCount(str) + " and the string after removing duplicate is "
                + new CodingQuestions().removeDuplicate(str) + " and the count of vowels is "
                + new CodingQuestions().countVowels(str));

        final StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        final String str1 = "Hello World";
        final String str2 = "Hello World";
        System.out.println(str1 == str2);
        System.out.println(sb.toString().equals(str1));
        System.out.println(sb.toString());

    }
}

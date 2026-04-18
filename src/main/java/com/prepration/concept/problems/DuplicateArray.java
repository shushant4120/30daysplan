package com.prepration.concept.problems;

import java.util.Arrays;
import java.util.List;

public class DuplicateArray {
    
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 2, 3};
        int[] arr2= {1, 2, 3, 4, 5, 6};
      int[] filteredArray = Arrays.stream(arr2).filter(X-> Arrays.stream(arr).anyMatch(Y-> Y==X)).toArray();
      System.out.println("Duplicate elements: " + Arrays.toString(filteredArray));

      List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
      List<Integer> list2 = Arrays.asList(1, 2, 3, 5, 2, 3);

      list.stream().filter(list2::contains).toList().forEach(System.out::println);

      String str = "hello world";
      String st2= new String("hello world");
    //   st2.intern();
      System.out.println(str==st2.intern());
    }
}

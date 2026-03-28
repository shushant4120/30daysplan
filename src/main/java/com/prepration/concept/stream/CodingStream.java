package com.prepration.concept.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.prepration.concept.oops.Animal;

public class CodingStream {
    
    private Animal animal;

    //Const
    public CodingStream(Animal animal) {
        this.animal = animal;
    }   
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Example: Filter even numbers and print them
       System.out.println(numbers.stream().filter(n-> n % 2 ==0).toList());
       System.out.println(numbers.stream().map(x -> x*x).sorted().toList());
       System.out.println(numbers.stream().max(Integer::compareTo).orElse(null));
         System.out.println(numbers.stream().collect(Collectors.groupingBy(X-> X , Collectors.counting())));
         String str = "aabbcdde";
        System.out.println( str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
    }
}

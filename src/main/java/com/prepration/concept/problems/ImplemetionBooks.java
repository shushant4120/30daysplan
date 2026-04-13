package com.prepration.concept.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ImplemetionBooks {
    
    public static void main(String[] args) {

        List<Books> bookList = List.of(
            new Books("The Great Gatsby", "F. Scott Fitzgerald", 10.99, "Classic"),
            new Books("To Kill a Mockingbird", "Harper Lee", 8.99, "Classic"),
            new Books("1984", "George Orwell", 9.99, "Dystopian"),  
            new Books("1996","George Orwell", 10.9, "Dystopian")
        );

      List<Books> b= bookList.stream().toList();
      List<Books> b1= bookList.stream().collect(Collectors.toCollection(ArrayList::new));
      try {
         b.add(new Books("1996","George Orwell", 10.9, "Dystopian"));
      System.out.println(b);
      } catch (Exception e) {
        System.out.println("Cannot add to an unmodifiable list: " + e.getMessage());
         b1.add(new Books("1996","George Orwell", 10.9, "Dystopian"));
            System.out.println("Added in list created using Collectors.toList(): ");

      }

      Map<String, Long>  re= bookList.stream().collect(Collectors.groupingBy(lst-> lst.getAuthor(), Collectors.counting()));
        System.out.println(re);
        //get max count of books by author
        String authorWithMostBooks = re.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

        long totalBooks = re.values().stream().mapToLong(Long::longValue).sum();
        System.out.println("Total books: " + totalBooks);
        System.out.println("Author with most books: " + authorWithMostBooks);

    }
}

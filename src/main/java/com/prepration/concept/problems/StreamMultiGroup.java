package com.prepration.concept.problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMultiGroup {
    public static void main(String[] args) {
        Books book1 = new Books("Book A", "Author X", 19.99, "Fiction");
        Books book2 = new Books("Book B", "Author Y", 29.99, "Non-Fiction");
        Books book3 = new Books("Book C", "Author X", 15.99, "Fiction");
        Books book4 = new Books("Book D", "Author Z", 25.99, "Science");
        Books book5 = new Books("Book E", "Author Y", 22.99, "Non-Fiction");

        List<Books> bookList = Arrays.asList(book1, book2, book3, book4, book5);
        
       System.out.println(bookList.stream().collect(Collectors.groupingBy(b->b.getAuthor(),Collectors.groupingBy(b->b.getGenre(), Collectors.counting()))));
    
}
}

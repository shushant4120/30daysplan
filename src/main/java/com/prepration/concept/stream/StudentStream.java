package com.prepration.concept.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StudentStream {
    
    public static void main(String[] args) {
        // Example usage of Student class and stream operations can be implemented here
        List<Student> students = List.of(
            new Student("Alice", 20, List.of("Math", "Science")),
            new Student("Bob", 22, List.of("Literature", "History")),
            new Student("Charlie", 19, null)
        );

      List<String> subjectList = students.stream().filter(std-> std.getSubjects() !=null).flatMap(s-> s.getSubjects().stream()).collect(Collectors.toList());
      System.out.println(subjectList);
    }
}

package com.prepration.concept.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

public class TestAllStreamOperations {
    
    // feild injection
    @Autowired
    private CodingStream codingStream;
    public static void main(String[] args) {
        // Create a list of employees
        List<Employe> employees = Arrays.asList(
            new Employe("Alice", 30, "HR", 50000),
            new Employe("Bob", 25, "IT", 60000),
            new Employe("Charlie", 35, "Finance", 70000),
            new Employe("David", 28, "IT", 55000),
            new Employe("Eve", 32, "HR", 52000)
        );
     Map<Object,List<Employe>> result=  employees.stream().filter(emp -> emp.getSalary()> 50000).collect(Collectors.groupingBy(em -> em.getDepartment(), Collectors.toList()));
    result.entrySet().forEach(entry -> {
        System.out.println("Department: " + entry.getKey());
        entry.getValue().forEach(emp -> System.out.println(" - " + emp.getName() + ", Salary: " + emp.getSalary()));
    });

    employees.stream().sorted(Comparator.comparing(emp-> emp.getAge())).forEach(em-> System.out.println(em.getName() + " - " + em.getAge()));
    }
}

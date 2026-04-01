package com.prepration.concept.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighestSal {
    public static void main(String[] args) {
        Employe e1 = new Employe("John", 30, "IT", 50000);
        Employe e2 = new Employe("Jane", 25, "HR", 60000);
        Employe e3 = new Employe("Bob", 35, "Finance", 55000);
        Employe e4 = new Employe("Alice", 28, "IT", 70000);
        Employe e5 = new Employe("Tom", 32, "HR", 45000);
      List<Employe> list = List.of(e1, e2, e3, e4, e5);
list.stream().sorted(Comparator.comparing(Employe::getSalary).reversed()).collect(Collectors.groupingBy(emp-> emp.getDepartment(),Collectors.maxBy(Comparator.comparing(Employe::getSalary))));

}
}
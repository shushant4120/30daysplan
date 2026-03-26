package com.prepration.concept.functinalinterface;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ListInterface {
  
    ExecutorService ex= Executors.newFixedThreadPool(2);

    public ListInterface() throws InterruptedException {
        List<Callable<Integer>> tasks = List.of(
            () -> 1,
            () -> 2,
            () -> 3
        );

        List<Future<Integer>> results = ex.invokeAll(tasks);
    }
    public static void main(String[] args) throws Exception {
       Runnable r= ()-> System.out.println("Hello world");
       Callable<Integer> c= ()-> {
        return 10;

       };
       Function<Integer, Integer> f= (a)-> a+15;
       Supplier<String> s= ()-> {
        return "Hello world";
       };
       Predicate<Object> p= (T)-> {
        return true;
       };
       Consumer<String> c1= (ss)-> {
        System.out.println("Hello world");
       };
       
       r.run();
       System.out.println(c.call() + " " + f.apply(10) + " " + s.get() + " " + p.test(new Object()));
       c1.accept("Hello world");
       r.run();
    }
}
package com.prepration.concept.completablefeature;

import java.util.concurrent.CompletableFuture;

public class CompletableFeatureMethods {
    
   
    public static void main(String[] args) {
        CompletableFuture.runAsync(()-> System.out.println("Hello Shushant"));
        CompletableFuture.runAsync(()-> System.out.println("Hello Shushant Kumar"));
        System.out.println("Hello Shushant Kumar Singh");
       CompletableFuture.supplyAsync(()-> {
        System.out.println("Count is : "+ 15);
return 5+10;
// System.out.println("Sum is : "+ (5+10));
       } );
       CompletableFuture.allOf(CompletableFuture.completedFuture("Hello Shushant"), CompletableFuture.completedFuture("Hello Shushant Kumar"), CompletableFuture.completedFuture("Hello Shushant Kumar Singh")).thenRun(()-> System.out.println("All tasks completed"));
     CompletableFuture.anyOf(CompletableFuture.completedFuture("Hello Shushant"), CompletableFuture.completedFuture("Hello Shushant Kumar"), CompletableFuture.completedFuture("Hello Shushant Kumar Singh")).thenAccept(result -> System.out.println("First completed task: " + result));
     CompletableFuture.supplyAsync(()-> {
        System.out.println("Calculating sum...");
        return 5+10;
       } ).thenApply(result -> {
        System.out.println("Result is: " + result);
        return result * 2;
       }).thenAccept(finalResult -> System.out.println("Final Result after processing: " + finalResult));
       
    }
}

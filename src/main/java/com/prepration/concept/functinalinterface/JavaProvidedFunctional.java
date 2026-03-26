package com.prepration.concept.functinalinterface;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class JavaProvidedFunctional extends Thread  {
 
    public void run() {
        System.out.println("Thread is running...");
    }
    public static void main(String[] args) {
        Thread t= new JavaProvidedFunctional();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.start();
        ExecutorService ex= Executors.newFixedThreadPool(2);
        Future<Integer> f= ex.submit(()-> {
            Thread.sleep(5000);
            return 10+30;});
           try {
            String s= f.get().toString();
            System.out.println(s);
            try {
                
            } catch (Exception e) {
                // TODO: handle exception
                try {
                    
                } catch (Exception p) {
                    // TODO: handle exception
                } finally {
                    System.out.println("finally block executed");
                }
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
           System.out.println("finally block executed");
        } 
    }
}

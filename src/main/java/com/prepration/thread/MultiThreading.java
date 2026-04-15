package com.prepration.thread;

public class MultiThreading extends Thread{
    
    public void run(){
        System.out.println("Thread is running"); 
        Runnable r = ()-> System.out.println("Runnable is running");   
        Thread t = new Thread(r);
        t.start();
    }
    public static void main(String[] args) {
        MultiThreading t1 = new MultiThreading();
        Thread t2 = new Thread(t1);
        t1.start();
        t2.start();
        
}
}

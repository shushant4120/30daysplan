package com.prepration.concept.functinalinterface;

import java.util.concurrent.Callable;

@FunctionalInterface
public interface FunctionalInbuilt {
    void run();
    default void defaultMethod() {
        System.out.println("This is a default method in the FunctionalInbuilt interface.");
    }
    public static void staticMethod() {
        System.out.println("This is a static method in the FunctionalInbuilt interface.");
    }

    public static void main(String[] args) {
        FunctionalInbuilt fu= () -> System.out.println("This is the implementation of the run method in the FunctionalInbuilt interface.");
        fu.run();
        Runnable r= () -> System.out.println("This is the implementation of the run method in the Runnable interface.");
        r.run();
        Callable c= () -> {
            System.out.println("This is the implementation of the call method in the Callable interface.");
            return "Callable Result";
        };
    }
}

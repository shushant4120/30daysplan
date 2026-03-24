package com.prepration.concept.functinalinterface;

import com.prepration.concept.oops.Animal;

@FunctionalInterface
public interface MyFunctional {
   
    public final String name = "MyFunctional Interface";
    public void display();
    public default void show() {
        System.out.println("This is a default method in MyFunctional interface.");
    }
    public default void showCar() {
        System.out.println("This is a default method in MyFunctional interface."+ name);
    }
    public static void staticMethod() {
        System.out.println("This is a static method in MyFunctional interface.");
    }
public static void staticMethod1() {
        System.out.println("This is a static method in MyFunctional interface.");
    }
    MyFunctional my= () -> System.out.println("This is a lambda expression implementing the display method in MyFunctional interface.");
    public static void main(String[] args) {
        my.display();

    }
}

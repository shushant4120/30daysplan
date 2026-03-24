package com.prepration.concept.functinalinterface;

public class MyImplementation implements MyFunctional{
  
    @Override
    public void display() {
        System.out.println("This is the implementation of the display method in MyFunctional interface.");
    }
    public void show() {
        System.out.println("This is the overridden default method in MyImplementation class.");
    }
     public void showCar() {
        System.out.println("This is the overridden default method in MyImplementation class."+ name);
    }
    public static void staticMethod() {
        System.out.println("This is the static method in MyImplementation class.");
    }
    public static void main(String[] args) {
        MyImplementation my = new MyImplementation();
        my.display();
        my.show();
        my.showCar();
        MyImplementation.staticMethod();
        MyFunctional.staticMethod();
        MyFunctional.staticMethod1();

    }
}

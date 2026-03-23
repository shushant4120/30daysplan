package com.prepration.concept.oops;

//Inheritance is a fundamental object-oriented programming (OOP) concept that allows a new class (called a subclass or child class)
// to inherit properties and behaviors (fields and methods) from an existing class (called a superclass or parent class).
// The subclass can also have its own unique properties and behaviors, 
// in addition to those inherited from the superclass. This promotes code reusability and establishes a natural hierarchical 
// relationship between classes.
public class Animal {
    Animal(){
        System.out.println("Animal is created");
    }
    public void eat(){
        System.out.println("Animal is eating");
    }
    final void sleep(){
        System.out.println("Animal is sleeping");
    }
    static void run(){
        System.out.println("Animal is running");
    }
}
class Dog extends Animal{
    Dog(){
        System.out.println("Dog is created");
    }
    public void bark(){
        System.out.println("Dog is barking");
    }
    public void eat(){
        System.out.println("Dog is eating");
    }
    static void run(){
        System.out.println("Dog is running");
    }
}
class TestAnimalProp {

    public static void main(String[] args) {
        Dog dog= new Dog();
    //     dog.eat();
    //     dog.bark();
    //     dog.sleep();
    //    Animal a= new Dog();
    //    System.out.println(a.getClass().getName())   ;
    //    a.eat();
    dog.run();
    }
    
}

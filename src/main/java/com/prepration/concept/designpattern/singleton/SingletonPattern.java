package com.prepration.concept.designpattern.singleton;

import lombok.Synchronized;

public class SingletonPattern {
    private static SingletonPattern instance;

    private SingletonPattern() {

    }

    @Synchronized
    public static SingletonPattern getSingletonObject() {

        if (instance == null) {
            instance = new SingletonPattern();
        }
        return instance;
    }
    public void display() {
        System.out.println("Singleton instance method called");
    }
}

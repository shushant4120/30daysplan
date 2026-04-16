package com.prepration.concept.designpattern.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Gender {
    
    public static void main(String[] args) {
        SingletonPattern.getSingletonObject().display();

        try {
            FileInputStream fileInputStream = new FileInputStream("path/to/file");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("File not found exception handled");
        }
        //checked exception example
         try {
            FileReader fileReader = new FileReader("path/to/file");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("File not found exception handled");
        }

    }
}

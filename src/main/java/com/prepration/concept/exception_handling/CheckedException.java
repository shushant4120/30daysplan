package com.prepration.concept.exception_handling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
    public static void main(String[] args) {

        try {
            int i = 10 / 0;
            FileReader fileReader = new FileReader("text.txt");
            System.out.println("Before try block" + fileReader);
        } catch (FileNotFoundException f) {
            System.out.println("Exception handled base level " + " " + f);
        } catch (Exception e) {

            System.out.println("Exception handled" + " " + e);
            System.exit(0);
        } finally {
            /*
             * Q: Will finally always execute?
             * 
             * 👉 YES
             * ❗ Except:
             * 
             * System.exit()
             * JVM crash
             */
            System.out.println("Mein Print hounga finally !!!!!!");
        }

    }
}

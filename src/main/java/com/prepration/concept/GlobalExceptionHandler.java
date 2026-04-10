package com.prepration.concept;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public String handleException(Exception e) {
        System.out.println("Global exception handler " + e);
        return "error";
    }
    public void methodA() throws IOException {
    methodB();
}

public void methodB() throws IOException {
    throw new IOException("File error");
}

}

package com.prepration.concept.exception_handling;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/users")
public class UserControllers {
    

    @GetMapping("/userid/{id}")
    public String  getUserId(@PathVariable int id) {
        return String.valueOf(id);
    }
    
}

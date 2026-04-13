package com.prepration.concept.restapi;

import java.util.List;
import java.util.Map;

import javax.swing.text.Document;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController 
@RequestMapping("/users")

public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/info")
    public List<UserData> getUserInfo(@RequestParam int id){


        List<UserData> result= userService.getUserInfo(id);
        return result;
    }
    @PostMapping("/updateuser")
    public List<UserData> postMethodName(@ Valid @RequestBody UserData entity) {

        //TODO: process POST request
        
        return userService.updateUserInfo(entity);
    }
    @PutMapping("userup/{id}")
    public List<UserData> putMethodName(@PathVariable int id, @Valid @RequestBody UserData entity) {
        //TODO: process PUT request
        
        return userService.updateUserPutCall(id,entity);
    }
    @PutMapping("userup")
    public List<UserData> putMethodNames(@RequestParam int id, @Valid @RequestBody UserData entity) {
        //TODO: process PUT request
        
        return userService.updateUserPutCall(id,entity);
    }
    
    @PatchMapping("useruppatch/{id}")
    public List<UserData> patchUserData(@PathVariable int id,  @RequestBody Map<String, Object> update) {
        //TODO: process PATCH request
        System.out.println("Received PATCH request for user with id: " + id);
        return userService.updateUserPatchCall(id,update.get("name").toString());
    }
    @DeleteMapping("/deleteuser")
    public String deleteUser(@RequestParam int id) {
        //TODO: process DELETE request
        return userService.deleteUserInfo(id);
    }

}

package com.prepration.concept.restapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    
public static  List<UserData>  setUserData(){
List<UserData> list= new ArrayList<>();
list.add(new UserData(1,"John Doe", "john.doe@example.com", 10));
list.add(new UserData(2,"Jane Smith", "jane.smith@example.com", 25));
list.add(new UserData(3,"Alice Johnson", "alice.johnson@example.com", 30));
list.add(new UserData(4,"Bob Brown", "bob.brown@example.com", 35));
list.add(new UserData(5,"Charlie Davis", "charlie.davis@example.com", 40));
return list;
    }
    public List<UserData> getUserInfo(int id) {
       
        List<UserData> list= setUserData();
        List<UserData> result = new ArrayList<>();

        for(UserData data: list){
            if(data.getId()==id){

result.add(data);
            }
        }
        return result;
    }

    public List<UserData> updateUserInfo(UserData entity) {

      List<UserData> list = setUserData();
      list.add(entity);

      return list;
        
    }
    public List<UserData> updateUserPutCall(int id,UserData entity) {

      List<UserData> list = setUserData();
     for(UserData data: list){

        if(data.getId()==id){
            data.setName(entity.getName());
            data.setEmail(entity.getEmail());
            data.setAge(entity.getAge());
        }
     }

      return list;
        
    }
    public List<UserData> updateUserPatchCall(int id, String name) {

    List<UserData> list = setUserData();

    for (UserData data : list) {
        if (data.getId() == id) {

            if (name != null) {
                System.out.println(name);
                data.setName(name);
            }
            
        }
    }
    return list;
}
public String deleteUserInfo(int id) {
    List<UserData> list = setUserData();
    boolean removed = list.removeIf(data -> data.getId() == id);
    if (removed) {
        return "User with id " + id + " has been deleted.";
    } else {
        return "User with id " + id + " not found.";
    }
}
}

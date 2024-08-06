package com.j3appdemo.j3_app.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.j3appdemo.j3_app.models.User;
import com.j3appdemo.j3_app.models.dto.UserDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/v2/api")
public class UserRestController {
    @GetMapping("/details")
    public UserDto details() {
        UserDto userDto = new UserDto();
        User user = new User("sebastian", "Pardo");
        userDto.setTitle("Desarrollando con Spring boot CreativeCode");
        userDto.setUser(user);
        return userDto;
    }

    @GetMapping("/list-details")
    public List<User> listdetails() {
        User user = new User("Juan", "Perez");
        User userA = new User("Camilo", "Hernandez");
        User userB = new User("Martha", "Estupiñan");
        List<User> lstUsers = new ArrayList<>();
        lstUsers.add(user);
        lstUsers.add(userA);
        lstUsers.add(userB);
        return lstUsers;
    }

    // @GetMapping("/details")
    // public UserDto details(){
    // UserDto userDto = new UserDto();
    // User user = new User("sebastian","Pardo");
    // userDto.setTitle("Desarrollando con Spring boot CreativeCode");
    // userDto.setUser( user);
    // return userDto;
    // }

}

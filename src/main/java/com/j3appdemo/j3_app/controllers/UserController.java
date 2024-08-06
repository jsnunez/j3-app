package com.j3appdemo.j3_app.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.j3appdemo.j3_app.models.User;




@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
    User user = new User("Johlver","Pardo","johlver@gmail.com");
    model.addAttribute("title", "Desarrollando con Spring boot CreativeCode");
    model.addAttribute("user", user);
    return "details";
    }
    
    @GetMapping("/list")
    public String list(ModelMap model){
    List<User> users = Arrays.asList(
    new User("Carlos", "Perez","carlos@gmail.com"),
    new User("Martha","Sanchez","martha@gmail"),
    new User("Vicente","Camargo","vicene@gamil.com")
    );
    model.addAttribute("title", "Listado de Usuarios");
    model.addAttribute("users", users);
    return "list";
    }
    
}

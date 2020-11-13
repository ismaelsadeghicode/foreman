package com.javatar2.controller;

import com.javatar2.model.User;
import com.javatar2.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HelloController {

    @Autowired
    private HelloService service;

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping("/users")
    public String users(Model model){
        List<User> users = service.getUser();
        model.addAttribute("users", users);
        return "users";
    }
}

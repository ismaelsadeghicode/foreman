package com.javatar2.controller;

import com.javatar2.dao.UserDao;
import com.javatar2.dao.impl.UserDaoImpl;
import com.javatar2.model.User;
import com.javatar2.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class HelloController {

    @Autowired
    private UserDao userDaoImpl;

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping("/addUser")
    public String addUser(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "addUser";
    }

    @RequestMapping("/users")
    public String users(Model model){
        List<User> users = userDaoImpl.findAllUser();
        model.addAttribute("users", users);
        return "users";
    }

    @RequestMapping(value = "/saveUser",method = RequestMethod.POST)
    public String user(@ModelAttribute("user") User user){
        userDaoImpl.addUser(user);
//        List<User> users = service.getUser();
        return "redirect:/users";
    }

   @RequestMapping("/user/{id}")
    public String users(@PathVariable int id, Model model){
        User user = userDaoImpl.getUserById(id);
        model.addAttribute("user", user);
        return "user";
    }

    @RequestMapping("/delete")
    public String deletUser(@RequestParam("id") int id, Model model){
        User user = userDaoImpl.getUserById(id);
        userDaoImpl.deleteUser(user);
        return "redirect:/users";
    }
}

package com.javatar2.service;

import com.javatar2.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HelloService {

    public List<User> getUser(){
        List<User> users = new ArrayList<User>();
        User user = new User();
        user.setFirstName("ali");
        user.setLastName("sadeghi");

        User user2 = new User();
        user2.setFirstName("poya");
        user2.setLastName("sadeghi");
        users.add(user2);
        return users;
    }
}

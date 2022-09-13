package com.mp.dsjr2022.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.mp.dsjr2022.domain.User;
import com.mp.dsjr2022.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public User getUsers() {
        User a = new User();
        a.setName("randi");
        return a;
    }

    @RequestMapping("/users/{id}")
    public User getUser(@PathVariable("id") Long id ) {
        return userService.findUserById(id);
    }
}

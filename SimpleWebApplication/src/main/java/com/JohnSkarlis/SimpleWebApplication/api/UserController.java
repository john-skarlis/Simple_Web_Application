package com.JohnSkarlis.SimpleWebApplication.api;

import com.JohnSkarlis.SimpleWebApplication.model.User;
import com.JohnSkarlis.SimpleWebApplication.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/api/v1/user")
@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> addUser(User user){
        return userService.addUser(user);
    }
}

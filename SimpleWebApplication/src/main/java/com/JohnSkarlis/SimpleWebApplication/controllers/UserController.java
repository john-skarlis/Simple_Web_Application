package com.JohnSkarlis.SimpleWebApplication.controllers;

import com.JohnSkarlis.SimpleWebApplication.dtos.UserDTO;
import com.JohnSkarlis.SimpleWebApplication.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    //get all users
    @GetMapping
    public List<UserDTO> getUsers() {
        return userService.getUsers();
    }

    //get a specific user by id
    @GetMapping(path = "/{id}")
    public UserDTO getUser(@PathVariable(value = "id") Long user_id) {
        return userService.getUser(user_id);
    }

    //add a user with post method
    @PostMapping
    public String addUser(@RequestBody UserDTO userDTO) {
        return userService.addUser(userDTO);
    }

    //delete a user
    @DeleteMapping(path = "/{id}")
    public void deleteUser(@PathVariable(value = "id") Long user_id) {
        userService.deleteUser(user_id);
    }

}



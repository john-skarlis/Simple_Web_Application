package com.JohnSkarlis.SimpleWebApplication.api;

import com.JohnSkarlis.SimpleWebApplication.dtos.PersonDTO;
import com.JohnSkarlis.SimpleWebApplication.model.User;
import com.JohnSkarlis.SimpleWebApplication.model.UserAddress;
import com.JohnSkarlis.SimpleWebApplication.services.UserAddressService;
import com.JohnSkarlis.SimpleWebApplication.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class ApiController {
    private final UserService userService;
    private final UserAddressService userAddressService;

    @Autowired
    public ApiController(UserService userService, UserAddressService userAddressService) {
        this.userService = userService;
        this.userAddressService = userAddressService;
    }

    //get all users
    @GetMapping(path = "/api/users")
    public List<PersonDTO> getUsers(){
        return userService.getUsers();
    }

    //get a specific user by id
    @GetMapping(path = "/api/user/{id}")
    public PersonDTO getUser(@PathVariable(value = "id") Long user_id){
        return userService.getUser(user_id);
    }

    //add a user with post method
    @PostMapping(path = "/api/user/add")
    public void addALl(@RequestBody PersonDTO personDTO){
        userAddressService.addUserAddress(personDTO);
    }

    //delete a user
    @DeleteMapping(path = "/api/user/del/{id}")
    public void deleteUser(@PathVariable(value = "id") Long user_id){
        userService.deleteUser(user_id);
    }

}



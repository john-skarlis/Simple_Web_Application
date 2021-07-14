package com.JohnSkarlis.SimpleWebApplication.services;

import com.JohnSkarlis.SimpleWebApplication.dtos.UserDTO;
import com.JohnSkarlis.SimpleWebApplication.models.User;
import com.JohnSkarlis.SimpleWebApplication.repositories.UserRepository;
import com.JohnSkarlis.SimpleWebApplication.utils.ConversionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(@Qualifier("userRepository") UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //returns all users
    public List<UserDTO> getUsers() {
        List<User> userList = userRepository.findAll();
        return ConversionUtils.convertToUserDTOList(userList);
    }

    //returns a specific requested user
    public UserDTO getUser(Long userId) {
        User user = userRepository.findById(userId).orElse(null);
        return ConversionUtils.convertToUserDTO(user);
    }

    //register a new user
    public void addUser(UserDTO userDTO) {
        User user = ConversionUtils.convertToUser(userDTO);
        userRepository.save(user);
    }


    //delete a specific user
    public void deleteUser(Long user_id) {
        userRepository.deleteById(user_id);
    }
}

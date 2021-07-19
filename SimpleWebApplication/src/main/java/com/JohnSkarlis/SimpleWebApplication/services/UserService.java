package com.JohnSkarlis.SimpleWebApplication.services;

import com.JohnSkarlis.SimpleWebApplication.dtos.UserDTO;
import com.JohnSkarlis.SimpleWebApplication.models.User;
import com.JohnSkarlis.SimpleWebApplication.repositories.UserRepository;
import com.JohnSkarlis.SimpleWebApplication.utils.ConversionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public String addUser(UserDTO userDTO) {
        String response="";
        User user = ConversionUtils.convertToUser(userDTO);
        if(userRepository.check(user.getName(),user.getSurname(),user.getBirthDate())!= null){
            response = "This user already exists";
        }else{
            userRepository.save(user);
            response = "User saved successfully";
        }
        return response;
    }


    //delete a specific user
    public void deleteUser(Long user_id) {
        userRepository.deleteById(user_id);
    }
}

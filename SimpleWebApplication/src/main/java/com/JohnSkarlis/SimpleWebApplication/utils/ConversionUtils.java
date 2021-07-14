package com.JohnSkarlis.SimpleWebApplication.utils;

import com.JohnSkarlis.SimpleWebApplication.dtos.UserDTO;
import com.JohnSkarlis.SimpleWebApplication.models.User;
import com.JohnSkarlis.SimpleWebApplication.models.UserAddress;

import java.util.ArrayList;
import java.util.List;

public class ConversionUtils {

    private ConversionUtils() {
    }

    public static User convertToUser(UserDTO userDTO) {
        User user = new User();
        user.setName(userDTO.getName());
        user.setSurname(userDTO.getSurname());
        user.setGender(userDTO.getGender());
        user.setBirthDate(userDTO.getBirthDate());
        user.setUserAddress(new UserAddress(userDTO.getHomeAddress(), userDTO.getWorkAddress()));
        return user;
    }

    public static UserDTO convertToUserDTO(User user) {
        if (user != null) {
            UserDTO userDTO = new UserDTO();
            userDTO.setUser_id(user.getId());
            userDTO.setName(user.getName());
            userDTO.setSurname(user.getSurname());
            userDTO.setGender(user.getGender());
            userDTO.setBirthDate(user.getBirthDate());
            userDTO.setAddress_id(user.getUserAddress().getId());
            userDTO.setHomeAddress(user.getUserAddress().getHomeAddress());
            userDTO.setWorkAddress(user.getUserAddress().getWorkAddress());
            return userDTO;
        } else {
            return new UserDTO();
        }
    }

    public static List<UserDTO> convertToUserDTOList(List<User> userList) {
        List<UserDTO> userDTOList = new ArrayList<>();
        for (User user : userList) {
            userDTOList.add(convertToUserDTO(user));
        }
        return userDTOList;
    }
}

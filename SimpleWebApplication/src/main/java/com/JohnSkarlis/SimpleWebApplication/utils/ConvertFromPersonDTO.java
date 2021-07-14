package com.JohnSkarlis.SimpleWebApplication.utils;

import com.JohnSkarlis.SimpleWebApplication.dtos.PersonDTO;
import com.JohnSkarlis.SimpleWebApplication.models.User;
import com.JohnSkarlis.SimpleWebApplication.models.UserAddress;

public class ConvertFromPersonDTO {
   private User user = new User();
   private UserAddress userAddress = new UserAddress();
   private PersonDTO personDTO;

    public ConvertFromPersonDTO(PersonDTO personDTO) {
        this.personDTO = personDTO;
    }

    //convert personDto to user models
    public User getConvertedUser(){
        user.setName(personDTO.getName());
        user.setSurname(personDTO.getSurname());
        user.setGender(personDTO.getGender());
        user.setBirthDate(personDTO.getBirthDate());
        return user;
    }
    //convert personDto to userAddress models
    public UserAddress getConvertedUserAddress(){
        userAddress.setHomeAddress(personDTO.getHomeAddress());
        userAddress.setWorkAddress(personDTO.getWorkAddress());
        return userAddress;
    }
}

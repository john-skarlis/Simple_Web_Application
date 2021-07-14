package com.JohnSkarlis.SimpleWebApplication.utils;

import com.JohnSkarlis.SimpleWebApplication.dtos.PersonDTO;
import com.JohnSkarlis.SimpleWebApplication.model.User;
import com.JohnSkarlis.SimpleWebApplication.model.UserAddress;

public class ConvertToPersonDTO {

    private User user;
    private UserAddress userAddress;
    private PersonDTO personDTO;

    public ConvertToPersonDTO(User user, UserAddress userAddress) {
        this.user = user;
        this.userAddress = userAddress;
    }

    
    public PersonDTO getPersonDTO(){

    }
}

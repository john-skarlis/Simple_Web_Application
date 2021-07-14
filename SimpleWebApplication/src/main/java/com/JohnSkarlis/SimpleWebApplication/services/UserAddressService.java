package com.JohnSkarlis.SimpleWebApplication.services;

import com.JohnSkarlis.SimpleWebApplication.dtos.PersonDTO;
import com.JohnSkarlis.SimpleWebApplication.models.UserAddress;
import com.JohnSkarlis.SimpleWebApplication.repositories.UserAddressRepository;
import com.JohnSkarlis.SimpleWebApplication.utils.ConvertFromPersonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserAddressService {

    private final UserAddressRepository userAddressRepository;
    private final UserService userService;


    @Autowired
    public UserAddressService(@Qualifier("userAddressRepository") UserAddressRepository userAddressRepository, UserService userService) {
        this.userAddressRepository = userAddressRepository;
        this.userService = userService;
    }


    //register a new user
    public void addUserAddress(PersonDTO personDTO){
        ConvertFromPersonDTO convertFromPersonDTO = new ConvertFromPersonDTO(personDTO);
        UserAddress userAddress = convertFromPersonDTO.getConvertedUserAddress();
        userAddressRepository.save(userAddress);
        userService.addUser(personDTO,userAddress);
    }
}

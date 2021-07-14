package com.JohnSkarlis.SimpleWebApplication.services;

import com.JohnSkarlis.SimpleWebApplication.dtos.PersonDTO;
import com.JohnSkarlis.SimpleWebApplication.models.User;
import com.JohnSkarlis.SimpleWebApplication.models.UserAddress;
import com.JohnSkarlis.SimpleWebApplication.repositories.UserRepository;
import com.JohnSkarlis.SimpleWebApplication.utils.ConvertFromPersonDTO;
import com.JohnSkarlis.SimpleWebApplication.utils.ConvertToPersonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository ;

    @Autowired
    public UserService(@Qualifier("userRepository") UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    //returns all users
    public List<PersonDTO> getUsers(){
        ConvertToPersonDTO convertToPersonDTO = new ConvertToPersonDTO(userRepository.findAll());
        List<PersonDTO> personDTOList = convertToPersonDTO.getPersonDTOList();
        return personDTOList;
    }
    //returns a specific requested user
    public PersonDTO getUser(Long user_id){
        ConvertToPersonDTO convertToPersonDTO = new ConvertToPersonDTO(userRepository.findById(user_id).get());
        PersonDTO personDTO = convertToPersonDTO.getPersonDTO();
        return personDTO;
    }

    //register a new user
    public void addUser(PersonDTO personDTO , UserAddress userAddress) {
        ConvertFromPersonDTO convertFromPersonDTO = new ConvertFromPersonDTO(personDTO);
        User user = convertFromPersonDTO.getConvertedUser();
        user.setUserAddress(userAddress);
        userRepository.save(user);
    }

    //delete a specific user
    public void deleteUser(Long user_id){
        userRepository.deleteById(user_id);
    }
}

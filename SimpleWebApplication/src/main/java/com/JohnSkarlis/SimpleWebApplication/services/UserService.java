package com.JohnSkarlis.SimpleWebApplication.services;

import com.JohnSkarlis.SimpleWebApplication.dtos.PersonDTO;
import com.JohnSkarlis.SimpleWebApplication.model.UserAddress;
import com.JohnSkarlis.SimpleWebApplication.repositories.UserRepository;
import com.JohnSkarlis.SimpleWebApplication.model.User;
import com.JohnSkarlis.SimpleWebApplication.utils.ConvertFromPersonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository ;

    @Autowired
    public UserService(@Qualifier("userRepository") UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers(User user){
            return userRepository.findAll();
    }

    public Optional<User> getUser(Long user_id){
        return userRepository.findById(user_id);
    }

    //register a new user
    public void addUser(PersonDTO personDTO , UserAddress userAddress) {
        ConvertFromPersonDTO convertFromPersonDTO = new ConvertFromPersonDTO(personDTO);
        User user = convertFromPersonDTO.getConvertedUser();
        user.setUserAddress(userAddress);
        userRepository.save(user);
    }
}

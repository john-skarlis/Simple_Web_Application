package com.JohnSkarlis.SimpleWebApplication.utils;

import com.JohnSkarlis.SimpleWebApplication.dtos.PersonDTO;
import com.JohnSkarlis.SimpleWebApplication.model.User;

import java.util.ArrayList;
import java.util.List;

public class ConvertToPersonDTO {

    private User user;
    private List<User> userList;
    private PersonDTO personDTO = new PersonDTO();

    public ConvertToPersonDTO(User user) {
        this.user = user;
    }

    public ConvertToPersonDTO(List<User> userList) {
        this.userList = userList;
    }

    public List<PersonDTO> getPersonDTOList(){
        List<PersonDTO> personDTOList = new ArrayList<>();
        for (User user: userList){
            PersonDTO personDTO = new PersonDTO();
            personDTO.setUser_id(user.getId());
            personDTO.setName(user.getName());
            personDTO.setSurname(user.getSurname());
            personDTO.setGender(user.getGender());
            personDTO.setBirthDate(user.getBirthDate());
            personDTO.setAddress_id(user.getUserAddress().getId());
            personDTO.setHomeAddress(user.getUserAddress().getHomeAddress());
            personDTO.setWorkAddress(user.getUserAddress().getWorkAddress());
            personDTOList.add(personDTO);
        }
        return personDTOList;
    }

    public PersonDTO getPersonDTO(){
        personDTO.setUser_id(user.getId());
        personDTO.setName(user.getName());
        personDTO.setSurname(user.getSurname());
        personDTO.setGender(user.getGender());
        personDTO.setBirthDate(user.getBirthDate());
        personDTO.setAddress_id(user.getUserAddress().getId());
        personDTO.setHomeAddress(user.getUserAddress().getHomeAddress());
        personDTO.setWorkAddress(user.getUserAddress().getWorkAddress());
        return personDTO;
    }
}

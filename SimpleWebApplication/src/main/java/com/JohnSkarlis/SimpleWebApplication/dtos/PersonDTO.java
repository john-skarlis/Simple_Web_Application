package com.JohnSkarlis.SimpleWebApplication.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class PersonDTO {
    private Long user_id;
    private String name;
    private String surname;
    private String gender;
    private LocalDate birthDate;
    private Long address_id;
    private String homeAddress;
    private String workAddress;

    public PersonDTO() {
    }

    public PersonDTO(@JsonProperty("name")String name,
                     @JsonProperty("surname")String surname,
                     @JsonProperty("gender")String gender,
                     @JsonProperty("date")LocalDate birthDate,
                     @JsonProperty("home_address")String homeAddress,
                     @JsonProperty("work_address")String workAddress) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthDate = birthDate;
        this.homeAddress = homeAddress;
        this.workAddress = workAddress;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Long getAddress_id() {
        return address_id;
    }

    public void setAddress_id(Long address_id) {
        this.address_id = address_id;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

}

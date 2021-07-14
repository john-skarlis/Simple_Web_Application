package com.JohnSkarlis.SimpleWebApplication.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="surname")
    private String surname;

    @Column(name="gender")
    private String gender;

    @Column(name="birth_date")
    private LocalDate birthDate;


    @OneToOne
    @JoinColumn(name = "address_id")
    private UserAddress userAddress;

//    @OneToOne
//    private UserAddress userAddress;

//    @Column(name="home_address")
//    private String homeAddress;


    public User() {
    }

    public User(@JsonProperty("name")String name,
                @JsonProperty("surname")String surname,
                @JsonProperty("gender")String gender,
                @JsonProperty("date")LocalDate birthDate,
                @JsonProperty("userAddress")UserAddress userAddress) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthDate = birthDate;
        this.userAddress = userAddress;
    }


        public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public UserAddress getUserAddress() {
        return userAddress;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setUserAddress(UserAddress userAddress) {
        this.userAddress = userAddress;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate=" + birthDate +
                ", userAddress=" + userAddress +
                '}';
    }
}

package com.JohnSkarlis.SimpleWebApplication.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "userAddress")
public class UserAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long id;

//    @OneToOne
//    @JoinColumn(name = "user_id")
//    private User user;

    @Column(name = "home_address")
    private String homeAddress;

    @Column(name = "work_address")
    private String workAddress;

    public UserAddress() {
    }

    public UserAddress(@JsonProperty("home_address")String homeAddress,
                       @JsonProperty("work_address")String workAddress) {
//        this.user = user;
        this.homeAddress = homeAddress;
        this.workAddress = workAddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }

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

    @Override
    public String toString() {
        return "UserAddress{" +
                "id=" + id +
//                ", userId=" + user +
                ", homeAddress='" + homeAddress + '\'' +
                ", workAddress='" + workAddress + '\'' +
                '}';
    }
}

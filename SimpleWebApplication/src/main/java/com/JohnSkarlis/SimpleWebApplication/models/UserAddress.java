package com.JohnSkarlis.SimpleWebApplication.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Table(name = "userAddress")
public class UserAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long id;

    @Nullable
    @Column(name = "home_address")
    private String homeAddress;

    @Nullable
    @Column(name = "work_address")
    private String workAddress;

    public UserAddress() {
    }

    public UserAddress(@JsonProperty("home_address") String homeAddress,
                       @JsonProperty("work_address") String workAddress) {
        this.homeAddress = homeAddress;
        this.workAddress = workAddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "UserAddress{" +
                "id=" + id +
                ", homeAddress='" + homeAddress + '\'' +
                ", workAddress='" + workAddress + '\'' +
                '}';
    }
}

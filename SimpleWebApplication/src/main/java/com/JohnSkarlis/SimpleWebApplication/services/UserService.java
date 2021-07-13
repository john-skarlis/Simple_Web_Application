package com.JohnSkarlis.SimpleWebApplication.services;

import com.JohnSkarlis.SimpleWebApplication.dao.UserDao;
import com.JohnSkarlis.SimpleWebApplication.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserDao userdao;

    @Autowired
    public UserService(@Qualifier("userDao") UserDao userdao) {
        this.userdao = userdao;
    }

    public List<User> getUsers(User user){
        return userdao.findAll();
    }

    public void addUser(User user) {
        System.out.println(user);
        //userdao.save(user);
    }
}

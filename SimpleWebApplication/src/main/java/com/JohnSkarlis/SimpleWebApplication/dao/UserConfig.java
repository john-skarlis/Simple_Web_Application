package com.JohnSkarlis.SimpleWebApplication.dao;

import com.JohnSkarlis.SimpleWebApplication.model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserDao userDao) {
        return args -> {
            User john = new User(
                    "John",
                    "Skarlis",
                    "Male",
                    LocalDate.of(1997, 11, 27),
                    "Vasilika"
            );

            User nick = new User(
                    "Nick",
                    "Papado",
                    "Male",
                    LocalDate.of(1999, 5, 13),
                    "Thermi"
            );
            userDao.saveAll(
                    List.of(john,nick)
            );
        };
    }

}

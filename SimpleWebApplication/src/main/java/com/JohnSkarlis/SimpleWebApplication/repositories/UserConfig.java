package com.JohnSkarlis.SimpleWebApplication.repositories;

import com.JohnSkarlis.SimpleWebApplication.model.User;
import com.JohnSkarlis.SimpleWebApplication.model.UserAddress;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository,UserAddressRepository userAddressRepository) {
        return args -> {
            User john = new User(
                    "John",
                    "Skarlis",
                    "Male",
                    LocalDate.of(1997, 11, 27)
            );

            User nick = new User(
                    "Nick",
                    "Papado",
                    "Male",
                    LocalDate.of(1999, 5, 13)
            );

            UserAddress address = new UserAddress(john,"vasilika","thessaloniki");
            userRepository.saveAll(
                    List.of(john,nick)
            );
            userAddressRepository.saveAll(List.of(address));
        };
    }

}

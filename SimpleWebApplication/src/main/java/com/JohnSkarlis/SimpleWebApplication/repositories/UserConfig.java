package com.JohnSkarlis.SimpleWebApplication.repositories;

import com.JohnSkarlis.SimpleWebApplication.models.User;
import com.JohnSkarlis.SimpleWebApplication.models.UserAddress;
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
            UserAddress address1 = new UserAddress("vasilika","thessaloniki");
            UserAddress address2 = new UserAddress("thermi","athens");
            User john = new User(
                    "John",
                    "Skarlis",
                    "Male",
                    LocalDate.of(1997, 11, 27),
                    address1
            );

            User nick = new User(
                    "Nick",
                    "Papado",
                    "Male",
                    LocalDate.of(1999, 5, 13),
                    address2
            );

            userAddressRepository.saveAll(List.of(address1,address2));
            userRepository.saveAll(
                    List.of(john,nick)
            );

        };
    }

}

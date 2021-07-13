package com.JohnSkarlis.SimpleWebApplication.repositories;

import com.JohnSkarlis.SimpleWebApplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User,Long> {

    //@Query(value = "SELECT u FROM User u WHERE ")
    //Optional<User> findByAll(String name, String surname, LocalDate birthDate, String homeAddress);

}

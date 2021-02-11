package com.example.spring_start.repository;

import com.example.spring_start.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndActivationCode(String email, String activationCode);

}

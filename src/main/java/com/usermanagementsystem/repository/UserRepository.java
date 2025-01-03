package com.usermanagementsystem.repository;

import com.usermanagementsystem.model.OurUsers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<OurUsers, Integer> {
    Optional<OurUsers> findByEmail(String email);
}

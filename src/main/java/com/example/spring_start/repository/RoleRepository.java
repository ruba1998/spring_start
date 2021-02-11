package com.example.spring_start.repository;

import com.example.spring_start.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {

    Role findByName(String name);

}

package com.example.onlinequiz.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onlinequiz.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}

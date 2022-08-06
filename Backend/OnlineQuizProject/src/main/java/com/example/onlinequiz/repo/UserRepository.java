package com.example.onlinequiz.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onlinequiz.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	public User findByUsername(String username);

}

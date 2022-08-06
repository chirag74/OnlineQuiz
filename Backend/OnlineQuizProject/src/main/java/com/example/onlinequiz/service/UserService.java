package com.example.onlinequiz.service;

import java.util.Set;

import com.example.onlinequiz.entity.User;
import com.example.onlinequiz.entity.UserRole;

public interface UserService {
	//Creating a User
	public User createUser(User user, Set<UserRole> userRoles);
	//Getting user by uasername
	public User getUser(String username);
	//deleting user by ID 
	public void deleteUser(Long userId);

}

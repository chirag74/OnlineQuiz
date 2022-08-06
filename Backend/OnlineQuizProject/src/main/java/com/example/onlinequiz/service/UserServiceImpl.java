package com.example.onlinequiz.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlinequiz.entity.User;
import com.example.onlinequiz.entity.UserRole;
import com.example.onlinequiz.repo.RoleRepository;
import com.example.onlinequiz.repo.UserRepository;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository; 
	@Autowired
	private RoleRepository roleRepository;
	@Override
	public User createUser(User user, Set<UserRole> userRoles) {
		
		User local = this.userRepository.findByUsername(user.getUsername());
		if(local != null) {
			System.out.println("User is already present my G");
			//throw new Exception("User is already present bruh");
		}
		else {
			//user create 
			for(UserRole ur: userRoles) {
				roleRepository.save(ur.getRole());
			}
			user.getUserRoles().addAll(userRoles);
			local = this.userRepository.save(user);
			
		}
		return local;
		
	}
	@Override
	public User getUser(String username) {
		return this.userRepository.findByUsername(username);
	}
	@Override
	public void deleteUser(Long userId) {
		this.userRepository.deleteById(userId);
		
	}

}

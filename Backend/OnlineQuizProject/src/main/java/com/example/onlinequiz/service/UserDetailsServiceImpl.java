package com.example.onlinequiz.service;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.onlinequiz.entity.User;
import com.example.onlinequiz.repo.UserRepository;
@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	@Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username)  {

        User user = this.userRepository.findByUsername(username);
        if (user == null) {
            System.out.println("User not found");
        }

        return user;
    }
	

}

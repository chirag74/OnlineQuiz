package com.example.onlinequiz;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.onlinequiz.entity.Role;
import com.example.onlinequiz.entity.User;
import com.example.onlinequiz.entity.UserRole;
import com.example.onlinequiz.service.UserService;

@SpringBootApplication
public class OnlineQuizProjectApplication implements CommandLineRunner{

	@Autowired
	private UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(OnlineQuizProjectApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Starting Code");
		
		User user = new User();

        user.setFirstName("Rishabh");
        user.setLastName("Tiwari");
        user.setUsername("Rishabh99");
        user.setPassword("abc");
        user.setEmail("email@gmail.com");
        user.setProfile("default.png");

        Role role1 = new Role();
        role1.setRoleId(44L);
        role1.setRoleName("ADMIN");

        Set<UserRole> userRoleSet = new HashSet<>();
        UserRole userRole = new UserRole();

        userRole.setRole(role1);

        userRole.setUser(user);

        userRoleSet.add(userRole);

        User user1 = this.userService.createUser(user, userRoleSet);
        System.out.println(user1.getUsername());


    } 
	/*catch (UserFoundException e) {
        e.printStackTrace();


    

*/		
	}




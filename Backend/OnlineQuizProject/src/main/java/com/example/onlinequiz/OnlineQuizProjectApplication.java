package com.example.onlinequiz;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.onlinequiz.entity.Role;
import com.example.onlinequiz.entity.User;
import com.example.onlinequiz.entity.UserRole;
import com.example.onlinequiz.exceptions.UserFoundException;
//import com.example.onlinequiz.exceptions.UserFoundException;
import com.example.onlinequiz.service.UserService;

@SpringBootApplication
public class OnlineQuizProjectApplication implements CommandLineRunner{

	@Autowired
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

//    @Autowired
//    public QuizRepository quizRepository;
//
   public static void main(String[] args) {
//

        SpringApplication.run(OnlineQuizProjectApplication.class, args);


    }

    @Override
    public void run(String... args) throws Exception {
//        try {


            System.out.println("starting code");
//
            User user = new User();

            user.setFirstName("Rishabh");
            user.setLastName("Tiwari");
            user.setUsername("rishabh99");
            user.setPassword(this.bCryptPasswordEncoder.encode("abc"));
            user.setEmail("abc@gmail.com");
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


//        } catch (UserFoundException e) {
//            e.printStackTrace();
//
//
//        }


    }
}
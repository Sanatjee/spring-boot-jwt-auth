package com.enigma.userservice;

import com.enigma.userservice.domain.Role;
import com.enigma.userservice.domain.User;
import com.enigma.userservice.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class UserserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserserviceApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}

	@Bean
	CommandLineRunner run(UserService userService){
		 return args -> {
		 	userService.saveRole(new Role(null,"ROLE_USER"));
		 	userService.saveRole(new Role(null,"ROLE_MANAGER"));
		 	userService.saveRole(new Role(null,"ROLE_ADMIN"));
		 	userService.saveRole(new Role(null,"ROLE_SUPER_ADMIN"));

		 	userService.saveUser(new User(null,"Sanat Gawade","SanatJee","dasnadas369",new ArrayList<>()));
		 	userService.saveUser(new User(null,"Alisha Gawade","AliJee","dasnadas369",new ArrayList<>()));
		 	userService.saveUser(new User(null,"Nikhil Chavan","Niks","dasnadas369",new ArrayList<>()));
		 	userService.saveUser(new User(null,"Jueeli Chavan","JLee","dasnadas369",new ArrayList<>()));
		 	userService.saveUser(new User(null,"Mohit Tanna","Moehit10nna","dasnadas369",new ArrayList<>()));
		 	userService.saveUser(new User(null,"Rujul Shringarpure","Cornto","dasnadas369",new ArrayList<>()));

		 	userService.assignRoleToUser("SanatJee","ROLE_USER");
			 userService.assignRoleToUser("SanatJee","ROLE_MANAGER");
			 userService.assignRoleToUser("SanatJee","ROLE_ADMIN");
			 userService.assignRoleToUser("SanatJee","ROLE_SUPER_ADMIN");
			 userService.assignRoleToUser("AliJee","ROLE_USER");
			 userService.assignRoleToUser("Niks","ROLE_USER");
			 userService.assignRoleToUser("JLee","ROLE_USER");
			 userService.assignRoleToUser("Moehit10nna","ROLE_USER");
			 userService.assignRoleToUser("Cornto","ROLE_USER");
		 };
	}
}

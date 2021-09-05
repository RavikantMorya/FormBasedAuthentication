package com.learn;

import com.learn.model.User;
import com.learn.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringSecurityLearnApplication implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {

		SpringApplication.run(SpringSecurityLearnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		User user=new User();

		user.setUsername("ravi");
		user.setPassword(bCryptPasswordEncoder.encode("ravi"));
		user.setEmail("ravi@gmail.com");
		user.setRole("ROLE_ADMIN");
		this.userRepository.save(user);

		User user1=new User();
		user1.setUsername("john");
		user1.setPassword(bCryptPasswordEncoder.encode("pass"));
		user1.setEmail("john@gmail.com");
		user1.setRole("ROLE_NORMAL");
		this.userRepository.save(user1);

	}
}

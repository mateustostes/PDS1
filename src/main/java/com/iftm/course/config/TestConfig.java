package com.iftm.course.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.iftm.course.repositories.userRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private userRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		user u1 = new user(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		user u2 = new user(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
	
	
}

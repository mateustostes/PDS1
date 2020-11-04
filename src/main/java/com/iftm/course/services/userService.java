package com.iftm.course.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.iftm.course.repositories.userRepository;
import com.iftm.course.repositories.user;

@Service
public class userService {
	
	@Autowired
	private userRepository repository;
	
	public List<user> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj repository.findById(id);
		return obj.get();
	}

}

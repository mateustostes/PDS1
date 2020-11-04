package com.iftm.course.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.iftm.course.repositories.OrderRepository;
import com.iftm.course.repositories.Order;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj repository.findById(id);
		return obj.get();
	}

}

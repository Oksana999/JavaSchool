package com.claim.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claim.entity.User;
import com.claim.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public void register(User user) {
		userRepository.save(user);  // save user to DB
	}

	public User login(String email, String password) {
		return userRepository.findByEmailAndPassword(email, password);
	}
	
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}


}

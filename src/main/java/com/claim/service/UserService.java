package com.claim.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.claim.repository.UserRepository;
import com.claim.entity.User;

@Service
public class UserService {
	
//	@PersistenceContext
//	private EntityManager entityManager;
	
	@Autowired
	private UserRepository userRepository;
	
	//String login ="Select U.* from User U where U.email=:email and U.password=:password";
	
	//String certificate = "Select U.*from User U where U.fName=:fName and U.lName=:lName";

	public void register(User user) {
		userRepository.save(user);  // save user to DB
	}
	
/*	public User login(String email, String password)
	{
		return entityManager.createNamedQuery(login, User.class)
				.setParameter("email", email)
				.setParameter("password", password)
				.getSingleResult();
	}*/

	public User login(String email, String password) {
		return userRepository.findByEmailAndPassword(email, password);
	}
	
	public User certificate(String fName, String lName) {
		return userRepository.findByEmailAndPassword(fName, lName);
	}
	
	public User logout(String email, String password) {
		return userRepository.findByEmailAndPassword(email, password);
	}

}

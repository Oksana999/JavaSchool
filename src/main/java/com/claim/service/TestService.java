package com.claim.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claim.entity.QuestionsAnswers;
import com.claim.entity.User;
import com.claim.repository.QuestionsAnswersRepository;
import com.claim.repository.UserRepository;

@Service
public class TestService {
	
	@Autowired
	private QuestionsAnswersRepository questions_answersRepository;
	
	String question = "Select U.* from questions_answers U where U.question_id=:1";

	public void register(QuestionsAnswers questions_answers) {
		questions_answersRepository.save(questions_answers);
	}
}

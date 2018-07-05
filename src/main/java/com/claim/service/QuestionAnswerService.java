package com.claim.service;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claim.entity.QuestionsAnswers;
import com.claim.entity.User;
import com.claim.repository.QuestionsAnswersRepository;
import com.claim.repository.UserRepository;

@Service
public class QuestionAnswerService {
		
	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private QuestionsAnswersRepository questions_answersRepository;
			
	@Transactional
	public ArrayList<QuestionsAnswers> getAllQuestions() {
		return questions_answersRepository.getAllQuestions();
	}

}

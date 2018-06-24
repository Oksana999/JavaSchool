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
		
		
		
	/*	@Transactional
		public void test(QuestionsAnswers questions_answers)
		{
			questions_answersRepository.save(questions_answers);
		}
		
		
		@Transactional
		public QuestionsAnswers test(String answers_selections, String rightAnswer)
		{
			return entityManager.createNamedQuery(test, QuestionsAnswers.class)
					.setParameter("answer_selection", answers_selections)
					.setParameter("rightAnswer", rightAnswer)
					.getSingleResult();
		}*/
		
	@Transactional
	public ArrayList<QuestionsAnswers> getAllQuestions() {
		return questions_answersRepository.getAllQuestions();
	}

}

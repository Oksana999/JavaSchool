package com.claim.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.claim.entity.QuestionsAnswers;

@Repository
public interface QuestionsAnswersRepository extends JpaRepository<QuestionsAnswers, Integer>{

	@Query("Select Q from QuestionsAnswers Q")
	public ArrayList<QuestionsAnswers> getAllQuestions();
}

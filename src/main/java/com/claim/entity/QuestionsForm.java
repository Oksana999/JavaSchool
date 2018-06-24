package com.claim.entity;

import java.util.List;

public class QuestionsForm {
	
	private List<QuestionsAnswers> questionsAnswersList;

	public QuestionsForm(List<QuestionsAnswers> questionsAnswersList) {
		super();
		this.questionsAnswersList = questionsAnswersList;
	}

	public List<QuestionsAnswers> getQuestionsAnswersList() {
		return questionsAnswersList;
	}

	public void setQuestionsAnswersList(List<QuestionsAnswers> questionsAnswersList) {
		this.questionsAnswersList = questionsAnswersList;
	}
	
	

}

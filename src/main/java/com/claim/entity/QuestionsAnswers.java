package com.claim.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="questions_answers")
public class QuestionsAnswers {

	@Id
	private int question_id;
	@Column
	private String question;
	@Column
	private String optionA;
	@Column
	private String optionB;
	@Column
	private String optionC;
	@Column
	private String right_answer;
	
	public QuestionsAnswers() {
		super();
	}

	public QuestionsAnswers(int question_id, String question, String optionA, String optionB, String optionC,
			String right_answer) {
		super();
		this.question_id = question_id;
		this.question = question;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.right_answer = right_answer;
	}

	public int getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getOptionA() {
		return optionA;
	}

	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}

	public String getOptionB() {
		return optionB;
	}

	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}

	public String getOptionC() {
		return optionC;
	}

	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}

	public String getRight_answer() {
		return right_answer;
	}

	public void setRight_answer(String right_answer) {
		this.right_answer = right_answer;
	}

	@Override
	public String toString() {
		return "QuestionsAnswers [question_id=" + question_id + ", question=" + question + ", optionA=" + optionA
				+ ", optionB=" + optionB + ", optionC=" + optionC + ", right_answer=" + right_answer + "]";
	}



}

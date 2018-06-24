package com.claim.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.claim.entity.Grade;
import com.claim.entity.QuestionsAnswers;
import com.claim.entity.QuestionsForm;
import com.claim.entity.User;
import com.claim.service.GradeService;
import com.claim.service.QuestionAnswerService;

@Controller
public class TestController {

	@Autowired
	private QuestionAnswerService questionService;
	@Autowired
	private GradeService gradeService;

	@RequestMapping(value = "test", method = RequestMethod.GET)
	public ModelAndView myClass(HttpSession session) {
		User user = (User) session.getAttribute("currentUser");
		if (user != null) {
			session.setAttribute("currentUser", user);
		}else {
			
			return new ModelAndView("login", "user", new User());
		}
		ArrayList<QuestionsAnswers> questionsList = questionService.getAllQuestions();
		return new ModelAndView("test", "questions", new QuestionsForm(questionsList));
	}
	
	public ModelAndView quesions_answers() {

		ArrayList<QuestionsAnswers> questionsList = questionService.getAllQuestions();
		
		return new ModelAndView("test", "questions", new QuestionsForm(questionsList));
	}
	
	@RequestMapping(value = "test", method = RequestMethod.POST)
	public ModelAndView check_quesions_answers(HttpSession session, @ModelAttribute("questions") QuestionsForm questions) {
		User user = (User) session.getAttribute("currentUser");
		int score = 0;
		ArrayList<QuestionsAnswers> questionsListDB = questionService.getAllQuestions();
		for (int i = 0; i < questions.getQuestionsAnswersList().size(); i++) {
			if (questions.getQuestionsAnswersList().get(i).getRight_answer()
					.equals(questionsListDB.get(i).getRight_answer())) {
				score = score + 10;
			}
		}

		Grade grade = determineGrade(score, user);
		gradeService.saveGrade(grade);

		return new ModelAndView("result", "grade", grade);
	}
	
	private Grade determineGrade(int score, User user) {
		Grade gradeObj = new Grade();
		String grade = null;
		if (score > 40) {
			grade = "A";
		} else if (30 < score && score <= 40) {
			grade = "B";
		} else if (20 < score && score <= 30) {
			grade = "C";
		} else {
			grade = "D";
		}
		gradeObj.setGrade(grade);
		gradeObj.setScore(score);
		gradeObj.setUserId(user.getUserId());
		//gradeObj.setDate(new Date());
	
		return gradeObj;
		
	}
     
}

// process the answers

// calculate the points

// determine the mark based on points

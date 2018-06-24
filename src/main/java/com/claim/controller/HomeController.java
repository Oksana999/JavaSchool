package com.claim.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.claim.service.QuestionAnswerService;
import com.claim.service.UserService;
import com.claim.entity.QuestionsAnswers;
import  com.claim.entity.User;;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping(value="about", method = RequestMethod.GET)
	public String about() {
		
		return "about";
	}

	@RequestMapping(value="/login", method = RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView("login");
		modelAndView.addObject("user", new User());
		
		return modelAndView;
		
		//return new ModelAndView ("login", "user", new User());
	}
	
	@RequestMapping(value="/register", method = RequestMethod.GET)
	public ModelAndView register() {
		return new ModelAndView ("register", "user", new User());
	}
	
	@RequestMapping(value="/register", method = RequestMethod.POST)	
	public String register (@ModelAttribute("user") User user) {
		System.out.println("Info received:");
		userService.register(user);
		return "login";
	}
	
	
	@RequestMapping(value="lesson1", method = RequestMethod.GET)	
	public String lesson1() {
		
		return "lesson1";
	}
	
	@RequestMapping(value="succesfulLogin", method = RequestMethod.GET)	
	public String succesfulLogin() {
		
		return "home";
	}
	@RequestMapping(value="lesson2", method = RequestMethod.GET)	
	public String lesson2() {
		
		return "lesson2";
	}
	@RequestMapping(value="lesson3", method = RequestMethod.GET)	
	public String lesson3() {
			
			return "lesson3";
	}
	@RequestMapping(value="result", method = RequestMethod.GET)	
	public String result() {
			
			return "result";
	}
/*	@RequestMapping(value="logout", method = RequestMethod.GET)	
	public String logout() {
			
			return "logout";
	}*/
}
	
	
	
	
	//@RequestMapping(value="/test", method = RequestMethod.POST)	
	//public String test (@ModelAttribute("questions_answers") QuestionsAnswers questions_answers) {
		//QuestionsAnswers questions_answers1 = questions_answers.Service.test(questions_answers.getQuestion(),
		//		questions_answers.getRight_Answer());
	//	int counter = 0;
	/*	if(QuestionAnswerService.test(questions_answers.getOptionA().equals(questions_answers.getRight_Answer())) ) {
			
			counter = counter +10;*/
		//	return  "test";
		
//	}
	






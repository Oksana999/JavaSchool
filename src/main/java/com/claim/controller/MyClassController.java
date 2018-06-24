package com.claim.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.claim.entity.User;

@Controller
public class MyClassController {
	
	@RequestMapping(value="myclass", method = RequestMethod.GET)	
	public ModelAndView myClass(HttpSession session) {
		User user = (User) session.getAttribute("currentUser");
		if (user != null) {
			return new ModelAndView("myclass", "user", new User());
		} else {
			return new ModelAndView("login", "user", new User());
		}
	}
	
	@RequestMapping(value="lessons", method = RequestMethod.GET)	
	public String lessons() {
		
		return "lessons";
	}

	// 1 create SQL and tables
	// 1.1 fill the tables (optional)
	// 2 read tutorial about Hibernate
	// 
	
	// table test: test_id, user_id, number_total_questions, number_correct_answ, mark, date_taken
}

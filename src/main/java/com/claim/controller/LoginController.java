package com.claim.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.claim.entity.User;
import com.claim.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/login")
	public ModelAndView login() {

		return new ModelAndView("login", "user", new User());
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView loginUser(HttpSession session, @ModelAttribute("user") User user) {
		System.out.println(user);

		User user1 = userService.login(user.getEmail(), user.getPassword());
		
		if(user1 != null) {
			session.setAttribute("currentUser", user1);
			return new ModelAndView("home", "user", new User());
		}
		else
			return new ModelAndView("login", "message", "Please, login");
	}
	
/*	request.getSession().invalidate();
			response.sendRedirect("car-store");*/
	

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public ModelAndView logoutUser(HttpSession session, @ModelAttribute("user") User user) {
		//System.out.println(user);
		session.invalidate();
	/*	User user2 = userService.login(user.getEmail(), user.getPassword());
		
		if(user2 != null) {
			session.setAttribute("currentUser", user2);
			return new ModelAndView("logout", "user", new User());
		}else */
		return new ModelAndView("home", "user", new User());
	}

}




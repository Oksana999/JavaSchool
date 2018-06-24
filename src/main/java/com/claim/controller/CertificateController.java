package com.claim.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.claim.entity.User;
import com.claim.service.GradeService;

@Controller
public class CertificateController {
    
	@Autowired
	private GradeService gradeService;
	
	@RequestMapping(value = "certificate", method = RequestMethod.GET)
	public ModelAndView getCertificatePage(HttpSession session) {
		User user = (User) session.getAttribute("currentUser");
		if (user != null) {
			LocalDate localDate = LocalDate.now();
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");

			ModelAndView modelAndView = new ModelAndView("certificate");
			modelAndView.addObject("grade", gradeService.findGradeByUserId(user.getUserId()));
			modelAndView.addObject("date", dtf.format(localDate));
			modelAndView.addObject("currentUser", user);
			return modelAndView;
		} else
			return new ModelAndView("login", "user", new User());
	}

	@RequestMapping(value = "certificate", method = RequestMethod.POST)
	public ModelAndView certificate() {

		return new ModelAndView("certificate", "user", new User());
	}

	/*
	 * CODE FOR CERTIFICATE
	 * 
	 * LocalDate localDate = LocalDate.now(); DateTimeFormatter dtf =
	 * DateTimeFormatter.ofPattern("MM/dd/yyyy");
	 * 
	 * ModelAndView modelAndView = new ModelAndView("certificate");
	 * modelAndView.addObject("currentGrade", "A"); modelAndView.addObject("date",
	 * dtf.format(localDate));
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	// User user1 = userService.login(user.getEmail(), user.getPassword());

}
/*
 * @RequestMapping(value = "/user", method = RequestMethod.POST) public String
 * user(@ModelAttribute("user") User user) { System.out.println(user); User
 * fullName = userService.certificate(user.getfName(), user.getlName());
 * 
 * if(user1 != null) { session.setAttribute("currentUser", "user1"); return
 * "successfulLogin"; } }
 */
/*
 * @RequestMapping(value = "/login", method = RequestMethod.POST) public String
 * loginUser(HttpSession session, @ModelAttribute("user") User user) {
 * System.out.println(user);
 * 
 * return "fName";
 */

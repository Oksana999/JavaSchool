package com.claim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Lesson1Controller {
			
		@RequestMapping(value="lesson1", method = RequestMethod.POST)
		public String lessons() {
			
			return "lesson1";
		}

}

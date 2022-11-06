package com.talentinvest.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
 
	@RequestMapping("/Login")
	public ModelAndView LoginPage() {
		ModelAndView mav = new ModelAndView("Login");
		return mav;
	}
}

package com.talentinvest.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LecturersController {

	@RequestMapping("/Lecturers")
	public ModelAndView LecturersPage() {
		ModelAndView mav = new ModelAndView("Lecturers");

		return mav;
	}
	
	@RequestMapping("/CreateLecturer")
	public ModelAndView CreateLecturerPage() {
		ModelAndView mav = new ModelAndView("CreateLecturer");

		return mav;

	}


}

package com.talentinvest.helloworld.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.talentinvest.helloworld.model.Student;

@Controller
public class StudentsController {
 
	
	@RequestMapping("/Students")
	public ModelAndView StudentsPage() {
		ModelAndView mav = new ModelAndView();
		
		ArrayList<Student> studentList = new ArrayList<>();
		
		Student s1 = new Student(1, "Sanggetha K", 22, "BSC", "29-04-2001", 9331132542l);
		Student s2 = new Student(2, "Ganga K", 23, "BSC", "29-04-2000", 7891132542l);
		Student s3 = new Student(3, "Sanggetha K", 22, "MSC", "29-04-2003", 7338932542l);
		Student s4 = new Student(4, "Lokesh K", 21, "BTECH", "29-04-2001", 6341132542l);
		Student s5 = new Student(5, "Ganga M", 22, "BSC", "29-04-2000", 7332132542l);
		Student s6 = new Student(6, "Lokesh M", 22, "BSC", "29-04-2000", 7335152542l);
		Student s7 = new Student(7, "Kishore K", 22, "BCOM", "29-04-2002", 7336662542l);
		Student s8 = new Student(8, "Sanggetha K", 20, "BSC", "29-04-2000", 7331132777l);
		Student s9 = new Student(9, "Kishore C", 22, "BSC", "29-04-2000", 8881132542l);
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		studentList.add(s6);
		studentList.add(s7);
		studentList.add(s8);
		studentList.add(s9);
		
		mav.setViewName("Students");
		mav.addObject(studentList);
		
		return mav;
	}
	
	@RequestMapping("/CreateStudent")
	public ModelAndView CreateStudentPage() {
	ModelAndView mav = new ModelAndView("CreateStudent");
	
	return mav;
	}

	
}

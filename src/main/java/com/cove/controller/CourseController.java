package com.cove.controller;

import com.cove.data.CourseDataAccessInterface;
import com.cove.model.CourseModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class CourseController {

	@Autowired
	private CourseDataAccessInterface service;

    @GetMapping("/courses")
    public String getUsers(Model model) {
        List<CourseModel> Courses = service.getAll();
		model.addAttribute("title", "The Courses");
		model.addAttribute("Courses", Courses); 
		model.addAttribute("CourseID", new CourseModel());
		return "courses";
    } 
}
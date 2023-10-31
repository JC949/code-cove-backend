package com.cove.controller;

import com.cove.data.StudentDataAccessInterface;
import com.cove.model.StudentModel;

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
public class StudentController {

	@Autowired
	private StudentDataAccessInterface service;

    @GetMapping("/students")
    public String getUsers(Model model) {
        List<StudentModel> students = service.getAll();
		model.addAttribute("title", "The Students");
		model.addAttribute("students", students); 
		model.addAttribute("studentID", new StudentModel());
		return "students";
    } 
}
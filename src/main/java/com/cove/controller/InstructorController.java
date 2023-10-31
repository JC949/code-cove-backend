package com.cove.controller;

import com.cove.data.InstructorDataAccessInterface;
import com.cove.model.InstructorModel;

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
public class InstructorController {

	@Autowired
	private InstructorDataAccessInterface service;

    @GetMapping("/instructors")
    public String getUsers(Model model) {
        List<InstructorModel> Instructors = service.getAll();
		model.addAttribute("title", "The Instructors");
		model.addAttribute("Instructors", Instructors); 
		model.addAttribute("InstructorID", new InstructorModel());
		return "instructors";
    } 
}
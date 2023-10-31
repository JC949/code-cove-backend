package com.cove.controller;

import com.cove.data.InstructorDataAccessInterface;
import com.cove.model.InstructorModel;

import org.springframework.beans.factory.annotation.Autowired;import org.springframework.web.bind.annotation.CrossOrigin;
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
    public List<InstructorModel> getInstructors() {
		return this.service.getAll();
	}
}
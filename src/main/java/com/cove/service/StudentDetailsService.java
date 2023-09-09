package com.cove.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cove.interfaces.StudentRepository;
import com.cove.model.Student;

@Service
public class StudentDetailsService implements UserDetailsService  {

    private final StudentRepository studentRepository;

    public StudentDetailsService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

        @Override
        public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
          Student student = studentRepository.findStudentByUsername(username);
        if (student == null) {
            throw new UsernameNotFoundException("Student not found");
        }

        return org.springframework.security.core.userdetails.User
            .withUsername(student.getUsername())
            .password(student.getPassword())
            .roles(student.getRole().split(",")) // Convert roles string to array
            .build();
    }
}
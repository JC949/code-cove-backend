package com.cove.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cove.interfaces.InstructorRepository;
import com.cove.model.Instructor;


@Service
public class InstructorDetailsService implements UserDetailsService  {

    private final InstructorRepository instructorRepository;

    public InstructorDetailsService(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

        @Override
        public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
          Instructor instructor = instructorRepository.findInstructorByUsername(username);
        if (instructor == null) {
            throw new UsernameNotFoundException("Instructor not found");
        }

        return org.springframework.security.core.userdetails.User
            .withUsername(instructor.getUsername())
            .password(instructor.getPassword())
            .roles(instructor.getRole().split(",")) // Convert roles string to array
            .build();
    }
}
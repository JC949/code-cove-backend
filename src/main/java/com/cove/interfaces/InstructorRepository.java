package com.cove.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cove.model.Instructor;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {
    Instructor findInstructorByUsername(String username);
}

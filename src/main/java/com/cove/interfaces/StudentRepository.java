package com.cove.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cove.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findStudentByUsername(String username);
}

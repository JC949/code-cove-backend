package com.cove.data;

import java.util.List;

import com.cove.model.StudentModel;

public interface StudentDataAccessInterface <T> {
    
    public T getById(int id);
    public StudentModel getStudentsByAuthorized(int id);
    public List<StudentModel> getAll();
    public List<StudentModel> searchStudents(String searchTerm);
    public boolean createStudent(T t);
    public boolean updateStudent(T t);
    public boolean deleteById(T t);
}

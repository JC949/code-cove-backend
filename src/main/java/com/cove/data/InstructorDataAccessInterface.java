package com.cove.data;

import java.util.List;

import com.cove.model.InstructorModel;

public interface InstructorDataAccessInterface <T> {
    
    public T getById(int id);
    public InstructorModel getInstructorsByAuthorized(int id);
    public List<InstructorModel> getAll();
    public List<InstructorModel> searchInstructors(String searchTerm);
    public boolean createInstructor(T t);
    public boolean updateInstructor(T t);
    public boolean deleteById(T t);
}

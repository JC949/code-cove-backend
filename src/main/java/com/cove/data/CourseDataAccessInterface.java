package com.cove.data;

import java.util.List;

import com.cove.model.CourseModel;

public interface CourseDataAccessInterface <T> {
    
    public T getById(int id);
    public CourseModel getCoursesByAuthorized(int id);
    public List<CourseModel> getAll();
    public List<CourseModel> searchCourses(String searchTerm);
    public boolean createCourse(T t);
    public boolean updateCourse(T t);
    public boolean deleteById(T t);
}

package com.cove.data;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.cove.model.CourseMapper;
import com.cove.model.CourseModel;

@Service
public class CourseRepository implements CourseDataAccessInterface<CourseModel> {

    private final JdbcTemplate jdbcTemplate;

    public CourseRepository(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public CourseModel getById(int id) {
        String sql = "SELECT * FROM `Courses` WHERE `id` = ?";
        List<CourseModel> Courses = jdbcTemplate.query(sql, new CourseMapper(), id);
        return Courses.isEmpty() ? null : Courses.get(0);
    }

    @Override
    public CourseModel getCoursesByAuthorized(int id) {
        throw new UnsupportedOperationException("Unimplemented method 'getCoursesByAuthorized'");
    }

    @Override
    public List<CourseModel> getAll() {
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public List<CourseModel> searchCourses(String searchTerm) {
        throw new UnsupportedOperationException("Unimplemented method 'searchCourses'");
    }

    @Override
    public boolean createCourse(CourseModel t) {
        throw new UnsupportedOperationException("Unimplemented method 'createCourse'");
    }

    @Override
    public boolean updateCourse(CourseModel t) {
        throw new UnsupportedOperationException("Unimplemented method 'updateCourse'");
    }

    @Override
    public boolean deleteById(CourseModel t) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }


    

}

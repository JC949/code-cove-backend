package com.cove.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CourseMapper implements RowMapper<CourseModel> {
      
    public CourseModel mapRow(ResultSet resultSet, int i) throws SQLException {
        CourseModel Course = new CourseModel(
            resultSet.getInt("id"),
            resultSet.getString("name"),
            resultSet.getString("description"),
            resultSet.getInt("difficulty"),
            resultSet.getString("author")
        );

        return Course;
    }
}
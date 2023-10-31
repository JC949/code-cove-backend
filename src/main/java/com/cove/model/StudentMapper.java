package com.cove.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<StudentModel> {
      
    public StudentModel mapRow(ResultSet resultSet, int i) throws SQLException {
        StudentModel student = new StudentModel(
            resultSet.getInt("id"),
            resultSet.getString("username"),
            resultSet.getString("password"),
            resultSet.getInt("authorized"),
            resultSet.getString("email")
        );

        return student;
    }
}
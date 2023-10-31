package com.cove.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class InstructorMapper implements RowMapper<InstructorModel> {
      
    public InstructorModel mapRow(ResultSet resultSet, int i) throws SQLException {
        InstructorModel instructor = new InstructorModel(
            resultSet.getInt("id"),
            resultSet.getString("username"),
            resultSet.getString("password"),
            resultSet.getInt("authorized"),
            resultSet.getString("email")
        );

        return instructor;
    }
}
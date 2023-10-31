package com.cove.data;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.cove.model.InstructorMapper;
import com.cove.model.InstructorModel;

@Service
public class InstructorRepository implements InstructorDataAccessInterface<InstructorModel> {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public InstructorRepository(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public InstructorModel getById(int id) {
        String sql = "SELECT * FROM `Instructors` WHERE `id` = ?";
        List<InstructorModel> Instructors = jdbcTemplate.query(sql, new InstructorMapper(), id);
        return Instructors.isEmpty() ? null : Instructors.get(0);
    }

    @Override
    public InstructorModel getInstructorsByAuthorized(int id) {
        throw new UnsupportedOperationException("Unimplemented method 'getInstructorsByAuthorized'");
    }

    @Override
    public List<InstructorModel> getAll() {
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public List<InstructorModel> searchInstructors(String searchTerm) {
        throw new UnsupportedOperationException("Unimplemented method 'searchInstructors'");
    }

    @Override
    public boolean createInstructor(InstructorModel t) {
        throw new UnsupportedOperationException("Unimplemented method 'createInstructor'");
    }

    @Override
    public boolean updateInstructor(InstructorModel t) {
        throw new UnsupportedOperationException("Unimplemented method 'updateInstructor'");
    }

    @Override
    public boolean deleteById(InstructorModel t) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }


    

}

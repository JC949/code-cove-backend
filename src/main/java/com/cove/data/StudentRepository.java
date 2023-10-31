package com.cove.data;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.cove.model.StudentMapper;
import com.cove.model.StudentModel;

@Service
public class StudentRepository implements StudentDataAccessInterface<StudentModel> {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public StudentRepository(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public StudentModel getById(int id) {
        String sql = "SELECT * FROM `students` WHERE `id` = ?";
        List<StudentModel> students = jdbcTemplate.query(sql, new StudentMapper(), id);
        return students.isEmpty() ? null : students.get(0);
    }

    @Override
    public StudentModel getStudentsByAuthorized(int id) {
        throw new UnsupportedOperationException("Unimplemented method 'getStudentsByAuthorized'");
    }

    @Override
    public List<StudentModel> getAll() {
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public List<StudentModel> searchStudents(String searchTerm) {
        throw new UnsupportedOperationException("Unimplemented method 'searchStudents'");
    }

    @Override
    public boolean createStudent(StudentModel t) {
        throw new UnsupportedOperationException("Unimplemented method 'createStudent'");
    }

    @Override
    public boolean updateStudent(StudentModel t) {
        throw new UnsupportedOperationException("Unimplemented method 'updateStudent'");
    }

    @Override
    public boolean deleteById(StudentModel t) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }


    

}

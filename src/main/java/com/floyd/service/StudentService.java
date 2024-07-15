package com.floyd.service;

import com.floyd.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudent();
    public Student getStudentById(Integer id);
    public String removeStudent(Integer id);
}

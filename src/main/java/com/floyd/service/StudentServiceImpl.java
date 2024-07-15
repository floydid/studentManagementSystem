package com.floyd.service;

import com.floyd.model.Student;
import com.floyd.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepo;

    @Override
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }

    @Override
    public Student getStudentById(Integer id) {
        return studentRepo.findById(id).get();
    }

    @Override
    public String removeStudent(Integer id) {
        Student student  =studentRepo.findById(id).get();
        if(student!=null){
            studentRepo.delete(student);
            return "Student Removed Successfully!";
        }
        return "Student removal not Successful";

    }
}

package com.example.libraryproject2.service;

import com.example.libraryproject2.model.Student;
import com.example.libraryproject2.repository.IStudentRepository;
import com.example.libraryproject2.service.itf.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {
    @Autowired
    IStudentRepository studentRepository;

    @Override
    public List<Student> findALl() {
        return studentRepository.findAll();
    }
}

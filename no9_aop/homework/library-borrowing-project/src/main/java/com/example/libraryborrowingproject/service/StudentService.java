package com.example.libraryborrowingproject.service;

import com.example.libraryborrowingproject.model.Student;
import com.example.libraryborrowingproject.repository.IStudentRepository;
import com.example.libraryborrowingproject.service.itf.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {
    @Autowired
    IStudentRepository studentRepository;

    @Override
    public List<Student> getStudentList() {
        return studentRepository.findAll();
    }
}

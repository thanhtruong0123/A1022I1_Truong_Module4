package com.example.furama.service.employee;

import com.example.furama.model.employee.EducationDegree;
import com.example.furama.repository.employee.IEducationDegreeRepository;
import com.example.furama.service.employee.itf.IEducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationDegreeService implements IEducationDegreeService {
    @Autowired
    private IEducationDegreeRepository educationDegreeRepository;

    @Override
    public List<EducationDegree> findAll() {
        return educationDegreeRepository.findAll();
    }
}

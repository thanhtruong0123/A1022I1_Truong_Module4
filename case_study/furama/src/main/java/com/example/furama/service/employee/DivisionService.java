package com.example.furama.service.employee;

import com.example.furama.model.employee.Division;
import com.example.furama.repository.employee.IDivisionRepository;
import com.example.furama.service.employee.itf.IDivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionService implements IDivisionService {
    @Autowired
    private IDivisionRepository divisionRepository;

    @Override
    public List<Division> findAll() {
        return divisionRepository.findAll();
    }
}

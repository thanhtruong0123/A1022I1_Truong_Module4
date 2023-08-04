package com.example.furama.service.employee;

import com.example.furama.model.employee.Position;
import com.example.furama.repository.employee.IPositionRepository;
import com.example.furama.service.employee.itf.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService implements IPositionService {
    @Autowired
    private IPositionRepository positionRepository;

    @Override
    public List<Position> findAll() {
        return positionRepository.findAll();
    }
}

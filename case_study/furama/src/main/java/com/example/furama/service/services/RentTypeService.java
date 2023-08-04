package com.example.furama.service.services;

import com.example.furama.model.service.RentType;
import com.example.furama.repository.services.IRentTypeRepository;
import com.example.furama.service.services.itf.IRentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentTypeService implements IRentTypeService {
    @Autowired
    private IRentTypeRepository rentTypeRepository;

    @Override
    public List<RentType> findAll() {
        return rentTypeRepository.findAll();
    }
}

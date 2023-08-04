package com.example.furama.service.services;

import com.example.furama.model.service.ServiceType;
import com.example.furama.repository.services.IServiceTypeRepository;
import com.example.furama.service.services.itf.IServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceTypeService implements IServiceTypeService {
    @Autowired
    private IServiceTypeRepository serviceTypeRepository;

    @Override
    public ServiceType findById(Long id) {
        return serviceTypeRepository.findById(id).get();
    }
}

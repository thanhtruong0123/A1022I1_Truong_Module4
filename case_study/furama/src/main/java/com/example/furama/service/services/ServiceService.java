package com.example.furama.service.services;

import com.example.furama.model.service.ServiceModel;
import com.example.furama.repository.services.IServiceRepository;
import com.example.furama.service.services.itf.IServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceService implements IServiceService {
    @Autowired
    private IServiceRepository serviceRepository;

    @Override
    public List<ServiceModel> findAll() {
        return serviceRepository.findAll();
    }

    @Override
    public void createService(ServiceModel serviceModel) {
        serviceRepository.save(serviceModel);
    }
}

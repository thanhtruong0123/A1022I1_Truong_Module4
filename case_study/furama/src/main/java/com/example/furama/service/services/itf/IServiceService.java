package com.example.furama.service.services.itf;

import com.example.furama.model.service.ServiceModel;

import java.util.List;

public interface IServiceService {
    List<ServiceModel> findAll();

    void createService(ServiceModel serviceModel);
}

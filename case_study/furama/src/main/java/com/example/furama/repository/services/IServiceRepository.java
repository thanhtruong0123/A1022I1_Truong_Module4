package com.example.furama.repository.services;

import com.example.furama.model.service.ServiceModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IServiceRepository extends JpaRepository<ServiceModel, Long> {
}

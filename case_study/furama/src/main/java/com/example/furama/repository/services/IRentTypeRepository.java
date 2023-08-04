package com.example.furama.repository.services;

import com.example.furama.model.service.RentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRentTypeRepository extends JpaRepository<RentType, Long> {
}

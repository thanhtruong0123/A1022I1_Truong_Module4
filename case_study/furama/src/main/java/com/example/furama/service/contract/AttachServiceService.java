package com.example.furama.service.contract;

import com.example.furama.model.contract.AttachService;
import com.example.furama.repository.contract.IAttachServiceRepository;
import com.example.furama.service.contract.itf.IAttachServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachServiceService implements IAttachServiceService {
    @Autowired
    private IAttachServiceRepository attachServiceRepository;


    @Override
    public List<AttachService> findAll() {
        return attachServiceRepository.findAll();
    }
}

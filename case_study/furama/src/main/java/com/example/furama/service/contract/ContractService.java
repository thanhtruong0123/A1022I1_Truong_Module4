package com.example.furama.service.contract;

import com.example.furama.model.contract.Contract;
import com.example.furama.repository.contract.IContractRepository;
import com.example.furama.service.contract.itf.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractService implements IContractService {
    @Autowired
    private IContractRepository contractRepository;

    @Override
    public List<Contract> findAll() {
        return contractRepository.findAll();
    }

    @Override
    public void createContract(Contract contract) {
        contractRepository.save(contract);
    }
}

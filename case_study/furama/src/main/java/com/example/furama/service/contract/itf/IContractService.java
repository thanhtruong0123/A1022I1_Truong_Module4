package com.example.furama.service.contract.itf;

import com.example.furama.model.contract.Contract;

import java.util.List;

public interface IContractService {
    List<Contract> findAll();

    void createContract(Contract contract);
}

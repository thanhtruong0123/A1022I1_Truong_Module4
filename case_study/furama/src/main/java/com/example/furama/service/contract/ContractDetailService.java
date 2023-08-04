package com.example.furama.service.contract;

import com.example.furama.model.contract.ContractDetail;
import com.example.furama.repository.contract.IContractDetailRepository;
import com.example.furama.service.contract.itf.IContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractDetailService implements IContractDetailService {
    @Autowired
    private IContractDetailRepository contractDetailRepository;

    @Override
    public Page<ContractDetail> getPage(Pageable pageable, String name) {
        return contractDetailRepository.getContractDetailsByName(pageable, name + "%");
    }

    @Override
    public ContractDetail findById(Long id) {
        return contractDetailRepository.findById(id).get();
    }

    @Override
    public void createNew(ContractDetail contractDetail) {
        contractDetailRepository.save(contractDetail);
    }

    @Override
    public void deleteAllById(List<Long> contractDetailIds) {
        contractDetailRepository.deleteAllById(contractDetailIds);
    }

    @Override
    public void updateOne(ContractDetail contractDetail) {
        contractDetailRepository.save(contractDetail);
    }
}

package com.example.furama.service.contract.itf;

import com.example.furama.model.contract.ContractDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IContractDetailService {
    Page<ContractDetail> getPage(Pageable pageable, String name);

    ContractDetail findById(Long id);

    void createNew(ContractDetail contractDetail);

    void deleteAllById(List<Long> contractDetailIds);

    void updateOne(ContractDetail contractDetail);
}

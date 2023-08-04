package com.example.furama.repository.contract;

import com.example.furama.model.contract.ContractDetail;
import com.example.furama.until.SQLQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IContractDetailRepository extends JpaRepository<ContractDetail, Long> {
    @Query(value = SQLQuery.SELECT_FROM_CONTRACT_DETAIL, nativeQuery = true)
    Page<ContractDetail> getContractDetailsByName(Pageable pageable, @Param("name") String name);
}

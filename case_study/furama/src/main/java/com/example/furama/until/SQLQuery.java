package com.example.furama.until;

public class SQLQuery {
    public static final String SELECT_FROM_CONTRACT_DETAIL = "SELECT * " +
            "FROM contract_detail " +
            "JOIN attach_service ON contract_detail.attach_service_id = attach_service.id " +
            "JOIN contract ON contract_detail.contract_id = contract.id " +
            "JOIN service_model ON contract.service_model_id = service_model.id " +
            "JOIN customer ON contract.customer_id = customer.id " +
            "JOIN employee ON contract.employee_id = employee.id " +
            "WHERE customer.name like :name " +
            "OR service_model.name like :name " +
            "OR employee.name like :name";
}

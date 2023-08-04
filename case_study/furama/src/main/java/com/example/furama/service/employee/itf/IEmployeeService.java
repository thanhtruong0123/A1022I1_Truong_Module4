package com.example.furama.service.employee.itf;

import com.example.furama.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IEmployeeService {
    Page<Employee> searchByName(Pageable pageable, String name);

    List<Employee> findAll();

    Employee findById(Long id);

    void createEmployee(Employee employee);

    void updateEmployee(Employee employee);

    void deleteAllByIds(List<Long> employeeIds);
}

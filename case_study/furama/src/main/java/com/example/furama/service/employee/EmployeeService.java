package com.example.furama.service.employee;

import com.example.furama.model.employee.Employee;
import com.example.furama.repository.employee.IEmployeeRepository;
import com.example.furama.service.employee.itf.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private IEmployeeRepository employeeRepository;

    @Override
    public Page<Employee> searchByName(Pageable pageable, String name) {
        return employeeRepository.searchByName(pageable, name + "%");
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(Long id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public void createEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteAllByIds(List<Long> employeeIds) {
        employeeRepository.deleteAllById(employeeIds);
    }
}

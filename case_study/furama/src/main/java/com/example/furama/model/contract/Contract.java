package com.example.furama.model.contract;

import com.example.furama.model.customer.Customer;
import com.example.furama.model.employee.Employee;
import com.example.furama.model.service.ServiceModel;

import javax.persistence.*;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "DATETIME")
    private String startDate;
    @Column(columnDefinition = "DATETIME")
    private String endDate;
    private double deposit;
    private double totalMoney;

    @ManyToOne
    @JoinColumn(columnDefinition = "id", referencedColumnName = "id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(columnDefinition = "id", referencedColumnName = "id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(columnDefinition = "id", referencedColumnName = "id")
    private ServiceModel serviceModel;

    public Contract() {
    }

    public Contract(Long id, String startDate, String endDate, double deposit, double totalMoney, Employee employee, Customer customer, ServiceModel serviceModel) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.deposit = deposit;
        this.totalMoney = totalMoney;
        this.employee = employee;
        this.customer = customer;
        this.serviceModel = serviceModel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ServiceModel getServiceModel() {
        return serviceModel;
    }

    public void setServiceModel(ServiceModel serviceModel) {
        this.serviceModel = serviceModel;
    }
}

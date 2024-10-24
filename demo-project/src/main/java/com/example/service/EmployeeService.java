package com.example.service;

import com.example.modal.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmpl(Employee employee);

    Employee getEmployee(Long id);

    void deleteByEmp(Long id);

    List<Employee> getAllEmployees();
}

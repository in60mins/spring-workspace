package com.example.service;

import com.example.modal.Employee;
import com.example.repository.EmployeeRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    EmployeeRepo employeeRepo;

    @Override
    public Employee saveEmpl(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public Employee getEmployee(Long id) {
        return employeeRepo.findById(id).get();
    }

    @Override
    public void deleteByEmp(Long id) {
        employeeRepo.deleteById(id);

    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }
}

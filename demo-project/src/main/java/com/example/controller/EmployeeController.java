package com.example.controller;

import com.example.modal.Employee;
import com.example.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class EmployeeController {

    EmployeeService employeeService;

    @PostMapping("/save")
    public Employee saveEmp(@RequestBody Employee employee){
        return employeeService.saveEmpl(employee);
    }

    @GetMapping("/")
    public List<Employee> getAll(){
        return employeeService.getAllEmployees();
    }
    @GetMapping("/{id}")
    public Employee getById(@PathVariable Long id){
        return employeeService.getEmployee(id);
    }

    @DeleteMapping("/{id}")
    public String deleteEmp(@PathVariable Long id){
        employeeService.deleteByEmp(id);
        return id +" Successfully deleted....!";
    }
}

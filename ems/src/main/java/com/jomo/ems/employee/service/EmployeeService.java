package com.jomo.ems.employee.service;

import com.jomo.ems.employee.model.Employee;
import com.jomo.ems.employee.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee) {
        System.out.println(employee);
        return employeeRepository.save(employee.setId(UUID.randomUUID()));
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getById(UUID id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee editEmployee(Employee updatedEmployee) {
        return employeeRepository.save(updatedEmployee);
    }

    public void deleteEmployee(UUID id){
        employeeRepository.deleteById(id);
    }
}
package com.jomo.ems.employee.service;

import com.jomo.ems.employee.dto.query.EmployeeCollectionQuery;
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

    public Employee add(Employee employee) {
        System.out.println(employee);
        return employeeRepository.save(employee.setId(UUID.randomUUID()));
    }

    public List<Employee> readCollection(EmployeeCollectionQuery collectionQuery) {
        return employeeRepository.findByCollectionQuery(collectionQuery);
    }

    public Employee getById(UUID id) {
        // todo Throw error
        // todo handling error EMSException(ErrorCode.NOT_FOUND, "Employee not found for:%s", id.toString())
        // common
        return employeeRepository.findById(id)
                .orElseThrow(RuntimeException::new);
        // try get method
    }

    // todo update
    public Employee edit(Employee updatedEmployee) {
        // todo validations

        // try get
        return employeeRepository.save(updatedEmployee);
    }

    // todo delete
    public void delete(UUID id){
        // todo validations
        // todo try get
        employeeRepository.deleteById(id);
    }
}
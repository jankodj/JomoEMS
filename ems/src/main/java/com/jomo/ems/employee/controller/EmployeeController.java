package com.jomo.ems.employee.controller;

import com.jomo.ems.employee.dto.query.EmployeeCollectionQuery;
import com.jomo.ems.employee.model.Employee;
import com.jomo.ems.employee.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;
import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    //todo readCollection add CollectionQuery
    // todo add pageable
    @GetMapping
    public List<Employee> readCollection(EmployeeCollectionQuery collectionQuery){
        return employeeService.readCollection(collectionQuery);
    }
    @GetMapping("/{id}")
    public Employee getById(@PathVariable UUID id){
        return employeeService.getById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Employee create(@Valid @RequestBody Employee employee){
        return employeeService.add(employee);
    }

    @PatchMapping
    public Employee update(@Valid @RequestBody Employee employee){
        return employeeService.edit(employee);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable UUID id){
        employeeService.delete(id);
    }

}

package com.jomo.ems.employee.repository;

import com.jomo.ems.employee.dto.query.EmployeeCollectionQuery;
import com.jomo.ems.employee.model.Employee;
import com.querydsl.core.BooleanBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, UUID>, QuerydslPredicateExecutor<Employee> {
    default List<Employee> findByCollectionQuery(EmployeeCollectionQuery collectionQuery){
        var predicate = new BooleanBuilder();
        return (List<Employee>) findAll(predicate);
    }
    Employee findByName(String name);
}

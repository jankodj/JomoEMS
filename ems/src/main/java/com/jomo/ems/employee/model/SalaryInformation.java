package com.jomo.ems.employee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class SalaryInformation {
    @Id
    UUID id;
    Integer baseSalary;
    Integer allowances;
    Integer deductions;
    Integer netSalary;
}
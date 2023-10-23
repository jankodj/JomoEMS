package com.jomo.ems.employee.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Data
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    UUID id;
    Integer managerId;
    Integer departmentId;
    String firstName;
    String lastName;
    String email;
    Integer phoneNumber;
    Date dateOfBirth;
    String gender;
    String martialStatus;
    String jobPositionId;
    String educationLevel;
    String skillsAndQualifications;
    EmploymentStatus employmentStatus;
    EmploymentType employmentType;
    EmployeeStatus employeeStatus;
}

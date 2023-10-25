package com.jomo.ems.employee.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.querydsl.core.annotations.QueryEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.experimental.FieldNameConstants;
import org.apache.commons.validator.routines.EmailValidator;

import java.time.Instant;
import java.util.UUID;

@Data
@Entity
@QueryEntity
@Table
@FieldNameConstants
public class Employee {
    @Id
    UUID id;
    // todo hierarchy of employees
    Integer managerId; // todo Employee // todo delay until employType is clear
    Integer departmentId; // todo Department info
    String jobPositionId;

    @Size(max = 128)
    String firstName;
    @Size(max = 128)
    String lastName;
    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$", message = "Invalid email format")
    String email;
    @Pattern(regexp = "^\\+381\\d{7,}$", message = "Invalid phone number format")
    Integer phoneNumber;
    Instant dateOfBirth;
    @Enumerated(EnumType.STRING)
    EmployeeStatus employeeStatus;


    @JsonIgnore
    @AssertTrue(message = "Email must be in proper format")
    public boolean isEmailValid() {
        if (this.email != null) {
            return EmailValidator.getInstance()
                    .isValid(this.email);
        }
        return false;
    }

    @JsonIgnore
    @AssertTrue(message = "Email or Phone must be provided")
    public boolean isContactProvided() {
        return this.email != null || this.phoneNumber != null;
    }

}

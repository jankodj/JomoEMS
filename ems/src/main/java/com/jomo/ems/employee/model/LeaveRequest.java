package com.jomo.ems.employee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.Date;
import java.util.UUID;

@Data
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class LeaveRequest
{
    @Id
    UUID id;
    Integer employeeId;
    LeaveType leaveType;
    Instant startDate;
    Instant endDate;
    Status status; // todo Status status-> LeaveRequestStatus status
}
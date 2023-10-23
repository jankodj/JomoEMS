package com.jomo.ems.employee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
public class AttendanceRecord
{
    @Id
    UUID id;
    Integer employeeId;
    Date date;
    Date clockInTime;
    Date clockOutTime;
    Integer totalHours;
}
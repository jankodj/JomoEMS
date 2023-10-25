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
public class JobPosition {

    // TODO JobPosition module move to new package
    // TODO develop CRUD for JobPosition
    // TODO only some sort of admin can create/update/delete JobPosition
    // TODO same as for department
    @Id
    UUID id;
    String positionTitle; // for example BE DEV,...
    String description;
}

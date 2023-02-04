package com.example.employee.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Employee {
    @Id
    private Long id;

    @Column(nullable =false,length = 10)
    private String name;
    private String department;
    private String phone;
    private String employmentDate;
}

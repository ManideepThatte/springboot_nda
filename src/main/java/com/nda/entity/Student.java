package com.nda.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Student {

    @Id
    @Column(name ="emp_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name ="employee_name")
    private String name;
    private String email;
    private String mobile;
    private String salary;
}

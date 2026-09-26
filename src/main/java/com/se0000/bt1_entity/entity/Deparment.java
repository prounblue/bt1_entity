package com.se0000.bt1_entity.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "deparments")
public class Deparment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "dept_name", length = 100, nullable = false)
    private String deptName;

    @Column(name = "dept_title", length = 100, nullable = false)
    private String deptTitle;

    @OneToMany(mappedBy = "deparment", cascade = CascadeType.ALL)
    private List<Employee> emp = new ArrayList<Employee>();

}

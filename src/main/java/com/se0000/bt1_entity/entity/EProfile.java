package com.se0000.bt1_entity.entity;

import jakarta.persistence.Column;
import jakarta.persistence.*;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_profiles")
public class EProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name ="address",length = 200, nullable = false)
    private  String address;

    @Column(name ="phone_Number",length = 20, nullable = false)
    private String phoneNumber;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "emp_id") // Tên cột khóa ngoại nên trùng với tên khóa chính của bảng orders
    private Employee employee;
}

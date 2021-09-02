package com.py.lenovo.pojo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "company")
public class Company {

    @Id
    @Column(name = "company_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyId;

    @Column(name = "company_name")
    private  String companyName;

    @Column(name = "company_address")
    private String companyAddress;

}

package com.py.lenovo.pojo;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "Dell")
public class User {

    @Id
    @Column(name = "record_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recordId;

    @Column(name = "employee", nullable = false)
    private String employee;

    @Column(name = "age", nullable = false)
    private Integer age;

    @Column(name = "mobile_no", nullable = false)
    private Long mobileNo;

    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name = "deleted")
    private Boolean deleted = Boolean.FALSE;

    @OneToOne
    @JoinColumn(name = "company_address", referencedColumnName = "company_id")
    private Company company;

}
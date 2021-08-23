package com.py.lenovo.pojo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class DellUser {

    @Id
    @Column(name = "record_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recordId;
    @Column(name = "handsome_boy", nullable = false)
    private String handsomeBoy;
    @Column(name = "mobile_no", nullable = false)
    private Integer mobileNo;

}

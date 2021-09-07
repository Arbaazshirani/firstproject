package com.py.lenovo.pojo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "laptop_parts")
public class LaptopParts {

    @Id
    @Column(name = "laptop_parts_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long laptopPartsId;

    @Column(name = "hdd")
    private Long hdd;

    @Column(name = "ram")
    private Long ram;

    @Column(name = "screen_size")
    private Long screenSize;
}

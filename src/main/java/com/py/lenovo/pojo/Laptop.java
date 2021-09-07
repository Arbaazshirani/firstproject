package com.py.lenovo.pojo;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "laptop")
public class Laptop {

    @Id
    @Column(name = "record_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recordId;

    @Column(name = "laptop_brand")
    private String laptopBrand;

    @Column(name = "laptop_name")
    private String laptopName;

    @Column(name = "laptop_color")
    private String laptopColor;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "foreign_key",referencedColumnName = "record_id")
    private List<LaptopParts> laptopParts;
}

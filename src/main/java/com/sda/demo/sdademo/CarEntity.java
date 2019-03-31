package com.sda.demo.sdademo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class CarEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    public CarEntity() {}

    public CarEntity(String name) {
        this.name = name;
    }
}

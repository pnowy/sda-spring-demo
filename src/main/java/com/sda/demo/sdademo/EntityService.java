package com.sda.demo.sdademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class EntityService {

    @Autowired
    private CarEntityRepository carEntityRepository;

    @PostConstruct
    public void inti() {
        this.carEntityRepository.save(new CarEntity("Skoda"));

        System.out.println(this.carEntityRepository.count());
    }

}

package com.sda.demo.sdademo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarEntityRepository extends JpaRepository<CarEntity, Long> {
}

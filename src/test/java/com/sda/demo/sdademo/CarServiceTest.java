package com.sda.demo.sdademo;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CarServiceTest {

    @Test
    public void shouldReadFile() {
        CarService carService = new CarService();
        carService.initCarsFromFile();
        Assertions.assertThat(carService.getCars()).hasSize(1205);
    }
}

package com.sda.demo.sdademo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

@RestController
public class CarController {

    private static final Logger log = LoggerFactory.getLogger(CarController.class);

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public Collection<CarModel> getCars() {
        log.info("Getting all cars from car service");
        return carService.getCars();
    }

    @GetMapping("/cars/efficient/usa")
    public Collection<CarModel> getMostEfficientCarsUsa() {
        return carService.getMostEfficientCars();
    }

    @GetMapping("/cars/efficient/eu")
    public Collection<CarModelEurope> getMostEfficientCarsEu() {
        return carService.getMostEfficientCars().stream()
                .map(CarModel::toEuropeCarModel)
                .collect(Collectors.toList());
    }

    @GetMapping("/cars/engine")
    public Collection<CarModelEurope> getCarsWithBiggestEngine() {
        Comparator<CarModel> engineAndFuelComparator = Comparator
                .comparingDouble(CarModel::getEngineVolume).reversed()
                .thenComparing(CarModel::getCombinedFuelEfficiency);
        return carService.getCars().stream()
                .sorted(engineAndFuelComparator)
                .map(CarModel::toEuropeCarModel)
                .limit(10)
                .collect(Collectors.toList());
    }

}

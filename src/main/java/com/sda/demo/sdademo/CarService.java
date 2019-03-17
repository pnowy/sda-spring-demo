package com.sda.demo.sdademo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class CarService {

    private static final Logger log = LoggerFactory.getLogger(CarService.class);

    private Function<String, CarModel> mapLineToCarModel = line -> {
        String[] split = line.split(",");
        return new CarModel(split);
    };

    private List<CarModel> cars;

    @PostConstruct
    void initCarsFromFile() {
        List<String> lines = readAllCsvLines();
        this.cars = lines.stream()
                .skip(1)
                .map(mapLineToCarModel)
                .collect(Collectors.toList());
        log.info("Initialize car service from CSV file!");
    }

    private List<String> readAllCsvLines() {
        try {
            File file = new File("fuel.csv");
            return Files.readAllLines(file.toPath());
        } catch (IOException e) {
            throw new CarsFileNotFoundException("Problem with CSV file!");
        }
    }

    public List<CarModel> getCars() {
        return new ArrayList<>(cars);
    }

    public List<CarModel> getMostEfficientCars() {
        return getCars().stream()
                .sorted(Comparator.comparingInt(x -> -x.getCityFuelEfficiency()))
                .limit(15)
                .collect(Collectors.toList());
    }

}

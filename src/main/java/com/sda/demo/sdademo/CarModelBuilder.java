package com.sda.demo.sdademo;

public final class CarModelBuilder {
    private int year;
    private String division;
    private String carLine;
    private String engineDisplay;
    private int numberOfCylinders;
    private int cityFuelEfficiency;
    private int highwayFuelEfficiency;
    private int combinedFuelEfficiency;

    private CarModelBuilder() {
    }

    public static CarModelBuilder builder() {
        return new CarModelBuilder();
    }

    public CarModelBuilder withYear(int year) {
        this.year = year;
        return this;
    }

    public CarModelBuilder withDivision(String division) {
        this.division = division;
        return this;
    }

    public CarModelBuilder withCarLine(String carLine) {
        this.carLine = carLine;
        return this;
    }

    public CarModelBuilder withEngineDisplay(String engineDisplay) {
        this.engineDisplay = engineDisplay;
        return this;
    }

    public CarModelBuilder withNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
        return this;
    }

    public CarModelBuilder withCityFuelEfficiency(int cityFuelEfficiency) {
        this.cityFuelEfficiency = cityFuelEfficiency;
        return this;
    }

    public CarModelBuilder withHighwayFuelEfficiency(int highwayFuelEfficiency) {
        this.highwayFuelEfficiency = highwayFuelEfficiency;
        return this;
    }

    public CarModelBuilder withCombinedFuelEfficiency(int combinedFuelEfficiency) {
        this.combinedFuelEfficiency = combinedFuelEfficiency;
        return this;
    }

    public CarModel build() {
        CarModel carModel = new CarModel(new String[]{});
        carModel.setYear(year);
        carModel.setDivision(division);
        carModel.setCarLine(carLine);
        carModel.setEngineDisplay(engineDisplay);
        carModel.setNumberOfCylinders(numberOfCylinders);
        carModel.setCityFuelEfficiency(cityFuelEfficiency);
        carModel.setHighwayFuelEfficiency(highwayFuelEfficiency);
        carModel.setCombinedFuelEfficiency(combinedFuelEfficiency);
        return carModel;
    }
}

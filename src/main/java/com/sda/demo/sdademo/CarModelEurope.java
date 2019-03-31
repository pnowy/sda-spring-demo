package com.sda.demo.sdademo;

public class CarModelEurope {
    private int year;
    private String division;
    private String carLine;
    private String engineDisplay;
    private int numberOfCylinders;
    private double cityFuelConsumption;
    private double highwayFuelConsumption;
    private double combinedFuelConsumption;
    private String image = "https://media.wired.com/photos/5b86fce8900cb57bbfd1e7ee/master/pass/Jaguar_I-PACE_S_Indus-Silver_065.jpg";

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getCarLine() {
        return carLine;
    }

    public void setCarLine(String carLine) {
        this.carLine = carLine;
    }

    public String getEngineDisplay() {
        return engineDisplay;
    }

    public void setEngineDisplay(String engineDisplay) {
        this.engineDisplay = engineDisplay;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public double getCityFuelConsumption() {
        return cityFuelConsumption;
    }

    public void setCityFuelConsumption(double cityFuelConsumption) {
        this.cityFuelConsumption = cityFuelConsumption;
    }

    public double getHighwayFuelConsumption() {
        return highwayFuelConsumption;
    }

    public void setHighwayFuelConsumption(double highwayFuelConsumption) {
        this.highwayFuelConsumption = highwayFuelConsumption;
    }

    public double getCombinedFuelConsumption() {
        return combinedFuelConsumption;
    }

    public void setCombinedFuelConsumption(double combinedFuelConsumption) {
        this.combinedFuelConsumption = combinedFuelConsumption;
    }

    public String getImage() {
        return image;
    }
}

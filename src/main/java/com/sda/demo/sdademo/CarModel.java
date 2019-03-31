package com.sda.demo.sdademo;

/**
 * Use {@linkplain CarModelEurope} instead
 */
@Deprecated
public class CarModel implements Comparable<CarModel> {
    private static final double LITERS_PER_GALLON = 3.785411784;

    private int year;
    private String division;
    private String carLine;
    private String engineDisplay;
    private int numberOfCylinders;
    private int cityFuelEfficiency;
    private int highwayFuelEfficiency;
    private int combinedFuelEfficiency;

    public CarModel(String[] csvValues) {
        setYear(Integer.parseInt(csvValues[0]));
        setDivision(csvValues[1]);
        setCarLine(csvValues[2]);
        setEngineDisplay(csvValues[3]);
        setNumberOfCylinders(Integer.parseInt(csvValues[4]));
        setCityFuelEfficiency(Integer.parseInt(csvValues[5]));
        setHighwayFuelEfficiency(Integer.parseInt(csvValues[6]));
        setCombinedFuelEfficiency(Integer.parseInt(csvValues[7]));
    }

    public CarModelEurope toEuropeCarModel() {
        CarModelEurope cme = new CarModelEurope();
        cme.setYear(getYear());
        cme.setCarLine(getCarLine());
        cme.setDivision(getDivision());
        cme.setEngineDisplay(getEngineDisplay());
        cme.setNumberOfCylinders(getNumberOfCylinders());
        cme.setCityFuelConsumption(milesPerGallonToLitersPer100Km(getCityFuelEfficiency()));
        cme.setHighwayFuelConsumption(milesPerGallonToLitersPer100Km(getHighwayFuelEfficiency()));
        cme.setCombinedFuelConsumption(milesPerGallonToLitersPer100Km(getCombinedFuelEfficiency()));
        return cme;
    }

    private double  milesPerGallonToLitersPer100Km(int milesPerGallon) {
        double gallonsPerMile = 1.0 / milesPerGallon;
        double gallonsPerMeter = gallonsPerMile / 1609.344;
        double litersPerMeter = gallonsPerMeter * LITERS_PER_GALLON;
        double litersPer100km = litersPerMeter * 1000 * 100;
        return litersPer100km;
    }

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

    public int getCityFuelEfficiency() {
        return cityFuelEfficiency;
    }

    public void setCityFuelEfficiency(int cityFuelEfficiency) {
        this.cityFuelEfficiency = cityFuelEfficiency;
    }

    public int getHighwayFuelEfficiency() {
        return highwayFuelEfficiency;
    }

    public void setHighwayFuelEfficiency(int highwayFuelEfficiency) {
        this.highwayFuelEfficiency = highwayFuelEfficiency;
    }

    public int getCombinedFuelEfficiency() {
        return combinedFuelEfficiency;
    }

    public void setCombinedFuelEfficiency(int combinedFuelEfficiency) {
        this.combinedFuelEfficiency = combinedFuelEfficiency;
    }

    public double getEngineVolume() {
        return Double.valueOf(getEngineDisplay());
    }

    @Override
    public int compareTo(CarModel o) {
        return Integer.compare(getYear(), o.getYear());
    }
}

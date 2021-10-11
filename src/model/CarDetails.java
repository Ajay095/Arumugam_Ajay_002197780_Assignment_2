package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ajay09
 */
public class CarDetails {
    
    private String model;
    private boolean availability;
    private byte seats;
    private String serialNumber;
    private String modelNumber;
    private int year;
    private String Manufacturer;
    private String licenseNumber;
    private String location;
    private boolean maintenanceCert;

    public boolean isMaintenanceCert() {
        return maintenanceCert;
    }

    public void setMaintenanceCert(boolean maintenanceCert) {
        this.maintenanceCert = maintenanceCert;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public byte getSeats() {
        return seats;
    }
    
    public void setSeats(byte seats) {
        this.seats = seats;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String Manufacturer) {
        
        this.Manufacturer = Manufacturer;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    } 
    
    @Override
    public String toString() {
        return model;
    }
}

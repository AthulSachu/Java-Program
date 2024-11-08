package com.xworkz.accessspecifier.example;

public class ElectronicProduct {

    public String productName;
    protected double price;
    int manufactureYear;
    private String serialNumber;

    public ElectronicProduct() {
        this.productName = "Phone";
        this.manufactureYear = 2024;
        System.out.println("Electronic Product created with default values.");
    }

    private ElectronicProduct(String serialNumber) {
        this.serialNumber = serialNumber;
        System.out.println("Electronic Product created with serial number: " + serialNumber);
    }

    public void powerOn() {
        System.out.println(productName + " powered on.");
    }

    protected void adjustSettings() {
        System.out.println("Settings adjusted for " + productName);
    }

    void checkBatteryStatus() {
        System.out.println("Battery status checked.");
    }

    private void accessInternalComponents(String authorizationCode) {
        System.out.println("Accessing internal components.");
    }
}
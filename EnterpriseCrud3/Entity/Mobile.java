package com.xworkz.EnterpriseCrud.Entity;

public class Mobile {
	private String brand;
	private String model;
	private int batteryCapacity;
	private double price;
	private String color;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryLife(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public Mobile(String brand, String model, int batteryCapacity, double price, String color) {
		this.brand = brand;
		this.model = model;
		this.batteryCapacity = batteryCapacity;
		this.price = price;
		this.color = color;
	}
	
	public void printDetails() {
	    System.out.println("-----------------------");
	    System.out.println("Brand : " + brand);
	    System.out.println("Model : " + model);
	    System.out.println("BatteryCapacity : " + batteryCapacity +" mAh");
	    System.out.println("Price : " + price);
	    System.out.println("Color : " + color);
	}
}

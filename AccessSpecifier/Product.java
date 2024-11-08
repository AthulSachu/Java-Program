package com.xworkz.accessspecifier;

public class Product {
	public String name;
	protected double price;
	int year;
	private String model;
	
	
	public Product() {
		this.name = "Laptop";
		this.year = 2024;
		System.out.println("Default Constructor Executed");
	}
	
	private Product(String model) {
		this.model = model;
        System.out.println("Private Constructor Executed");
	}
	
	public void displayInfo() {
        System.out.println("Product information displayed");
    }
	
	protected void applyDiscount() {
        System.out.println("Discount applied to product.");
    }
	
	void checkAvailability() {
        System.out.println("Product availability checked");
    }
	
	private void checkWarrantyStatus() {
        System.out.println("Warranty status checked");
    }
}

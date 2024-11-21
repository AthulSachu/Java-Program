package com.xworkz.EnterpriseCrud.entity;

public class Laptop {
	private String brandName;
	private float price;
	private int storage;
	private String operatingSystem;
	
	public Laptop(String brandName, float price, int storage, String operatingSystem) {
		this.brandName = brandName;
		this.price = price;
		this.storage = storage;
		this.operatingSystem = operatingSystem;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	
	public void printDetails() {
		System.out.println("-----------------------");
		System.out.println("Brand name : "+brandName);
		System.out.println("Price : "+price);
		System.out.println("Storage : "+storage);
		System.out.println("Operating System : "+operatingSystem);
	}
}

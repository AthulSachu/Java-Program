package com.xworkz.enterprisecrud.entity;

public class Product {
	private String productName;
    private String category;
    private double price;
    private int stock;
    private double rating;
    
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public Product(String productName, String category, double price, int stock, double rating) {
		this.productName = productName;
		this.category = category;
		this.price = price;
		this.stock = stock;
		this.rating = rating;
	}
}

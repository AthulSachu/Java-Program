package com.xworkz.accessspecifier;

import com.xworkz.accessspecifier.example.ElectronicProduct;

public class ProductRunner extends ElectronicProduct {

    public static void main(String[] args) {
    	Product product = new Product();
    	System.out.println("Product Name = " + product.name);
    	
    	System.out.println("Year = " + product.year);
    	product.displayInfo();
    	product.checkAvailability();
    	
        ElectronicProduct Eproduct = new ElectronicProduct();
        System.out.println("Electronic Product Name = " + Eproduct.productName);  
        Eproduct.powerOn();
        
        ProductRunner runner = new ProductRunner();

        runner.price = 1000.0;
        System.out.println("Price = " + runner.price);
        runner.adjustSettings();         
        System.out.println("Product Name (inherited) = " + runner.productName);
        runner.powerOn();                                             
    }
}

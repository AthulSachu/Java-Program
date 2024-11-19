package com.xworkz.enterprisecrud.service;

import com.xworkz.enterprisecrud.entity.Product;

public class ProductServiceImpl implements ProductService {

	@Override
	public boolean save(Product product) {
		if(product != null) {
			if(product.getProductName().length()>3) {
				if(product.getCategory().equals("ElectronicProduct") || product.getCategory().equals("Fashion")) {
					if(product.getPrice() > 3000.0) {
						if(product.getStock() > 20) {
							if(product.getRating() > 3.0) {
								System.out.println("Product is valid");
								return true;
							}
							System.err.println("Product Rating is too low.");
							return false;
						}
						System.err.println("Number of stocks are less.");
						return false;
					}
					System.err.println("Price should be above 3000.");
					return false;
				}
				System.err.println("Category not available.");
				return false;
			}
			System.err.println("Product Name is not valid.");
			return false;
		}
		System.out.println("Product is null.");
		return false;
	}
}

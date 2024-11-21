package com.xworkz.EnterpriseCrud.service;

import com.xworkz.EnterpriseCrud.entity.Laptop;
import com.xworkz.EnterpriseCrud.repository.*;

public class LaptopServiceImpl implements LaptopService {
	
	LaptopRepository repo = new LaptopRepositoryImpl();

	@Override
	public boolean validate(Laptop laptop) {
		if(laptop != null) {
			if(laptop.getBrandName() != null && laptop.getBrandName().length() > 3) {
				if(laptop.getPrice() > 20000) {
					if(laptop.getStorage() > 128) {
						if(laptop.getOperatingSystem().equals("Windows") || laptop.getOperatingSystem().equals("Ubuntu")) {
							System.out.println("Laptop is valid");
							return repo.save(laptop);
						}
						System.err.println("Operating System should not match.");
						return false;
					}
					System.err.println("Laptop storage is too low.");
					return false;
				}
				System.err.println("Laptop price should be above 20000.");
				return false;
			}
			System.err.println("Laptop Brand is not valid.");
			return false;
		}
		System.err.println("Laptop is invalid.");
		return false;
	}

	@Override
	public Laptop[] readAll() {
		return repo.readAll();
	}

}

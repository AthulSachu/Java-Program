package com.xworkz.EnterpriseCrud.service;

import com.xworkz.EnterpriseCrud.entity.Laptop;

public interface LaptopService {
	public boolean validate(Laptop laptop);
	
	public Laptop[] readAll();
}

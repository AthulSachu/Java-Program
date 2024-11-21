package com.xworkz.EnterpriseCrud.repository;

import com.xworkz.EnterpriseCrud.entity.Laptop;

public interface LaptopRepository {
	public boolean save(Laptop laptop);
	
	public Laptop[] readAll();
}

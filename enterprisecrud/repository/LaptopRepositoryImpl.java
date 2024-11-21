package com.xworkz.EnterpriseCrud.repository;

import com.xworkz.EnterpriseCrud.entity.Laptop;

public class LaptopRepositoryImpl implements LaptopRepository {
	
	Laptop[] data = new Laptop[10];

	@Override
	public boolean save(Laptop laptop) {
		for(int i=0; i<data.length; i++) {
			if(data[i] == null) {
				data[i] = laptop;
				return true;
			}
		}
		return false;
	}
	
	public Laptop[] readAll() {
		return data;
	}
}

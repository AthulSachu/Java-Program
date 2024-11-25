package com.xworkz.EnterpriseCrud.Repository;

import com.xworkz.EnterpriseCrud.Entity.Mobile;

public interface MobileRepository {
	public boolean save(Mobile mobile);
	
	public Mobile[] readAll();
	
	public Mobile findMobilePrice(double price);
	
	public boolean updateBrandNameByPrice(String brand, double price);
	
	public boolean deleteByMobileModel(String model);
}

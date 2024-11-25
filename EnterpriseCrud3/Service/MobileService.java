package com.xworkz.EnterpriseCrud.Service;

import com.xworkz.EnterpriseCrud.Entity.Mobile;

public interface MobileService {
	public boolean validate(Mobile mobile);
	
	public Mobile[] readAll();
	
	public Mobile findMobilePrice(double price);
	
	public boolean updateBrandNameByPrice(String brand, double price);
	
	public boolean deleteByMobileModel(String model);
}

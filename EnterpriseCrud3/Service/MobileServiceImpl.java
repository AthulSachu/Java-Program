package com.xworkz.EnterpriseCrud.Service;

import com.xworkz.EnterpriseCrud.Entity.Mobile;
import com.xworkz.EnterpriseCrud.Repository.MobileRepository;
import com.xworkz.EnterpriseCrud.Repository.MobileRepositoryImpl;

public class MobileServiceImpl implements MobileService {
	
	MobileRepository repo = new MobileRepositoryImpl();

	@Override
	public boolean validate(Mobile mobile) {
	    if (mobile != null) {
	        if (mobile.getBrand() != null && mobile.getBrand().length() > 3) {
	            if (mobile.getPrice() > 10000) { 
	                if (mobile.getBatteryCapacity() > 2000) { 
	                    if (mobile.getColor().equals("Black") || mobile.getColor().equals("Red") || mobile.getColor().equals("White")) {
	                        System.out.println("Mobile is valid");
	                        return repo.save(mobile);
	                    }
	                    System.err.println("Mobile color is not valid.");
	                    return false;
	                }
	                System.err.println("Mobile battery life is too low.");
	                return false;
	            }
	            System.err.println("Mobile price should be above 10000.");
	            return false;
	        }
	        System.err.println("Mobile brand is not valid.");
	        return false;
	    }
	    System.err.println("Mobile is invalid.");
	    return false;
	}

	@Override
	public Mobile[] readAll() {
		return repo.readAll();
	}

	@Override
	public Mobile findMobilePrice(double price) {
		if(price > 10000) {
			return repo.findMobilePrice(price);
		}
		return null;
	}

	@Override
	public boolean updateBrandNameByPrice(String brand, double price) {
		if(price > 10000) {
			if(brand != null && !brand.isEmpty()) {
				return repo.updateBrandNameByPrice(brand, price);
			}
		}
		return false;
	}

	@Override
	public boolean deleteByMobileModel(String model) {
		if(model != null && !model.isEmpty()) {
			return repo.deleteByMobileModel(model);
		}
		return false;
	}
}

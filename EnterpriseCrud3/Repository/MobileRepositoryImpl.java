package com.xworkz.EnterpriseCrud.Repository;

import com.xworkz.EnterpriseCrud.Entity.Mobile;

public class MobileRepositoryImpl implements MobileRepository {
	
	Mobile[] mob = new Mobile[10];

	@Override
	public boolean save(Mobile mobile) {
		for(int i=0; i<mob.length; i++) {
			if(mob[i] == null) {
				mob[i] = mobile;
				return true;
			}
		}
		return false;
	}

	@Override
	public Mobile[] readAll() {
		return mob;
	}

	@Override
	public Mobile findMobilePrice(double price) {
		for(int i=0; i<mob.length; i++) {
			if(mob[i] != null) {
				if(mob[i].getPrice() == price) {
					System.out.println("Mobile Found");
					return mob[i];
				}
			}
		}
		System.out.println("Mobile Not Found");
		return null;
	}

	@Override
	public boolean updateBrandNameByPrice(String brand, double price) {
		for(int i=0; i<mob.length; i++) {
			if(mob[i] != null) {
				if(mob[i].getPrice() == price) {
					mob[i].setBrand(brand);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean deleteByMobileModel(String model) {
		for(int i=0; i<mob.length; i++) {
			if(mob[i] != null) {
				if(mob[i].getModel().equals(model)) {
					mob[i] = null;
					System.out.println("Data has deleted");
					return true;
				}
			}
		}
		return false;
	}

}

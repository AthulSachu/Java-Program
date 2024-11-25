package com.xworkz.EnterpriseCrud;

import com.xworkz.EnterpriseCrud.Entity.Mobile;
import com.xworkz.EnterpriseCrud.Service.*;

public class CrudRunner {
	public static void main(String[] args) {
		Mobile mob = new Mobile("Poco", "F5", 3500, 25000, "Black");
		Mobile mob1 = new Mobile("IPhone", "15 Pro Max", 4500, 65000, "White");
		
		MobileService mobileService = new MobileServiceImpl();
		
		mobileService.validate(mob);
		mobileService.validate(mob1);
		
		Mobile price = mobileService.findMobilePrice(65000);
		
		if(price != null) {
			price.printDetails();
		}
		
		Mobile[] mobiles = mobileService.readAll();
		
		System.out.println("\n");
		System.out.println("-----Before Update-----");		
		for(int i=0; i<mobiles.length; i++) {
			if(mobiles[i] != null) {
				mobiles[i].printDetails();
			}
		}
		
		mobileService.updateBrandNameByPrice("Xiaomi", 25000);
		
		System.out.println("\n");
		System.out.println("-----After Update------");		
		for(int i=0; i<mobiles.length; i++) {
			if(mobiles[i] != null) {
				mobiles[i].printDetails();
			}
		}
		
		mobileService.deleteByMobileModel("15 Pro Max");
		
		System.out.println("\n");
		System.out.println("-----After Deleted------");		
		for(int i=0; i<mobiles.length; i++) {
			if(mobiles[i] != null) {
				mobiles[i].printDetails();
			}
		}
	}
}

package com.xworkz.Abstract;

public class SocialMediaApp extends MobileApp {
	@Override
	public void performFunction() {
		System.out.println("Social Media Application: Interacting with other users");
	}

	@Override
	public void storeData() {
		System.out.println("Stores photos and caches data in memory.");
	}

	@Override
	public void useNetwork() {
		System.out.println("Social Media Application consume network data.");
	}
}

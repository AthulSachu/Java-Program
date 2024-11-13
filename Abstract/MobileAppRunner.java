package com.xworkz.Abstract;

public class MobileAppRunner {
	public static void main(String[] args) {
		MobileApp social = new SocialMediaApp();
		MobileApp game = new GamingApp();
		MobileApp product = new ProductivityApp();
		
		System.out.println("Social Media Application");
		social.appInfo();
		social.performFunction();
		social.storeData();
		social.useNetwork();
		
		System.out.println("\nGaming Application");
		game.appInfo();
		game.performFunction();
		game.storeData();
		game.useNetwork();
		
		System.out.println("\nProductivity Application");
		product.appInfo();
		product.performFunction();
		product.storeData();
		product.useNetwork();
	}
}

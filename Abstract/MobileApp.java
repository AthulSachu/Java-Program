package com.xworkz.Abstract;

public abstract class MobileApp {
	//Abstract Methods
	public abstract void performFunction();
	public abstract void storeData();
	public abstract void useNetwork();
		
	//Concrete Methods
	public void appInfo() {
        System.out.println("This is a mobile application with various features.");
    }
}

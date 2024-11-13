package com.xworkz.Abstract;

public class ProductivityApp extends MobileApp {
	@Override
    public void performFunction() {
        System.out.println("Productivity Application Managing tasks and organizing your schedule.");
    }

    @Override
    public void storeData() {
        System.out.println("Productivity Application stores task lists");
    }

    @Override
    public void useNetwork() {
        System.out.println("Consume network data");
    }
}

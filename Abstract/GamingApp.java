package com.xworkz.Abstract;

public class GamingApp extends MobileApp {
	@Override
    public void performFunction() {
        System.out.println("Gaming Application Playing games and interacting with other players.");
    }

    @Override
    public void storeData() {
        System.out.println("Gaming Application consume Mobile memory");
    }

    @Override
    public void useNetwork() {
        System.out.println("GamingApp consumes network data for online gaming.");
    }
}

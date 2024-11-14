package com.xworkz.TypeCasting;

public class TypeCastingRunner {
	public static void main(String[] args) {
		Vehicle myTruck = new Truck();
        myTruck.startEngine();
  
        Vehicle myScooter = new Scooter();
        myScooter.startEngine();
        
        Vehicle truck = new Truck();
        Truck myWorkTruck = (Truck) truck;
        myWorkTruck.startEngine();

        Vehicle scooter = new Scooter();
        Scooter myElectricScooter = (Scooter) scooter;
        myElectricScooter.startEngine(); 
	}
}

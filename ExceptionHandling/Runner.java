package com.xworkz.ExceptionHandling;

public class Runner {
	public static void main(String[] args) {
		String username = null;
		
		if(username != null) {
			System.out.println("Athul");
		} else {
			System.out.println("String is Null");
		}
		
		Truck truck = new Truck();
		
		Object obj = truck;
		
		if(obj instanceof Truck) {
			Truck trucks = (Truck) obj;
			trucks.startEngine();
		} else {
			System.out.println("Object is not an instance of Truck");
		}
		
		if(obj instanceof Vehicle) {
			Vehicle vehicles = (Vehicle) obj;
			vehicles.startEngine();
		} else {
			System.out.println("Object is not an instance of Vehicle");
		}
		
 	}
	
}

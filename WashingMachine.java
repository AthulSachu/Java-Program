public class WashingMachine {
	//State
	String brand;       
    String model;
    int powerConsumption;                
    float loadCapacity;
    float price;

    //Constructor
    public WashingMachine(String brand, String model, int powerConsumption, float loadCapacity, float price) {
    	this.brand = brand;       
    	this.model = model;
    	this.powerConsumption = powerConsumption;                
    	this.loadCapacity = loadCapacity;
    	this.price = price;
    }

    public void printDetails() {
    	System.out.println("Washing Machine Brand: "+brand);
    	System.out.println("Washing Machine Model: "+model);
    	System.out.println("Washing Machine power consumption: "+powerConsumption+" star");
    	System.out.println("Load Capacity: "+loadCapacity);
    	System.out.println("Price: "+price);
    }
}
public class CeilingFan {
    //State
    String brand;       
    String model;
    int powerConsumption;                
    float price;

    //Constructor
    public CeilingFan(String brand, String model, int powerConsumption, float price) {
    	this.brand = brand;       
    	this.model = model;
    	this.powerConsumption = powerConsumption;                
    	this.price = price;
    }

    public void printDetails() {
    	System.out.println("Ceiling Fan Brand: "+brand);
    	System.out.println("Ceiling Fan Model: "+model);
    	System.out.println("Ceiling Fan power consumption: "+powerConsumption+" star");
    	System.out.println("Price: "+price);
    	System.out.println("<------------------------------------------------------->");
    }
}

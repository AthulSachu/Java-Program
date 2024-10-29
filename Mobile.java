public class Mobile {
    String brand;
    String model;
    int batteryLife;
    double price;
    String color;

    public Mobile() {
        System.out.println("No parameter Constructor");
    }

    public Mobile(String brand) {
        this(); 
        this.brand = brand;
    }

    public Mobile(String brand, String model) {
        this(brand); 
        this.model = model;
    }

    public Mobile(String brand, String model, int batteryLife) {
        this(brand, model);
        this.batteryLife = batteryLife;
    }

    public Mobile(String brand, String model, int batteryLife, double price) {
        this(brand, model, batteryLife); 
        this.price = price;
    }

    public Mobile(String brand, String model, int batteryLife, double price, String color) {
    	this(brand, model, batteryLife, price);
        this.color = color;
    }

    // Method to print details
    public void printDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Battery Life: " + batteryLife);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
    }
}

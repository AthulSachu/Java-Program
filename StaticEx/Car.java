public class Car {
    static String manufacturer;
    static int totalCarsProduced;
    static String country;
    String model;
    Colour colour;
    int year;
    double price;

    static {
        manufacturer = "TATA";
        totalCarsProduced = 1000;
        country = "India";
    }

    public Car(String model, Colour colour, int year, double price) {
        this.model = model;
        this.colour = colour;
        this.year = year;
        this.price = price;
    }

    public void displayCarDetails() {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Total Cars Produced: " + totalCarsProduced);
        System.out.println("Country: " + country);
        System.out.println("Model: " + model);
        System.out.println("Color: " + colour);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
    }
}
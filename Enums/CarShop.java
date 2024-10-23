public class CarShop {
    CompanyName companyName;          
    CarModel model;       
    ManufactureMonth manufactureMonth;              
    CarColour carColour;           
    FuelType fuelType;     
    Transmission transmission; 
    BodyType bodyType;    
    DriveType driveType;   
    Condition condition;   
    CarClass carClass;

    public CarShop(CompanyName companyName, CarModel model, ManufactureMonth manufactureMonth, CarColour carColour, FuelType fuelType, Transmission transmission, BodyType bodyType, DriveType driveType, Condition condition, CarClass carClass) {
        this.companyName = companyName;
        this.model = model;
        this.manufactureMonth = manufactureMonth;
        this.carColour = carColour;
        this.fuelType = fuelType;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.driveType = driveType;
        this.condition = condition;
        this.carClass = carClass;
    }
    
    public void printDetails() {
        System.out.println("Company Name is: " + companyName);
        System.out.println("Car Model is: " + model);
        System.out.println("Car Manufacture Month " + manufactureMonth);
        System.out.println("Car Colour: " + carColour);
        System.out.println("Fuel Type " + fuelType);
        System.out.println("Transmission " + transmission);
        System.out.println("Body Type " + bodyType);
        System.out.println("Drive Type " + driveType);
        System.out.println("Condition " + condition);
        System.out.println("Car Class " + carClass);
    }
}

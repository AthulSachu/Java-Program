public class CarShopInfo {
    public static void main(String[] args) {
        CarShop car = new CarShop(CompanyName.AUDI, CarModel.A4, ManufactureMonth.AUGUST, CarColour.BLACK, FuelType.PETROL, Transmission.AUTOMATIC, BodyType.SEDAN, DriveType.All_Wheel_Drive, Condition.NEW, CarClass.LUXURY);
        car.printDetails();
    }
}

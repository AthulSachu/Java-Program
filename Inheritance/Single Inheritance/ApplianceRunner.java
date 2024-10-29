public class ApplianceRunner {
	public static void main(String args[]) {
		WashingMachine washingMachine = new WashingMachine();

		washingMachine.brand = "LG";
		washingMachine.model = "Twin Wash";
		washingMachine.power = 2000;
		washingMachine.loadCapacity = 7;
		washingMachine.type = "Front Load";
		washingMachine.isRunning = true;

		//Method Inherit
		System.out.println("Method Inherit");
		washingMachine.powerConsumption();

		System.out.println("");
		System.out.println("Brand: " + washingMachine.brand);
        System.out.println("Model: " + washingMachine.model);
        System.out.println("Power: " + washingMachine.power);
        System.out.println("Load Capacity: " + washingMachine.loadCapacity + " kg");
        System.out.println("Type: " + washingMachine.type);
        System.out.println("Is Running: " + washingMachine.isRunning);
	}
}
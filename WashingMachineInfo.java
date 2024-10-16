public class WashingMachineInfo {

	//Array
	static WashingMachine[] washingmachineData = new WashingMachine[8]; 

	public static void main(String args[]) {

		//Object
		WashingMachine washingmachine = new WashingMachine("Whirlpool", "WM5000", 5, 7.0f, 10000.95f);
		WashingMachine washingmachine1 = new WashingMachine("LG", "LGFrontLoad123", 4, 8.5f, 15000.75f);
		WashingMachine washingmachine2 = new WashingMachine("Samsung", "QuickWash700", 5, 6.0f, 12000.50f);
		WashingMachine washingmachine3 = new WashingMachine("Bosch", "EcoSilent300", 3, 9.0f, 20000.99f);
		WashingMachine washingmachine4 = new WashingMachine("Panasonic", "AutoWashPro", 4, 7.5f, 13000.25f);
		WashingMachine washingmachine5 = new WashingMachine("Haier", "TurboWash90", 3, 10.0f, 22000.00f);
		WashingMachine washingmachine6 = new WashingMachine("IFB", "AquaSmart45", 3, 8.0f, 15500.40f);
		WashingMachine washingmachine7 = new WashingMachine("Godrej", "WashMaster400", 5, 6.5f, 11000.99f);

		saveData(washingmachine);
		saveData(washingmachine1);
		saveData(washingmachine2);
		saveData(washingmachine3);
		saveData(washingmachine4);
		saveData(washingmachine5);
		saveData(washingmachine6);
		saveData(washingmachine7);

		for(int i=0; i<washingmachineData.length; i++) {
			if(washingmachineData!=null) {
				washingmachineData[i].printDetails();
			}
		}
	}

	public static void saveData(WashingMachine washingmachine) {
		for (int index=0; index<washingmachineData.length; index++) {
			if(washingmachineData[index] == null) {
				washingmachineData[index] = washingmachine;
				return;
			}
		}
		System.out.println("Array value is full");
	}
}
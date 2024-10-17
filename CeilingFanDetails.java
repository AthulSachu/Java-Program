public class CeilingFanDetails {
	//Array 
	static CeilingFan[] ceilingFanData = new CeilingFan[8];

	public static void main(String args[]) {
		//Creating Object
		CeilingFan ceilingfan = new CeilingFan("Havells", "Hurricane", 5, 3400.00f);
		CeilingFan ceilingfan1 = new CeilingFan("Havells", "CoolingFan123", 5, 3000.00f);
		CeilingFan ceilingfan2 = new CeilingFan("Crompton", "SuperCool", 4, 2800.50f);
		CeilingFan ceilingfan3 = new CeilingFan("Orient", "Tornado", 5, 3200.75f);
		CeilingFan ceilingfan4 = new CeilingFan("Philips", "AirFlow", 3, 2900.00f);
		CeilingFan ceilingfan5 = new CeilingFan("Luminous", "Breeze", 4, 3100.25f);
		CeilingFan ceilingfan6 = new CeilingFan("Wipro", "CoolLite", 5, 3300.90f);
		CeilingFan ceilingfan7 = new CeilingFan("Bajaj", "Mistral", 4, 2950.50f);

		
		saveData(ceilingfan);
		saveData(ceilingfan1);
		saveData(ceilingfan2);
		saveData(ceilingfan3);
		saveData(ceilingfan4);
		saveData(ceilingfan5);
		saveData(ceilingfan6);
		saveData(ceilingfan7);

		//Find
		System.out.println("Finding the Product");
		CeilingFan foundData = findData(3300.90f);
		if(foundData != null) {
			foundData.printDetails();
		}

		//Update
		updateValueUsingBrandName("Orient", 5200.75f);
		updateValueUsingBrandName("Bajaj", 6200.75f);

		//Delete
		deleteValueUsingBrandName("Bajaj");	
	}

	//Save Data into Array
	public static void saveData(CeilingFan ceilingfan) {
		for(int index = 0; index < ceilingFanData.length; index++) {
			if(ceilingFanData[index] == null) {
				ceilingFanData[index] = ceilingfan;
				return;
			}
		}
		System.out.println("Array is full");
	}

	//Find Data in Array
	public static CeilingFan findData(float price) {
		for(int i = 0; i < ceilingFanData.length; i++) {
			if(ceilingFanData[i] != null) {
				if(ceilingFanData[i].price == price) {
					// System.out.println("Brand has been found");
					return ceilingFanData[i];
				}
			}
		}
		System.out.println("Value not found");
		return null;
	}

	//Update Data in Array
	public static void updateValueUsingBrandName(String brandName, float price) {
		for(int i = 0; i < ceilingFanData.length; i++) {
			if(ceilingFanData[i] != null) {
				if(ceilingFanData[i].brandName.equals(brandName)) {
					System.out.println("Before Update");
					ceilingFanData[i].printDetails();

					ceilingFanData[i].price = price;
					System.out.println("After Update");
					ceilingFanData[i].printDetails();
					return;
				}
			}
		}
		System.out.println("Value not found");
		return;
	}

	//Delete Date in Array
	public static void deleteValueUsingBrandName(String brandName) {
		for(int i = 0; i < ceilingFanData.length; i++) {
			if(ceilingFanData[i] != null) {
				if(ceilingFanData[i].brandName.equals(brandName)) {
					System.out.println("Before Deleted");
					ceilingFanData[i].printDetails();

					ceilingFanData[i] = null;

					System.out.println("After Deleted");
					if(ceilingFanData[i]!=null) {
						ceilingFanData[i].printDetails();
						return;
					}
				}
			}
		}
		System.out.println("Value not found");
		return;
	}
}
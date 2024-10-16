public class CeilingFanInfo {

	//Array
	static CeilingFan[] ceilingFanData = new CeilingFan[8]; 

	public static void main(String args[]) {

		//Object
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

		for(int i=0; i<ceilingFanData.length; i++) {
			if(ceilingFanData!=null) {
				ceilingFanData[i].printDetails();
			}
		}
	}

	public static void saveData(CeilingFan ceilingfan) {
		for (int index=0; index<ceilingFanData.length; index++) {
			if(ceilingFanData[index] == null) {
				ceilingFanData[index] = ceilingfan;
				return;
			}
		}
		System.out.println("Array value is full");
	}
}
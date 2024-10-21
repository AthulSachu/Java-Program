public class StringExample {
	public static void main(String args[]) {
		// Using literals
		String car = "Lamborghini"; //String pool Address
		String carBrand = "Toyota";
		String carModel = "Camry";
		String color = "Blue";
		String year = "2023";
		String ownerName = "Rajesh";
		String licensePlate = "TN-01-1234";
		String serviceCenter = "XYZ Auto Services";
		String serviceDate = "January 15, 2024";
		String warrantyPeriod = "3 Years";
		String fuelType = "Petrol";

		// Using new Keywoord
		String intern = new String("Athul");
		String dept = new String("Development");
		String client = new String("X Workz");
		String deadline = new String("Dec 31, 2024");
		String techUsed = new String("Java");
		String numOfTeamMembers = new String("5");
		String officeAddr = new String("123 Main St, Chennai");
		String projStatus = new String("In Progress");
		String meetingTime = new String("Mon at 10 AM");
		String feedbackTo = new String("HR");

		String car1 = new String("Lamborghini"); //Instance Memory Address
		System.out.println(car==car1);
		System.out.println(car.equals(car1));

		char[] charArr = car.toCharArray();
		String value = "";
		for(int i = charArr.length - 1; i >= 0; i--) {
			value = value + charArr[i];
		}
		System.out.println(value);
	}
}
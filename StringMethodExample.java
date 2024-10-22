public class StringMethodExample {
	public static void main(String[] args) {
		//Concat
		System.out.println("Concatenate String");
		String firstName = "Athul";
		String lastName =" V Kumar";
		String fullName = firstName.concat(lastName);
		System.out.println(fullName);

		//toUpper
		System.out.println("");
		System.out.println("String to Upper Case");
		String movieName = "bangalore days";
		String nameUpper = movieName.toUpperCase();
		System.out.println(nameUpper);

		//toLower
		System.out.println("");
		System.out.println("String to Lower Case");
		String carName = "LAMBORGHINI";
		String carNameLower = carName.toLowerCase();
		System.out.println(carNameLower);

		//trim
		System.out.println("");
		System.out.println("String Trim");
		String bankName = "    SBI    ";
		String nameTrim = bankName.trim();
		System.out.println(nameTrim);

		//isEmpty
		System.out.println("");
		System.out.println("String is Empty or not");
		String value = "";
		Boolean valueEmpty = value.isEmpty();
		System.out.println(valueEmpty);

		//split
		System.out.println("");
		System.out.println("Split String");
		String ownerName = "Maneesh Kavu";
		String[] nameSplit = ownerName.split(" ");
		System.out.println(nameSplit[0]);
		System.out.println(nameSplit[1]);

		//Palindrome
		System.out.println("");
		System.out.println("Palindrome");
		String originalName = "malayalam";
		String reversedName = "";
		char[] originalNameArray = originalName.toCharArray();
		for(int i = originalNameArray.length-1; i >= 0; i--) {
			reversedName = reversedName + originalNameArray[i];
		}
		if(originalName.equals(reversedName)) {
			System.out.println("Is a Palindrome");
		}
		else {
			System.out.println("Is not a Palindrome");
		}

		//Second Smalles0
		System.out.println("");
		System.out.println("Second Smallest Number");
		int[] arr = {56, 8, 45, 2, 99, 4, 75 , 0 };
		int smallValue = secondSmallestNum(arr);
		System.out.println(smallValue);
	}

	public static int secondSmallestNum(int arr[]) {
		int smallestValue = arr[0];
		int secondSmallestValue = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < smallestValue) {
				secondSmallestValue = smallestValue;
				smallestValue = arr[i];
			}
			else if(arr[i]< secondSmallestValue){
				secondSmallestValue = arr[i];
			}
		}
		return secondSmallestValue;
	}
}
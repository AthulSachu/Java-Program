public class ParameterSession {
	public static void main(String[] args) {
		email("athul@gmail.com", "Parameter Examples");
		email("sumanthnoob@gmail.com", "Bgmi Account verification required");
		email("anish@gmail.com", "Hiring now");

		phoneCall(91,9876543211l,"Athul");
		phoneCall(52,8765387231l,"Maneesh");
		phoneCall(91,7856221457l,"SumanthNoob");

		login("akash@gmail.com", "admin123");
		login("athul@gmail.com", "pass321");
		login("user@gmail.com", "user8089");
	}

	public static void email(String emailId, String subject) {
		System.out.println("Email Id is " +emailId+ " Subject is " +subject);
	}

	public static void phoneCall(int countryCode, long mobileNum, String name) {
		System.out.println("Phone number is +" +countryCode+ " " +mobileNum+ " Name is " +name);
	}

	public static void login(String email, String password) {
        System.out.println("Email is: " + email + " password is : " + password);
    }
}
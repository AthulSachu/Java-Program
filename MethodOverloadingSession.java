public class MethodOverloadingSession {
	public static void main(String[] args) {
        collegeRegister(1001);
        collegeRegister("Sumanth");
        collegeRegister("Athul", 25);
        collegeRegister(1002, "Athul");

        bankAccount(4523789456l);
        bankAccount("Athul");
        bankAccount(456123, "Anish", 23412453l);
        bankAccount("Maneesh", 30254123l, 7795668);

        calculateArea(10);
        calculateArea(10.3);
        calculateArea(15, 5.3);
        calculateArea(13.5, 8);

        double returnAvgValue = calculateAverage(10.0, 20.0, 30.0);
        System.out.println(returnAvgValue);
    }

    //change the datatype of parameter
    public static void collegeRegister(int id) {
        System.out.println(id);
    }

    public static void collegeRegister(String name) {
        System.out.println(name);
    }
    
    //change the number of parameter
    public static void collegeRegister(String name, int age) {
        System.out.println(name + "," + age);
    }

    //change the order of parameter
    public static void collegeRegister(int id, String name) {
        System.out.println(id + "," + name);
    }

    //change the datatype of parameter
    public static void bankAccount(long accountNumber) {
        System.out.println(accountNumber);
    }

    public static void bankAccount(String accountUserName) {
        System.out.println(accountUserName);
    }

    //change the number of parameter
    public static void bankAccount(int accountNumber, String accountUserName, long balance) {
        System.out.println(accountNumber+ "," +accountUserName+ "," +balance);
    }
    
    //change the order of parameter
    public static void bankAccount(String accountUserName, long balance, int accountNumber) {
        System.out.println(accountUserName+ "," +balance+ "," +accountNumber);
    }

    //change the datatype of parameter
    public static void calculateArea(int a) {
        System.out.println(a * a);
    }

    public static void calculateArea(double b) {
        System.out.println(b * b);
    }
    
    //change the number of parameter
    public static void calculateArea(int a, double b) {
        System.out.println("Sum is" +"="+ (a + b));
    }
    
    //change the order of parameter
    public static void calculateArea(double a, int b) {
        System.out.println("Product is " + "=" + (a * b));
    }

    //variable Arguments
    public static double calculateAverage(double... numbers) {
    double sum = 0;
    for (int i = 0; i < numbers.length; i++) {
        sum = sum + numbers[i];
    }
    
    return sum / numbers.length;
	}
}
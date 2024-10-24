public class Employee {
    static String companyName;
    static int totalEmployees;
    static String headquarters;
    String name;
    int employeeID;
    double salary;
    Department department;

    static {
        companyName = "TCS";
        totalEmployees = 10000;
        headquarters = "India";
    }

    public Employee(String name, int employeeID, double salary, Department department) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
        this.department = department;
    }

    public void printCompanyDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Total Employees: " + totalEmployees);
        System.out.println("Headquarters: " + headquarters);
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("Employee ID: " + employeeID);
    }
}

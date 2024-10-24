public class Runner {
    public static void main(String[] args) {
        Car car = new Car("Nexon", Colour.BLUE, 2024, 1000000);
        car.displayCarDetails();

        System.out.println(" ");
        Country country = new Country(CountryName.INDIA, "New Delhi", 1393409038, "Hindi");
        country.printCountryDetails();

        System.out.println(" ");
        Employee employee = new Employee("John Doe", 1234, 75000.50, Department.ENGINEERING);
        employee.printCompanyDetails();

        System.out.println(" ");
        BookStore book = new BookStore("Wings of Fire", "APJ", 500, "Autobiography");
        book.printBookDetails();

        System.out.println(" ");
        Football football = new Football(TeamName.ARSENAL, "Pep Guardiola", "England", 9);
        football.printFootballDetails();
    }
}

public class Country {
    static String continent;
    static int totalCountries;
    static String mainCurrency;
    CountryName countryName;
    String capital;
    int population;
    String language;

    static {
        continent = "Asia";
        totalCountries = 50;
        mainCurrency = "Rupees";
    }
    
    public Country(CountryName countryName, String capital, int population, String language) {
        this.countryName = countryName;
        this.capital = capital;
        this.population = population;
        this.language = language;
    }

    public void printCountryDetails() {
        System.out.println("Continent: " + continent);
        System.out.println("Total Countries: " + totalCountries);
        System.out.println("Main Currency: " + continent);
        System.out.println("Country: " + countryName);
        System.out.println("Capital: " + capital);
        System.out.println("Population: " + population);
        System.out.println("Official Language: " + language);
        System.out.println("Main Currency: " + mainCurrency);
    }
}

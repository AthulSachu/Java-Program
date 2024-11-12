package com.xworkz.encapsulation;

public class MovieRunner {
	public static void main(String[] args) {
		Movies movie = new Movies("Kantara", "Rishab Shetty", "Drama Thriller", 2021, "Kannada", 148, "Hombale Films", 2.0, 150.0, 8.2, false, "Rishab Shetty", "Sapthami", "B. Ajaneesh", "Suresh", "Rishab Shetty", "Arvind", "AA Films", true, "India");
		
		movie.printDetails();
		
		movie.setBudget(4.0);
		
		double upMovieBudget = movie.getBudget();
		
		System.out.println("\nUpdate in Movie Budget: "+upMovieBudget);
		
		movie.setBoxOffice(150.0);
		
		double upBoxOffice = movie.getBoxOffice();
		
		System.out.println("\nNew Box Office Budget: "+upBoxOffice);
		
		movie.setReleaseYear(2022);
		
		int releaseYear = movie.getReleaseYear();
		
		System.out.println("\nRelease Year: "+releaseYear);
		
		movie.setInTheaters(true);
		
		boolean inTheaters = movie.getInTheaters();
		
		System.out.println("\nIs in Theaters: "+inTheaters);
		
		Movies movie1 = new Movies("Drishyam", "Jeethu Joseph", "Crime Thriller", 2013, "Malayalam", 160, "Aashirvad Cinemas", 0.5, 75.0, 8.5, false, "Mohanlal", "Meena", "Anil Johnson", "Sujith Vaassudev", "Jeethu Joseph", "Mohanlal", "Maxlab Cinemas", true, "India");
		
		System.out.println("");
		
		movie1.printDetails();

		movie1.setBudget(0.8);
		double up1MovieBudget = movie.getBudget();
		System.out.println("\nUpdate in Movie Budget: " + up1MovieBudget);

		movie1.setBoxOffice(80.0); 
		double up1BoxOffice = movie.getBoxOffice();
		System.out.println("\nNew Box Office Collection: " + up1BoxOffice);

		movie1.setReleaseYear(2015);
		int releaseYear1 = movie.getReleaseYear();
		System.out.println("\nRelease Year: " + releaseYear1);

		movie1.setInTheaters(false);  
		boolean inTheaters1 = movie.getInTheaters();
		System.out.println("\nIs in Theaters: " + inTheaters1);
	}
}

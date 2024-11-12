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
	}
}

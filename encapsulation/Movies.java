package com.xworkz.encapsulation;

public class Movies {
    private String movieTitle;
    private String director;
    private String genre;
    private int releaseYear;
    private String language;
    private double duration;
    private String productionCompany;
    private double budget;
    private double boxOffice;
    private double rating;
    private boolean isInTheaters;
    private String leadActor;
    private String leadActress;
    private String soundtrackComposer;
    private String editor;
    private String writer;
    private String cinematographer;
    private String distributor;
    private boolean isOscarNominated;
    private String country;
    
    public String getMovieTitle() {
        return movieTitle;
    }

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getLanguage() {
        return language;
    }

    public double getDuration() {
        return duration;
    }

    public String getProductionCompany() {
        return productionCompany;
    }

    public double getBudget() {
        return budget;
    }

    public double getBoxOffice() {
        return boxOffice;
    }

    public double getRating() {
        return rating;
    }

    public boolean getInTheaters() {
        return isInTheaters;
    }

    public String getLeadActor() {
        return leadActor;
    }

    public String getLeadActress() {
        return leadActress;
    }

    public String getSoundtrackComposer() {
        return soundtrackComposer;
    }

    public String getEditor() {
        return editor;
    }

    public String getWriter() {
        return writer;
    }

    public String getCinematographer() {
        return cinematographer;
    }

    public String getDistributor() {
        return distributor;
    }

    public boolean isOscarNominated() {
        return isOscarNominated;
    }

    public String getCountry() {
        return country;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setProductionCompany(String productionCompany) {
        this.productionCompany = productionCompany;
    }

    public void setBudget(double budget) {
    	if(budget > 0) {
    		this.budget = budget;
    	}
    }

    public void setBoxOffice(double boxOffice) {
    	if(boxOffice > 0) {
    		this.boxOffice = boxOffice;
    	}
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setInTheaters(boolean isInTheaters) {
        this.isInTheaters = isInTheaters;
    }

    public void setLeadActor(String leadActor) {
        this.leadActor = leadActor;
    }

    public void setLeadActress(String leadActress) {
        this.leadActress = leadActress;
    }

    public void setSoundtrackComposer(String soundtrackComposer) {
        this.soundtrackComposer = soundtrackComposer;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setCinematographer(String cinematographer) {
        this.cinematographer = cinematographer;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    public void setOscarNominated(boolean isOscarNominated) {
        this.isOscarNominated = isOscarNominated;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    public void playMovie() {
    	System.out.println("Play Movie");
    }
    
    public void giveInformation() {
    	System.out.println("Give Information");
    }
    
    public Movies(String movieTitle, String director, String genre, int releaseYear, String language, double duration,
            String productionCompany, double budget, double boxOffice, double rating, boolean isInTheaters,
            String leadActor, String leadActress, String soundtrackComposer, String editor, String writer,
            String cinematographer, String distributor, boolean isOscarNominated, String country) {
    	this.movieTitle = movieTitle;
    	this.director = director;
    	this.genre = genre;
    	this.releaseYear = releaseYear;
    	this.language = language;
    	this.duration = duration;
    	this.productionCompany = productionCompany;
    	this.budget = budget;
    	this.boxOffice = boxOffice;
    	this.rating = rating;
    	this.isInTheaters = isInTheaters;
    	this.leadActor = leadActor;
    	this.leadActress = leadActress;
    	this.soundtrackComposer = soundtrackComposer;
    	this.editor = editor;
    	this.writer = writer;
    	this.cinematographer = cinematographer;
    	this.distributor = distributor;
    	this.isOscarNominated = isOscarNominated;
    	this.country = country;
    }
    
    public void printDetails() {
        System.out.println("Movie Title: " + movieTitle);
        System.out.println("Director: " + director);
        System.out.println("Genre: " + genre);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Language: " + language);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Production Company: " + productionCompany);
        System.out.println("Budget: " + budget + " cr");
        System.out.println("Box Office: " + boxOffice + " cr");
        System.out.println("Rating: " + rating);
        System.out.println("In Theaters: " + isInTheaters);
        System.out.println("Lead Actor: " + leadActor);
        System.out.println("Lead Actress: " + leadActress);
        System.out.println("Soundtrack Composer: " + soundtrackComposer);
        System.out.println("Editor: " + editor);
        System.out.println("Writer: " + writer);
        System.out.println("Cinematographer: " + cinematographer);
        System.out.println("Distributor: " + distributor);
        System.out.println("Oscar Nominated: " + isOscarNominated);
        System.out.println("Country: " + country);
    }
}

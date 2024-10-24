public class Football {
    static String leagueName;
    static int totalPlayers = 11;
    static int numberOfCaptains = 1;
    TeamName teamName;                  
    String coachName; 
    String country;
    int noOfTrophy;

    static {
        leagueName = "Premier League";
        totalPlayers = 11;
        numberOfCaptains = 1;
    }

    public Football(TeamName teamName, String coachName, String country, int noOfTrophy) {
        this.teamName = teamName;
        this.coachName = coachName;
        this.country = country;
        this.noOfTrophy = noOfTrophy;  
    }

    public void printFootballDetails() {
        System.out.println("League Name: " + leagueName);
        System.out.println("Total Players in Team: " + totalPlayers);
        System.out.println("Number of Captains: " + numberOfCaptains);
        System.out.println("Team Name: " + teamName);
        System.out.println("Coach Name: " + coachName);
        System.out.println("Country: " + country);
        System.out.println("Number of Trophies: " + noOfTrophy);
    }
}

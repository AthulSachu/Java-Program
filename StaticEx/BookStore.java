public class BookStore {
    static String storeName;
    static String storeLocation;
    static String openingHours;
    String bookTitle;              
    String author;                   
    double price;                    
    String genre; 

    static {
        storeName = "Book Heaven";
        storeLocation = "Bengaluru";
        openingHours = "9 AM - 9 PM";
    }

    public BookStore(String bookTitle, String author, double price, String genre) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.price = price;
        this.genre = genre;
    }

    public void printBookDetails() {
        System.out.println("Bookstore Name: " + storeName);
        System.out.println("Location: " + storeLocation);
        System.out.println("Opening Hours: " + openingHours);  
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Genre: " + genre);
    }
}

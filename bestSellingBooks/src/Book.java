// File from Educative course: Learning object oriented programming in java Project 1
//https://www.educative.io/courses/learn-object-oriented-programming-in-java/overview-of-dataset
import java.lang.String;

public class Book {
    private String title;
    private String author;
    private String userRating;
    private String reviews;
    private String price;
    private String year;
    private String genre;

    public Book(String title,
            String author,
            String userRating,
            String reviews,
            String price,
            String year,
            String genre) {
        this.title = title;
        this.author = author;
        this.userRating = userRating;
        this.reviews = reviews;
        this.price = price;
        this.year = year;
        this.genre = genre;

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getUserRating() {
        return userRating;
    }

    public String getReviews() {
        return reviews;
    }

    public String getPrice() {
        return price;
    }

    public String getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setUserRating(String userRating) {
        this.userRating = userRating;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void printBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("User Rating: " + userRating);
        System.out.println("Reviews: " + reviews);
        System.out.println("Price: $" + price);
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre);
        System.out.println();

    }
}

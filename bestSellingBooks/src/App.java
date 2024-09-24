import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Reader reader = new Reader();
        List<Book> books = reader.readDataset("data.csv");
        Utility utils = new Utility();
        String testAuthor = "J.K. Rowling";

        // Task 1: retrive number of books by author
        // int count = utils.totalNumofBooksByAuthor(books, testAuthor);
        // System.out.println("Totla number of books by J.K. Rowling: " + count);

        // Task 2: retrive all authors in dataset
        // ArrayList<String> authors = utils.allAuthorsInSet(books);
        // for (String author : authors){
        // System.out.println(author);
        // }

        // Task 3: retrive all titles by an author
        // ArrayList<String> titles = utils.allBooksByAnAuthor(books, testAuthor);
        // for (String title : titles){
        // System.out.println(title);
        // }

        // Task 4: Retrive all books with a given user rating
        // HashMap<String, String> titleHashmap = utils.classifyByUserRating(books, 4.7);
        // System.out.println(titleHashmap.size());
        // System.out.println("[");
        // titleHashmap.forEach((k, v) -> System.out.println("Book " + k + " by " + v + ","));
        // System.out.println("]");

        // Task 5: Retrive all books by an author and their prices
        HashMap<String, String> titleHashmap = utils.allBooksAndPricesByAnAuthor(books, testAuthor);
        titleHashmap.forEach((k,v) -> System.out.println(k + " = " + v));

    }
}

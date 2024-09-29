// File holds all 5 completed task from Educative course: Learning object oriented programming in java Project 1

import java.util.*;

public class Utility {

    public int totalNumofBooksByAuthor(List<Book> books, String author) {
        int count = 0;
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                count++;
            }
        }
        return count;
    }

    public ArrayList<String> allAuthorsInSet(List<Book> books) {
        ArrayList<String> authorList = new ArrayList<String>();
        HashMap<String, Integer> authorHashmap = new HashMap<String, Integer>();
        for (Book book : books) {
            if (!authorHashmap.containsKey(book.getAuthor())) {
                authorHashmap.put(book.getAuthor(), 1);
                authorList.add(book.getAuthor());
            } else {
                authorHashmap.put(book.getAuthor(), authorHashmap.get(book.getAuthor()) + 1);
            }
        }
        return authorList;
    }

    public ArrayList<String> allBooksByAnAuthor(List<Book> books, String author) {
        ArrayList<String> authorsBooks = new ArrayList<String>();
        HashMap<String, Integer> titleHashmap = new HashMap<String, Integer>();
        for (Book book : books) {
            if (book.getAuthor().equals(author) && !titleHashmap.containsKey(book.getTitle())) {
                titleHashmap.put(book.getTitle(), 1);
                authorsBooks.add(book.getTitle());
            }
        }

        return authorsBooks;
    }

    public HashMap<String, String> classifyByUserRating(List<Book> books,
            Double userRaiting) {
        HashMap<String, String> titleHashmap = new HashMap<String, String>();
        for (Book book : books) {

            if (Double.valueOf(book.getUserRating()).equals(userRaiting)
                    && !titleHashmap.containsKey(book.getTitle())) {
                titleHashmap.put(book.getTitle(), book.getAuthor());

            }

        }
        return titleHashmap;

    }
    public HashMap<String, String> allBooksAndPricesByAnAuthor(List<Book> books, String author){
        HashMap<String, String> titleHashmap = new HashMap<String, String>();
        for (Book book : books){
            if (book.getAuthor().equals(author) && !titleHashmap.containsKey(book.getTitle())){
                titleHashmap.put(book.getTitle(), book.getPrice());
            }
        }
        return titleHashmap;
    }
}

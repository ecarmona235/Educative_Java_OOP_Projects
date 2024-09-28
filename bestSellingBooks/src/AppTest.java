import static org.junit.Assert.assertEquals;
import java.util.*;

import org.junit.Test;

public class AppTest {
   Reader reader = new Reader();
   List<Book> books = reader.readDataset("src/data.csv");
   Book testBook;
   Utility utils = new Utility();
   String testAuthor = "J.K. Rowling";

   // testing  task 1
   @Test
   public void test1(){
      int count = utils.totalNumofBooksByAuthor(books, testAuthor);
      assertEquals(6, count);
   }
   
   // testing task 2
   @Test
   public void test2(){
      ArrayList<String> authors = utils.allAuthorsInSet(books);
      assertEquals(247, authors.size());
   }

   // testing task 3
   @Test
   public void test3(){
      ArrayList<String> titles = utils.allBooksByAnAuthor(books, testAuthor);
      assertEquals(6,titles.size());
   }
   
   // testing task 4
   @Test
   public void test4(){
      HashMap<String, String> titleHashmap = utils.classifyByUserRating(books, 4.7);
      assertEquals(65, titleHashmap.size());
   }

   // testing task 5
   @Test
   public void test5(){
      HashMap<String, String> titleHashmap = utils.allBooksAndPricesByAnAuthor(books, testAuthor);
      assertEquals(6, titleHashmap.size());
   }




}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    public List<Book> readDataset(String file) {
        String line = "";
        String splitBy = ",(?=([^\"]*\"[^\"]*\")*[^\"]*$)";
        List<Book> books = new ArrayList<>();

        try {
            // parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader(file));
            int count = 0;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(splitBy);
                if (count > 1) {
                    // Name
                    // Author
                    // User Rating
                    // Reviews
                    // Price
                    // Year
                    books.add(new Book(data[0].replace("\"", ""), data[1].replace("\"", ""), data[2].replace("\"", ""),
                            data[3].replace("\"", ""), data[4].replace("\"", ""), data[5].replace("\"", ""),
                            data[6].replace("\"", "")));

                }
                count++;

            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return books;
    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    ArrayList<Integer> numbers;
    Scanner reader;

    public FileReader(String root) throws FileNotFoundException
    {
        reader = new Scanner(new File(root));
        numbers = new ArrayList<>();
    }

    public ArrayList<Integer> read()
    {
        while (reader.hasNextInt())
        {
            numbers.add(reader.nextInt());
        }
        return numbers;
    }
}

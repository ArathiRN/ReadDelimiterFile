import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args) {
        try {
            String Location = "resource/readDelimiterFile.txt";
            String data;
            File file = new File(Location);
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                data = sc.nextLine();;
                System.out.println(data);
            }

        }
        catch(FileNotFoundException e){
            System.out.println("File not found");

        }
    }
}
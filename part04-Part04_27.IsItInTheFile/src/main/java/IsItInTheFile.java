
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;
        
public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> lines = new ArrayList<>();
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while(fileScanner.hasNextLine()) {
                lines.add(fileScanner.nextLine());
            }
            boolean isInFile = false;
            for (String line : lines) {
                if(line.equals(searchedFor)) {
                    isInFile = true;
                    break;
                } else {
                    isInFile = false;
                }
            }
            
            if (isInFile) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}

import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> lines = new ArrayList<>();
        
        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try(Scanner fileScanner = new Scanner(Paths.get(file))) {
            while(fileScanner.hasNextLine()) {
                lines.add(Integer.valueOf(fileScanner.nextLine()));
            }
            int count = 0;
            for(int i : lines) {
                if (i >= lowerBound && i <= upperBound) {
                    count += 1;
                }
            }
            System.out.println("Numbers: " + count);
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}

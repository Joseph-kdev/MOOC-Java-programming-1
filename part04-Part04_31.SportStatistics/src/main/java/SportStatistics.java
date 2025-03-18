
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();
        
        System.out.println("File:");
        String file = scan.nextLine();
        
        System.out.println("Team:");
        String team = scan.nextLine();
        
        try(Scanner fileScanner = new Scanner(Paths.get(file))) {
            while(fileScanner.hasNextLine()) {
                lines.add(fileScanner.nextLine());
            }
            int count = 0;
            int wins = 0;
            int loses = 0;
            for(String line : lines) {
                if(line.contains(team)) {
                    count += 1;
                    String[] parts = line.split(",");
                    if (parts[0].equals(team) && Integer.valueOf(parts[2]) > Integer.valueOf(parts[3])) {
                        wins += 1;
                    } else if(parts[1].equals(team) && Integer.valueOf(parts[3]) > Integer.valueOf(parts[2])) {
                        wins += 1;
                    } else if (parts[0].equals(team) && Integer.valueOf(parts[2]) < Integer.valueOf(parts[3])) {
                        loses += 1;
                    } else if (parts[1].equals(team) && Integer.valueOf(parts[3]) < Integer.valueOf(parts[2])) {
                        loses += 1;
                    }
                }
                
            }
            System.out.println("Games: " + count);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + loses);
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}

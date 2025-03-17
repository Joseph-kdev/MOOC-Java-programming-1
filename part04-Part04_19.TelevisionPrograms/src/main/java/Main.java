import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.println("Name: ");
            String input = scanner.nextLine();
            if(input.equals("")) {
                break;
            }
            
            System.out.println("Duration");
            int duration = Integer.valueOf(scanner.nextLine());
            
            programs.add(new TelevisionProgram(input, duration));
            
        }
        
        System.out.println("Program's maximum duration? ");
        int maxDuration = Integer.valueOf(scanner.nextLine());
        
        for(TelevisionProgram program : programs){
            if(program.getDuration() <= maxDuration){
                System.out.println(program.getName() + ", " + program.getDuration());
            }
        }
    }
}

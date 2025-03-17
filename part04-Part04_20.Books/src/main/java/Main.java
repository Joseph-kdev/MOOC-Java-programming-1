import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while(true) {
            System.out.println("Title: ");
            String input = scanner.nextLine();
            if(input.equals("")) {
                break;
            }
            
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(input, pages, year));
        }
        
        System.out.println("What information will be printed? ");
        String prompt = scanner.nextLine();
        
        for(Book bk : books) {
            if(prompt.equals("everything")) {
                System.out.println(bk.toString());
            } else if(prompt.equals("name")) {
                System.out.println(bk.getName());
            }
            
        }
    }
}

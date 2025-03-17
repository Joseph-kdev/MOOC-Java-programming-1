
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        
        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!
        PaymentCard Pauls = new PaymentCard(20);
        PaymentCard Matts = new PaymentCard(30);
        
        Pauls.eatHeartily();
        Matts.eatAffordably();
        
        System.out.println("Paul: " + Pauls.toString());
        System.out.println("Matt: " + Matts.toString());
        
        Pauls.addMoney(20);
        Matts.eatHeartily();
        
                
        System.out.println("Paul: " + Pauls.toString());
        System.out.println("Matt: " + Matts.toString());
        
        Pauls.eatAffordably();
        Pauls.eatAffordably();
        Matts.addMoney(50);
        
                
        System.out.println("Paul: " + Pauls.toString());
        System.out.println("Matt: " + Matts.toString());
    }
}

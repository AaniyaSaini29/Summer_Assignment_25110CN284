import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        
            int age = input.nextInt();
            
            if (age >= 18) {
                System.out.println("YOU ARE ELIGIBLE TO VOTE!");
            } else if (age < 0) {
                System.out.println("INVALID AGE ENTERED. AGE CANNOT BE NEGATIVE!");
            } else {
                System.out.println("YOU ARE NOT ELIGIBLE TO VOTE!");
            }
         
        
    }
}
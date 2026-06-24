import java.util.Scanner;
    public class PrimeFunction{
        public static boolean prime(int num){
        if (num <= 1) return false; 
        if (num == 2) return true;  
        if (num % 2 == 0) return false;  
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
                }
        }

        return true;  
    }

     public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("ENTER ANY NUMBER: ");
       int num = input.nextInt();
       if (prime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is NOT a prime number.");
        }
 
    }
 }
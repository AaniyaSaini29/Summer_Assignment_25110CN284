import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("ENTER ANY NUMBER: ");
        int num = input.nextInt();
        int c;
        System.out.println("ALL THE FACTORS OF "+num+ " ARE: ");
        for(int i = 1; i <= num ; i++) {
            c= num%i;
            if(c == 0){
              System.out.print(i + " ");  
            }
            
        }
    }
    
}
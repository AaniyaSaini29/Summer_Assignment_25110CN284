import java.util.Scanner;
public class ReverseStar{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("REVERSE STAR");
        System.out.print("Enter the no. of rows: ");
        int row = input.nextInt();
        System.out.print("Enter the no. of columns: ");
        int column = input.nextInt();
        

        for(int i = 1;i<=row;i++){
            
            for(int j =1;i+j<= column +1 ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

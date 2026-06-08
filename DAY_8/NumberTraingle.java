import java.util.Scanner;
public class NumberTraingle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("NUMBER TRIANGLE");
        System.out.print("Enter the no. of rows: ");
        int row = input.nextInt();
        System.out.print("Enter the no. of columns: ");
        int column = input.nextInt();
        

        for(int i = 1;i<=row;i++){
            int n =1;
            for(int j =1;j<=i ;j++){
                System.out.print(n);
                n++;
            }
            System.out.println();
        }
    }
}

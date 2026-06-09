import java.util.Scanner;
public class HalfPyramid{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("HALF PYRAMID");
        System.out.print("Enter the no. of rows : ");
        int row = input.nextInt();
        System.out.print("Enter the no. of column : ");
        int column = input.nextInt();
        
        for(int i=1;i<=row;i++){
            for(int j=1;j<= column-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

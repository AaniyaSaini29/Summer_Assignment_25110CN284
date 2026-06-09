import java.util.Scanner;
public class HollowSquare{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("HOLLOW SQUARE");

        System.out.print("Enter the no.of rows: ");
        int row = input.nextInt();

        System.out.print("Enter the no. of column: ");
        int column = input.nextInt();

        for(int i= 1; i<=row;i++){
            if(i==1 || i==row){
            for(int j =1; j<=column;j++){
                System.out.print("* ");

            }
            System.out.println();
        }
        else{
            for(int l = 1;l<=column;l++){
                   if(l==1 || l==column){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            input.close();
        }
    }
}

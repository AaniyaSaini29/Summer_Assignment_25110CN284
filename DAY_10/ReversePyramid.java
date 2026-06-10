import java.util.Scanner;
public class ReversePyramid{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("REVERSE PYRAMID");

        System.out.print("Enter the number of rows : ");
        int row = input.nextInt();

        for(int i = 0; i<row ; i++){
            for(int j=1; j<row; j++){
                if(i<j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int k=1; k<=row-i ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    

}

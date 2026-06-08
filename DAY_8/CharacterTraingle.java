import java.util.Scanner;
public class CharacterTraingle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("CHARACTER TRIANGLE");
        System.out.print("Enter the no. of rows: ");
        int row = input.nextInt();
        System.out.print("Enter the no. of columns: ");
        int column = input.nextInt();
        

        for(int i = 1;i<=row;i++){
            char  c = 'A';
            for(int j =1;j<=i ;j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
}


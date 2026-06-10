import java.util.Scanner;
public class NumberPyramid{
    public static void main(String[] args){
        System.out.println("NUMBER PYRAMID");
        int row = 5;
        int column = 9;
       
        for(int i=1;i<=row;i++){
            for(int j=1;j<=(column/2 + 1)-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print( k );
            }
            int m= i-1;
            for(int l=1;l<i;l++){
               
                System.out.print( m );
                m--;
                
            }
            System.out.println();
            
        }
    }
}
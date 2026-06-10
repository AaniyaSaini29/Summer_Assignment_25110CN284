import java.util.Scanner;
public class CharPyramid{
    public static void main(String[] args){
        System.out.println("CHARACTER PYRAMID");
        int row = 5;
        int column = 9;
        
     
       
        for(int i=1;i<=row;i++){
            for(int j=1;j<=(row)-i;j++){
                System.out.print(" ");
            }
            char c = 'A';
            for(int k=1;k<=i;k++){
                System.out.print( c );
                c++;
            }
            
            for(int l=i-2 ;l>=0;l--){
               
              System.out.print((char)('A' + l ) );

            }
            
            
            System.out.println();
            
        }
    }
}
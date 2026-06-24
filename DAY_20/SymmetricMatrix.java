import java.util.Scanner;

public class SymmetricMatrix {
    public static void MatrixInput(int[][] matrix,int row){
        Scanner input = new Scanner(System.in);
        for(int i=0; i<row;i++){
            for (int j = 0; j < row; j++) {
                System.out.print("ELEMENT "+(i+1)+(1+j) +" = ");
                matrix[i][j]=input.nextInt(); 
            }
        }

    }

    public static void PrintMatrix(int[][]matrix,int row){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(matrix[i][j]+" ");
                
            }
            System.out.println();
            
        }
      

    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("ENTER THE NUMBER OF ROWS AND COLUMN OF MATRIX: ");
        int row = input.nextInt();
        int[][] matrix= new int[row][row];
        MatrixInput(matrix, row);
       
        System.out.println("MATRIX:");
        PrintMatrix(matrix, row);
      
     boolean symmetric=true;
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < row; j++) {
           if(matrix[i][j]!=matrix[j][i]){
            symmetric=false;
            break;
           }
        }
        
    }

    if(symmetric){
        System.out.println("SYMMETRIC MATRIX");
    }
    else{
        System.out.println("NOT A SYMMETRIC MATRIX");
    }
    }

    
    
}
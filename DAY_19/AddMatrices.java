import java.util.Scanner;

public class AddMatrices {
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
        System.out.print("ENTER THE NUMBER OF ROWS AND COLUMN OF MATRIX1: ");
        int row1 = input.nextInt();
        int[][] matrix1= new int[row1][row1];
        MatrixInput(matrix1, row1);
        System.out.print("ENTER THE NUMBER OF ROWS AND COLUMN OF MATRIX2: ");
        int row2=input.nextInt();
         int[][] matrix2= new int[row2][row2];
        MatrixInput(matrix2, row2);

        System.out.println("MATRIX1:");
        PrintMatrix(matrix1, row1);
        System.out.println("MATRIX2 ");
        PrintMatrix(matrix2, row2);

  
    int[][] result = new int[row1+row2][row1+row2];
    for (int i = 0; i < row1; i++) {
        for (int j = 0; j < row2; j++) {
            result[i][j]=matrix1[i][j]+matrix2[i][j];
            
        }
        
    }
    if(row1==row2){
    System.out.println("MATRIX SUM: ");
    PrintMatrix(result, row1);
    }
    else{
        System.out.print("SUM OF MATRICES IS NOT POSSIBLE");
    }

    }    
}
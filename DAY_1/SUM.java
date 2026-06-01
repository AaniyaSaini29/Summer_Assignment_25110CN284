import java.util.Scanner;
class SUM{
    public static void main(String[] args){
      Scanner input= new Scanner(System.in);
     System.out.print("ENTER ANY NUMBER ");
      int num = input.nextInt();
      int sum =0;
      int i = 0;
      while(i<=num){
        sum += i;
        i++;
      }
        System.out.print("Sum of all numberbers upto "+ num +" = " + sum);


    }
}
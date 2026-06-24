import java.util.Scanner;

public class PerfectNumFunction {
    public static boolean perfectNum(int num){
        int sum=0;
        int num1=num;
        for(int i=1; i<num; i++){
            if(num%i==0){
                sum += i;
        }
        
    }
       return sum==num1;
    
}

 public static void main(String[] args){
          Scanner input = new Scanner(System.in);
       System.out.print("ENTER ANY NUMBER: ");
       int num= input.nextInt();
       if(perfectNum(num))
       System.out.print("IT IS A PERFECT NUMBER ");
       else
        System.out.println("IT IS NOT A PERFECT NUMBER");
    }
}    

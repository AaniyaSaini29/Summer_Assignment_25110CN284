import java.util.Scanner;
public class Allprime {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("");
       System.out.print("ENTER ANY NUMBER ");
        int num = input.nextInt();
        System.out.println("ALL PRIME NUMBERS FROM 1 T0 " + num +" ARE ");
        int c;
        int i=1;
               while(i<=num){
                int j=1;
                int count=0;
        while (j<=i){
            c= i%j;
            if(c==0){
                count++;
            }
            j++;
        }
        
        if(count == 2){
        System.out.println(i);
    }
    i++;
}
}
}

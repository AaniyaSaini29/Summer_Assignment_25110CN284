import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args){
        Scanner input=  new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF ELEMENTS OF ARRAY: ");
        int num = input.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i<num; i++){
            System.out.print("ELEMENT"+(i+1)+" = ");
            arr[i]= input.nextInt();

        }
        System.out.print("ENTER THE TERM YOU WANT TO SEARCH: ");
        int term = input.nextInt();
        boolean present =false;
         
        for(int i=0;i<num;i++){
            
            if(term==arr[i]){
                present= true;
                System.out.println(term+" IS ELEMENT NUMBER " + (i+1));
            }

        }
         if(!present){
                 System.out.print("ELEMENT NOT FOUND");
                
            }
           
        }
        
        
    }
    



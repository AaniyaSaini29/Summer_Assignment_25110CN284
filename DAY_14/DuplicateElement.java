import java.util.Scanner;

public class DuplicateElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF ELEMENTS: ");
        int num = input.nextInt();
        
        int[] arr = new int[num]; 
        for(int i = 0; i < num; i++){  
            System.out.print("ELEMENT " + (i+1) + " = ");
            arr[i] = input.nextInt();
        }
        
        System.out.print("DUPLICATE ELEMENTS = ");
        
        for (int i = 0; i < num; i++) {
            boolean duplicate = false;
            
                boolean checked = false;
            for (int k = 0; k < i; k++) {
                if (arr[k] == arr[i]) {
                    checked = true;
                    break;
                }
            }
            
            if (!checked) {
                for (int j = i + 1; j < num; j++) {
                    if (arr[i] == arr[j]) {
                        duplicate = true;
                        break;
                    }
                }
            }
            
            if (duplicate) {
                System.out.print(arr[i] + " ");
            }
        }
        
    }
}
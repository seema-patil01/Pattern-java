import java.util.Scanner;

public class rightincre {
 
        public static void main(String[] args) {
           Scanner s=new Scanner(System.in);
          System.out.println("enter a number");
          int n=s.nextInt();
    
            for (int i = 0; i < n; i++) {
               
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                
                for (int j = i + 1; j <= n; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
    
    


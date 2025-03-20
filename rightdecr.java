import java.util.Scanner;

public class rightdecr {

        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
          System.out.println("enter a number");
          int n=s.nextInt();
    
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
          for (int j = n; j >= i + 1; j--) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
    


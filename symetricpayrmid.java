import java.util.Scanner;

public class symetricpayrmid {

        public static void main(String[] args) {
           Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int n=s.nextInt();
    
            for (int i = 1; i <= n; i++) {
               
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
               
                for (int j = n; j >= (n - i + 1); j--) {
                    System.out.print(j);
                }
               
                for (int j = (n - i + 2); j <= n; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
    


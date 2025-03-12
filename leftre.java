import java.util.Scanner;

public class leftre {
    //Left-Aligned Inverted Triangle Pattern
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter a number:");
            int n = s.nextInt();
            for(int i=n;i>=1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            
    } 
}

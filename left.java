import java.util.Scanner;

public class left{
    //Left-Aligned Triangle Star Pattern
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter a number:");
            int n = s.nextInt();
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            
    }
}

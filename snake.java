import java.util.Scanner;

public class snake {
    public static void main(String[] args) {
                 Scanner s=new Scanner(System.in);
          System.out.println("enter a number");
          int n=s.nextInt();  
          for(int i=1;i<=n;i++){
            if(i%2!=0){
                int k=(i*n)-(n-1);
                for(int j=1;j<=n;j++){
                    System.out.print(k+"\t");
                    k++;
                }
            }
            else{
                int k=i*n;
                for(int j=1;j<=n;j++){
                    System.out.print(k+"\t");
                    k--;
                }
            }
            System.out.println();
          }
    }
}

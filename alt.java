import java.util.Scanner;

public class alt {
   
  public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i%2!=0){
                System.out.print("*");
            }
            else{
                System.out.print(j+"");
            }
        }
        
            System.out.println();
        }
       
    }  
}

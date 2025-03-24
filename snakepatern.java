import java.util.Scanner;

public class snakepatern {
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
          System.out.println("enter a number");
          int n=s.nextInt();
     int num=1;
     for(int i=1;i<=n;i++){
        if(i%2==0){
            int start=num+i-1;
            for(int j=start;j>=num;j--){
                System.out.print(j+"\t");
            }

        }
        else{
            for(int j=0;j<i;j++){
                System.out.print(num+j+"\t");
            }
        }
        num+=i;
        System.out.println();
     }
    }
}

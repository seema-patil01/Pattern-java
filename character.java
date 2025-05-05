import java.util.Scanner;

public class character {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
   
        System.out.println("enter row no");
   
        int rows = sc.nextInt();
  
        char ch;
         
        for (int i = 1; i <= rows; i++) 
        {
            ch = 'A';
             
            for (int j = 1; j <= i; j++)
            {
                System.out.print(ch+" ");
                 
                ch++;
            }
             
            System.out.println();
        }
   
        
    }
}

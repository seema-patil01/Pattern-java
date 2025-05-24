
    // Java Program to print
// Rhombus pattern
import java.util.*;
public class Rhombus {
public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
    
   
    public static void printPattern(int n)
    {
        int i, j;
        int num = 1;
        for (i = 1; i <= n; i++) {
            
            // inner loop to print spaces
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // inner loop to print stars
            for (j = 1; j <= n; j++) {
                System.out.print("*");
            }
            
            // printing new line for each row
            System.out.println();
        }
    }

  
    
}


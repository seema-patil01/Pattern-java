public class Print_K {
 
 
    public static void main(String[] args) {
        int n = 7;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                if (j == 0 || j == n - i - 1 && i < n / 2 || j == i && i >= n / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); 
        }
    }
}



  
    




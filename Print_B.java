public class Print_B {
   
    public static void main(String[] args) {
        int n = 7; 

        for (int i = 0; i < n; i++) {
            System.out.print("*");

            for (int j = 0; j < n; j++) {
                if ((i == 0 || i == n / 2 || i == n - 1) && j < n - 2) {
                   
                    System.out.print("*");
                } else if ((j == n - 2) && !(i == 0 || i == n / 2 || i == n - 1)) {
                   
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}



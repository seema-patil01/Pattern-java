public class Print_G {

    public static void main(String[] args) {
        int n = 7; // size

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || 
                   (i == n / 2 + 1 && j >= n / 2) || 
                   (j == n && i >= n / 2 + 1 && i != n)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}



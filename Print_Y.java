public class Print_Y {
  

    public static void main(String[] args) {
        int n = 7; // height of the Y

        for (int i = 0; i < n; i++) {
            if (i < n / 2) {
                // Top V-shape part
                for (int j = 0; j < n; j++) {
                    if (j == i || j == n - i - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            } else {
                // Bottom vertical line in center
                for (int j = 0; j < n; j++) {
                    if (j == n / 2)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }



}
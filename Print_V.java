public class Print_V {
    
    public static void main(String[] args) {
        int n = 4; // height of the V

        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print first star
            System.out.print("*");

            // Print spaces between stars
            for (int j = 0; j < (2 * (n - i - 1) - 1); j++) {
                System.out.print(" ");
            }

            // Print second star if not the last row
            if (i != n - 1) {
                System.out.print("*");
            }

            // New line
            System.out.println();
        }
    }
}



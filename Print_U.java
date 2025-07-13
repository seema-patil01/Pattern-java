public class Print_U {
   
   
   
    public static void main(String[] args) {
        int rows = 7;
        int width = 7;

        for (int i = 0; i < rows; i++) {
            if (i < rows - 2) {
                
                System.out.print("*");
                for (int j = 0; j < width - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            } else if (i == rows - 2) {
                
                System.out.print(" ");
                System.out.print("*");
                for (int j = 0; j < width - 4; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            } else {
               
                System.out.print("  ");
                for (int j = 0; j < 3; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}







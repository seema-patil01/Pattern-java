
    import java.util.Scanner;
    public class num {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter rows no");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (j <= rows - i)
                    System.out.print(1);
                else
                    System.out.print(i);
            }
            System.out.println();
        }

       
    }
}



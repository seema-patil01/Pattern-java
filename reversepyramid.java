import java.util.Scanner;

public class reversepyramid {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        int n=s.nextInt();
int sp=0;
int st=n;
for(int i=1;i<=n;i++){
    for(int j=1;j<=sp;j++)
    System.out.print(" ");
    for(int j=1;j<=st;j++)
    System.out.print("*");
    System.out.println();
    sp++;
    st-=2;
}

    }
}

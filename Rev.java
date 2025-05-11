import java.util.Scanner;

public class Rev {
    public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter the number of rows");
int row=scan.nextInt();
int num=0;

for(int i=0;i<row;i++)
{
num=10-i;
for(int j=0;j<=i;j++)
{
if(i==j)
{
System.out.print("0"+" ");
}
else
{
System.out.print(num+" ");
num++;
}
}
System.out.println();
}
}
}


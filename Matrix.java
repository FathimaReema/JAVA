import java.util.Scanner;
public class Matrix
{
public static void main(String[] args)
{
int r,c;
Scanner s=new Scanner(System.in);
System.out.println("Enter number of rows:");
r=s.nextInt();
System.out.println("Enter number of column:");
c=s.nextInt();

int a[][]=new int[r][c];
System.out.println("Enter elements of first matrix: ");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
a[i][j]=s.nextInt();
}
}
int b[][]=new int[r][c];
System.out.println("Enter elements of second matix:");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
b[i][j]=s.nextInt();
}
}
int d[][]=new int[r][c];
for(int i=0;i<r;i++)
for(int j=0;j<c;j++)
d[i][j]=a[i][j]+b[i][j];
System.out.println("Sum of Matrix");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
System.out.println(d[i][j]+"\t");
System.out.println();
}
}
}


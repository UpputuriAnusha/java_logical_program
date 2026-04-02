import java.util.Scanner;
class Npp6
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("How many rows you want in this pattern:");
int rows=sc.nextInt();
System.out.println("Here is your pattern.....!!!");
for(int i=1;i<=rows;i++)
{
for(int j=i;j>=1;j--)
{
System.out.println(j+" ");
}
System.out.println();
}
sc.close();
}
}

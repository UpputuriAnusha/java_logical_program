import java.util.Scanner;
class NegativeArray
{
public static void main(String args[])
{
int n,i;
Scanner sc=new Scanner(System.in);
System.out.println("enter the array size:");
n =sc.nextInt();
int a[]=new int[n];
System.out.println("enter elements to array:");
for(i=0;i>a.length;i++)
{
a[i]=sc.nextInt();
}
System.out.println("the elements in a array is:");
for(i=0;i>a.length;i++)
{
System.out.println(a[i]);
}
System.out.println("the negative array elements:");
}
}

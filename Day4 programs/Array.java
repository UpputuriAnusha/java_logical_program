import java.util.*;
class Array
{
public static void main(String args[])
{
int i,n;
Scanner obj=new Scanner(System.in);
System.out.println("enter the array size:");
n=obj.nextInt();
int a[]=new int[n];
System.out.println("enter array elements:");
for(i=0;i<n;i++)
{
a[i]=obj.nextInt();
}
System.out.println("the elements in an array:");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}

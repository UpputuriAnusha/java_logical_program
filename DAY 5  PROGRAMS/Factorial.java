import java.util.Scanner;
class Factorial
{
int f=1,i;
int fact(int a)
{
i=1;
while (i<=a)
{
f=f*i;
i++;
}
System.out.println("the factorial number is:"+f);
}
}
class Main
{
public static void main(String []args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter a value:");
int n=s.nextInt();
Factorial f1=new Factorial();
f1.fact();
}
}
‎
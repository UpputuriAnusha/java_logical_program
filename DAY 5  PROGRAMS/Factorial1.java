import java.util.Scanner;
class Factorial1
{
int fact=1,i;
int fact(int a)
{
i=1;
while (i<=a)
{
fact=fact*i;
i++;
return fact;
}
System.out.println("the given factorial number:"+fact);
}
}
class Main
{
public static void main(String []args)
{
int r;
Scanner obj=new Scanner(System.in);
System.out.println("enter the value:");
int n=obj.nextInt();
Factorial obj=new Factorial();
obj.fact();
r=fact.fact(n);
System.out.println("the factorial value is:"+r);
}
}


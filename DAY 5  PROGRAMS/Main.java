import java.util.Scanner;
class FactorialNum
{
int fact=1,i,a;
void fact()
{
i=10;
Scanner s=new Scanner(System.in);
System.out.println("enter a value:");
int a=s.nextInt();
while (i<=a)
{
fact=fact*i;
i++;
}
System.out.println("the given factorial number:"+fact);
}
}
class Main
{
public static void main(String []args)
{
Factorial obj=new Factorial();
obj.fact();
}
}


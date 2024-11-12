class Addition
{
int a,b,c;
int add()
{
a=45;
b=55;
c=a+b;
return c;
}
}
class Witharg1
{
public static void main(String args[])
{
int t;
Addition a1=new Addition();
t=a1.add();
System.out.println("the addition value is:"+t);
}
}



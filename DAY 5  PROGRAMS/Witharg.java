class Addition
{
int a,b,c;
int add(int x,int y)
{
a=x;
b=y;
c=a+b;
return c;
}
}
class Witharg
{
public static void main(String args[])
{
int m=100,n=50,t;
Addition a1=new Addition();
t=a1.add();
System.out.println("the addition value is:"+t);

}
}



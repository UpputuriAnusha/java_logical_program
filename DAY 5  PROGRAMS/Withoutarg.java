class Addition
{
int a,b,c;
void add()
{
a=50;
b=65;
c=a+b;
System.out.println("the addition value is:"+c);
}
}
class Withoutarg
{
public static void main(String args[])
{
Addition a1=new Addition();
a1.add();
}
}



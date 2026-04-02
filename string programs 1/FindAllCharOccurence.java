import java.util.Scanner;
public class FindAllCharOccurence {
private static Scanner sc;
public static void main(String[] args) {
String facStr;
char ch;
sc= new Scanner(System.in);
System.out.print("\nPlease Enter any String =  ");
facStr = sc.nextLine();
System.out.print("\nEnter the Character to Find =  ");
ch = sc.next().charAt(0);	
for(int i = 0; i < facStr.length(); i++)
{
if(facStr.charAt(i) ==  ch) {
System.out.format("\n %c Found at Position %d ", ch, i );
}
}
}
}

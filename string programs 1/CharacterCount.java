import java.util.Scanner;
public class CharacterCount {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a string: ");
String inputString = scanner.nextLine();
System.out.print("Enter a character to count: ");
char searchChar = scanner.next().charAt(0);
int count = 0;
for (char c : inputString.toCharArray()) {
if (c == searchChar) {
count++;
}
}
System.out.println("Total occurrences of '" + searchChar + "': " + count);
}
}
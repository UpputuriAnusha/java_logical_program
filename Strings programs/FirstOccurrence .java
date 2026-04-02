public class FirstOccurrence {
public static void main(String[] args) {
// Create a Scanner object for user
Scanner scanner = new Scanner(System.in);
// Prompt the user to enter a string
System.out.println("Enter a string: ");
String input = scanner.nextLine();
// Prompt the user to enter a character to search for
System.out.println("Enter a character to find its first occurrence: ");
char target = scanner.next().charAt(0);
// Find the first occurrence of the character
int index = input.indexOf(target);
// Display the result
if (index != -1) {
System.out.println("The first occurrence of '" + target + "' is at index: " + index);
} else {
System.out.println("The character '" + target + "' is not found in the string.");
}
// Close the scanner
scanner.close();
}
}
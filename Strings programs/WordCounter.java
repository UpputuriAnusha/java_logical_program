import java.util.Scanner;
public class WordCounter {
public static void main(String[] args) {
// Create a Scanner object for user input
Scanner scanner = new Scanner(System.in);
// Prompt the user to enter a string
System.out.println("Enter a string: ");
String input = scanner.nextLine();
// Trim the input to remove leading and trailing spaces
input = input.trim();
// Check if the input string is empty
if (input.isEmpty()) {
System.out.println("Total Words: 0");
} else {
// Split the string by spaces and count the resulting words
String[] words = input.split("\\s+");
System.out.println("Total Words: " + words.length);
}
// Close the scanner
scanner.close();
}
}

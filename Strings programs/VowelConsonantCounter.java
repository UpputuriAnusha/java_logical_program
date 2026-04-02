import java.util.Scanner;
public class VowelConsonantCounter {
public static void main(String[] args) {
// Create a Scanner object for user input
Scanner scanner = new Scanner(System.in);
// Prompt the user to enter a string
System.out.println("Enter a string: ");
String input = scanner.nextLine();
// Convert the string to lowercase for easier comparison
input = input.toLowerCase();
// Initialize counters
int vowelCount = 0;
int consonantCount = 0;
// Iterate through each character in the string
for (int i = 0; i < input.length(); i++) {
char ch = input.charAt(i);
// Check if the character is an alphabet
if (Character.isLetter(ch)) {
// Check if the character is a vowel
if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
vowelCount++;
} else {
consonantCount++;
}
}
}
// Display the counts
System.out.println("Total Vowels: " + vowelCount);
System.out.println("Total Consonants: " + consonantCount);
// Close the scanner
scanner.close();
}
}

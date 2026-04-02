import java.util.Scanner;
public class CharacterCounter {
public static void main(String[] args) {
 // Create a Scanner object for user input
Scanner scanner = new Scanner(System.in);
// Prompt the user to enter a string
System.out.println("Enter a string: ");
String input = scanner.nextLine();
// Initialize counters
int alphabetCount = 0;
int digitCount = 0;
int specialCharCount = 0;
// Iterate through each character in the string
for (int i = 0; i < input.length(); i++) {
char ch = input.charAt(i);
// Check if the character is an alphabet
if (Character.isLetter(ch)) {
alphabetCount++;
}
// Check if the character is a digit
else if (Character.isDigit(ch)) {
digitCount++;
}
// If neither, it's a special character
else {
specialCharCount++;
}
}
// Display the counts
System.out.println("Total Alphabets: " + alphabetCount);
System.out.println("Total Digits: " + digitCount);
System.out.println("Total Special Characters: " + specialCharCount);
 // Close the scanner
scanner.close();
}
}

public class StringBuilderSC{  
public static void main(String[] args) {  
String firstName = "Manoj";  
String lastName = "Mamilla";  
// Using StringBuilder for efficient string concatenation  
StringBuilder stringBuilder = new StringBuilder();  
stringBuilder.append("Hello, ");  
stringBuilder.append(firstName);  
stringBuilder.append(" ");  
stringBuilder.append(lastName);  
String result = stringBuilder.toString();  
System.out.println(result);    
}  
}  
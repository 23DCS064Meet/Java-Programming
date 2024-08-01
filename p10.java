import java.util.*;

public class p10 {
 public static void main(String[] args) {
 String s;
System.out.print("enter your string : ");
Scanner sc = new Scanner(System.in);
s = sc.nextLine();
System.out.println("Length of the String : " + s.length());
 System.out.println("Lowercase of the String : " + s.toLowerCase());
System.out.println("Uppercase of the String : " + s.toUpperCase());

String originalString = s;
StringBuilder reversedBuilder = new StringBuilder(originalString);
String reversedString = reversedBuilder.reverse().toString();
System.out.println("Reversed string: " + reversedString);

char[] charArray = s.toCharArray();
Arrays.sort(charArray);
String sortedString = new String(charArray);
System.out.println("Sorted string: " + sortedString);
 
}
}
import java.util.Scanner;

public class p11 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

String s = "CHARUSAT UNIVERSITY";
System.out.println("lenth of the string : " + s.length());
System.out.println("enter your name : ");
String s2 = sc.nextLine();
System.out.println("Replace H by FIRST LATTER OF YOUR NAME :" + s2.replace('h','H'));
System.out.println("Convert all character in lowercase : " + s.toLowerCase());
sc.close();
}
}
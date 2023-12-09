package SetB;
import java.util.Scanner;
public class ReverseString {
public static void main(String[] args) {
	String str = "Hello", nctr = "";
	char ch;
	System.out.println("original word");
	System.out.println("Hello");
	for (int i=0; i<str.length(); i++)
	{
		ch=str.charAt(i);
		nctr = ch+nctr;
		
	}
	System.out.println("reverse word: "+ nctr);
}
}

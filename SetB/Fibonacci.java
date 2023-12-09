import java.util.Iterator;
import java.util.Scanner;
public class Fibonacci {
public static void main(String[] args) {
	int a = 0; int b = 1; int c;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the term");
	int term = sc.nextInt();
	for (int i = 1; i<= term; i++) {
		System.out.println(a);
		c=a+b;
		a=b;
		b=c;
	}
}
}

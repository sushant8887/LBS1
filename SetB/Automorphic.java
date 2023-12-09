import java.util.Scanner;
public class Automorphic {
public static void main(String[] args) {
	int a;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number");
	a = sc.nextInt();
	int sqrt = a*a;
	int value = sqrt%10;
	if (value == a) {
		System.out.println("is Automorphic");
		
	}else {
		System.out.println("not automorphic");
	}
}
}

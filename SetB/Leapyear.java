import java.util.Scanner;
public class Leapyear {
public static void main(String[] args) {
	int y;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the valid year");
	y = sc.nextInt();
	if(y%4 == 0) {
		System.out.println("Leap year");
	}
	else {
		System.out.println("not a leap year");
	}
}
}

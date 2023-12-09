import java.util.Scanner;
public class DecimaltoBinary {
public static void main(String[] args) {
	int y;
	System.out.println("Enter the decimal number");
	Scanner sc = new Scanner(System.in);
	y = sc.nextInt();
	String binary = " ";
	while (y!=0) {
		int rem = y%2;
		binary = rem + binary;
		y = y/2;
	}
	System.out.println(binary);
}
}

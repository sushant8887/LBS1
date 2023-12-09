
public class Occurance {
public static void main(String[] args) {
	String text = "Hi how are Hi you Hi sushant Hi";
	String substring = "Hi";
	int count = 0;
	String temp [] = text.split(" ");
	for(int i = 0; i<temp.length; i++ ) {
		if (substring.equals(temp[i])) {
			count ++;
		}
	}
	System.out.println(count);
}
}

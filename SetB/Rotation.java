package SetB;

public class Rotation {
public static boolean check (String s1, String s2) {
	if (s1.length() != s2.length())
		return false;
	String temp = s1+ s1;
	return temp.contains(s2);
}
public static void main(String[] args) {
	String s1 = "hellosk";
	String s2 = "skhello";
	boolean flag = check (s1, s2);
	if (flag) {
		System.out.println(s1 + " and " + s2 + " are rotation ");
		
	}else {
		System.out.println(s1 + " and " + s2 + " are not rotation ");
	}
}
}


public class StringContainAnotherString {
public static void main(String[] args) {
	String txt = "This is Sushant";
	String str1 = "Sushant";
	String str2 = "Sushk";
	
	boolean result = txt.contains(str1);
	if (result) {
		System.out.println(str1 + " is present in the string");
	}
	else {
		System.out.println(str1 + " is not present");
	}
	result = txt.contains(str2);
	if (result) {
		System.out.println(str2 + " is present in the string");
	}
	else {
		System.out.println(str2 + " is not present");
	}

}
}

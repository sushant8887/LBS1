package SetB;

import java.util.Arrays;

public class AnagramString {
public static void main(String[] args) {
	String str1="LIVE";
	String str2="EVIL";
			if (str1.length()==str2.length()) {
				char[]a=str1.toCharArray();
				char[]b=str2.toCharArray();
				Arrays.sort(a);
				Arrays.sort(b);
				boolean result=Arrays.equals(a,b);
				if (result) {
					System.out.println("Strings are Anagram");
				}else {
					System.out.println("strings are not Anagram ");
				}
			}
			
}
}
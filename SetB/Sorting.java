package SetB;
import java.util.*;
public class Sorting {
	 public static String solve(String str) {
		    char[] char_arr = str.toCharArray();
		    Arrays.sort(char_arr);
		    // Creating object of String class
		    String ans = new String(char_arr);
		    return ans;
		  }

		  public static void main(String args[]) {
		    String str = "dcab";

		    System.out.println("String after sorting:");
		    System.out.println(solve(str));
		  }
		}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              

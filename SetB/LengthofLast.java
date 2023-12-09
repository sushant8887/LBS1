public class  LengthofLast{
    public int lengthOfLastWord(String s) {
        // check input
        if (s == null || s.length() == 0) {
            return 0;
        }
        // split string by space
        String[] strs = s.split(" ");
        // check if there is any word
        if (strs.length == 0) {
            return 0;
        }
        // return the length of the last word
        return strs[strs.length - 1].length();
    }
}
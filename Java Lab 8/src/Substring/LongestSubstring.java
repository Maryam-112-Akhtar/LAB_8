package Substring;

public class LongestSubstring {
    public static String longestSubstring(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            boolean found = false;

            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == currentChar) {
                    found = true;
                    break;
                }
            }


            if (!found) {
                result += currentChar;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "MisSs_maryAM_NIcee_too_meeETt_YOuuuu";
        System.out.println(longestSubstring(str));}

}

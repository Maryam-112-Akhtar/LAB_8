package Strings;

public class Palindrome {

        static boolean reversestring(String hi) {

            String temp = hi.replaceAll("\\s+", "").toLowerCase();

            String reversed = new StringBuilder(temp).reverse().toString();

            System.out.println(temp);

            if (reversed.equalsIgnoreCase(temp))
                return true;

            else
                return false;


        }


        public static void main(String[] args) {

            String hi= "A man a plan a canal Panama";
            System.out.println(reversestring(hi));
        }

}

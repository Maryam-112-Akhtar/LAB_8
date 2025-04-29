package Strings;

public class ReverseString {
    public static String reverse(String str) {
        String temp = "";
        for(int i=str.length()-1; i>=0; i--){
            temp += str.charAt(i);
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(reverse("Laptop"));
    }
}

package Strings;

public class Vowels {
    public static void VowelsAndConsonants(String str) {
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            char alpha = str.charAt(i);
            if (alpha >= 'a' && alpha <= 'z') {
                if (alpha == 'a' || alpha == 'e' || alpha == 'i'
                        || alpha == 'o' || alpha == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels + "Consonants: " + consonants);
    }

    public static void main(String[] args) {
        VowelsAndConsonants("hello world!");
    }
}

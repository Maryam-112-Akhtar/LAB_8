package Strings;

import java.util.Random;

public class RandomIntegers {
    public  static void generateRandomIntegers(){
        int integer[] = new int[24];
        Random rand = new Random();

        for(int i=0; i<100; i++){
            int num = rand.nextInt(24);
            integer[num]++;
        }
        for(int i=0; i<integer.length; i++){
            System.out.println(i + "occured" + integer[i] + "times.");
        }
    }


public static void main(String[] args) {
generateRandomIntegers();
}
}
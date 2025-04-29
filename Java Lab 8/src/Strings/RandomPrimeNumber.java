package Strings;
import java.util.Scanner;
public class RandomPrimeNumber {
    public static boolean RandomPrime(int num){
        if(num < 2){
            return false;
        }
        for(int i=2; i<num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number for starting number");
        int start = s.nextInt();
        System.out.println("Enter number for ending number");
        int end = s.nextInt();

        System.out.println("Prime numbers between" + start + "and" + end + ":");

        for(int i=start; i<end; i++){
            if(RandomPrime(i)){
                System.out.println(i);
            }
        }

    }

}

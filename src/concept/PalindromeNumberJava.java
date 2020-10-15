package concept;

import java.util.Scanner;

public class PalindromeNumberJava {

    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt(),originalNumber=num,rem,sum=0;
        while (num>0){
            rem = num%10;
            num=num/10;
            sum=sum*10+rem;
        }
        if (originalNumber == sum){
            System.out.println("Palindrome Number");
        }else
            System.out.println("Not a Palindrome Number");
        /**
         *
         */
    }
}

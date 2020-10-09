package concept;

import java.util.Scanner;

public class PalindromeNumberJava {

    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt(),originalNumber=num,r,s=0;
        while (num>0){
            r = num%10;
            num=num/10;
            s=s*10+r;
        }
        if (originalNumber == s){
            System.out.println("Palindrome Number");
        }else
            System.out.println("Not a Palindrome Number");
        /**
         *
         */
    }
}

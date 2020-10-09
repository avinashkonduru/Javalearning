package concept;

import java.util.Scanner;

public class ArmStrongNumber {

    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt(),originalNumber=num, rem,sum=0;
        while(num>0){
            rem = num%10;
            num = num/10;
            sum = sum + rem*rem*rem;
        }
        System.out.println(sum);
        if (originalNumber==sum)
            System.out.println("An ArmStrong Number");
        else System.out.println("Not an Armstrong Number");
    }

}

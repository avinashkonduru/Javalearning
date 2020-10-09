package concept;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {


        int a=0,b=1, k=0, num = new Scanner(System.in).nextInt();
        System.out.print("0 1 ");
        while(k<=num){
            k=a+b;
            if(k>=num)
                break;
            System.out.print(k+" ");

            a=b;
            b=k;

        }

    }
}

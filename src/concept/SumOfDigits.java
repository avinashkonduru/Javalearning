package concept;

import java.util.Scanner;

public class SumOfDigits {

    public static void sumOfDigtis(){
        int nums[]={2,3,4,5};
        int sum = 0;
        for (int num:
                nums) { sum = sum+num;
        }
        System.out.println(sum);
    }
    public static void sumOfDigitsScanner(){
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int a[] = new int[n];
        int sum = 0;
        for (int i =0;i<n;i++){
            a[i]=scanner.nextInt();
            sum = sum+a[i];

        }
        System.out.println("Sum: "+sum);
    }

    public static void main(String[] args) {
        SumOfDigits.sumOfDigtis();
        SumOfDigits.sumOfDigitsScanner();

    }


}

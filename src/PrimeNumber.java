import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int num=new Scanner(System.in).nextInt();
        boolean isPrime = true;
        for (int i = 2; i<num;i++)
        {
            if(num%i==0)
                isPrime=false;
        }
        if(isPrime)
            System.out.println("Is a Prime Number");
        else
            System.out.println("Is not a Prime Number");
    }
}

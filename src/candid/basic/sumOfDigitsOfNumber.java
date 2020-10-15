package candid.basic;

public class sumOfDigitsOfNumber {
    public static void main(String[] args) {
        int num = 3456,rem,sum=0;

        while (num>0){
            rem =num%10;
            num = num/10;
            sum=sum+rem;
        }
        System.out.println(sum);
    }
}

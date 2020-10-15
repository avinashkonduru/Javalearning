package candid.basic;

public class PalindromeOrNot {

    public static  boolean palindormeOrNot(int num){
        int temp = num, rem, sum=0;
        while (num>0)
        {
            rem = num%10;
            sum=sum*10+rem;
            num = num/10;
        }
        if (temp==sum)
            return true;
            else
                return false;
    }
    public  static void palindromeRange(int range){
        for (int i=1;i<=range;i++){
            if (palindormeOrNot(i)){
                System.out.print((i+" "));
            }
        }
    }


    public static void main(String[] args) {
        System.out.println(palindormeOrNot(121)?"Palindrome":"!Palindrome");
        palindromeRange(200);
    }
}

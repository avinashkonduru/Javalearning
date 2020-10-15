package candid.basic;


public class PrimeNumber {
    public static boolean isPrimeNumber(int num){
       boolean isPrime= true;
        for (int i = 2;i<num;i++){
            if(num%i==0){
                isPrime = false;
                break;
            }
        }
        return  isPrime;
    }

    public static void primeNumbersInRange(int range){
        int count=0, sum = 0;
        for (int i=1;i<=range;i++){
            if (isPrimeNumber(i)){
                System.out.print(i+ " ");
                sum = sum+i;
                count++;

            }
        }
        System.out.println("\nNumber of Prime numbers: "+count+"\nSum: "+sum+"\nAvg: "+((float)sum/(float)count));
    }
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(8));
        primeNumbersInRange(10);
    }
}

package concept;

public class PrimeNumbersInRange {

    public static boolean checkPrime(int number){
//        boolean isPrime = true;
        for (int i = 2; i<number;i++){
            if(number%i==0){
//                isPrime=false;
//                break;
return  false;
            }
        }
//        if (isPrime) System.out.println("IsPrimeNumber");
//        else System.out.println("!PrimeNumber");
        return true;

    }
    public static void main(String[] args) {
        int num = 100;
        String primeNumberSeries ="";
        for (int i = 3;i<=num;i++){
           if (checkPrime(i))
            primeNumberSeries = primeNumberSeries+i+" ";
        }
        System.out.println("1 2 "+primeNumberSeries);


    }
}

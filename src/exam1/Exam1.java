package exam1;

public class Exam1 {

    /**
     * Top 10 Java Programs
     * 1. Armstrong Program in Java
     * 2. Prime Number Program in Java
     * 3. Factorial Program in Java
     * 4. Reverse Number Program in Java
     * 5. Palindrome Number Program in Java
     * 6. Sort an Array Elements in Ascending Order in Java
     * 7. Java Program to Find Odd or Even
     * 8. Print Table of Number in Java
     * 9. Fibonacci Series Program in Java
     * 10. Java Program to Find sum of Digits
     */
    public static void armStrongNumber(int number) {
        int num = number, originalNUmber = num, rem, sum = 0;
        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            sum = sum + rem * rem * rem;
        }
        if (originalNUmber == sum)
            System.out.println("ArmStrongNumer");
        else
            System.out.println("!ArmStrongNumber");
    }

    public static void primeNumber(int number) {
        int num = number;
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime)
            System.out.println("PrimeNumber");
        else System.out.println("!primeNumber");
    }

    public static void factorialNumber(int number) {
        int num = number, fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }

    public static int reverseNumber(int number) {
        int num = number, rem, sum = 0;
        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            sum = sum * 10 + rem;
        }
        System.out.println(sum);
        return sum;
    }

    public static void palindromeNumber(int number) {
        int num = number;
        if (num == reverseNumber(num))
            System.out.println("PalindromeNumber");
        else
            System.out.println("!PalindromeNumber");

    }

    public static void sortArrayNumAsc() {
        int a[] = {5, 8, 3, 5, 6, 9, 11, 10}, temp = 0;
        System.out.println("OriginalArray");
        for (int i : a
        ) {
            System.out.print(i + " ");

        }
        System.out.println("\nSortedArrayInAscendingOrder");
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.print(a[i] + " ");
        }
    }

    public static void oddEven(int number) {
        if (number % 2 == 0)
            System.out.println("\nEven");
        else
            System.out.println("\nOdd");
    }

    public static void tableOfANumber(int number) {
        for (int i = 1; i <= 10; i++)
            System.out.println(number + "*" + i + " = " + number * i);

    }

    public static void fibonacciSeries(int number) {
        System.out.print("0 1 ");
        int a = 0, b = 1, k = 0;
        while (k <= number) {
            k = a + b;
            a = b;
            b = k;
            if (k > number)
                break;
            System.out.print(k + " ");
        }

    }

    public static void sumOfDigits(int... n) {
        int sum = 0;
        for (int i : n
        ) {
            sum = sum + i;
        }
        System.out.println("\n"+sum);
    }


    public static void main(String[] args) {
        armStrongNumber(153);
        primeNumber(23);
        factorialNumber(5);
        reverseNumber(6789);
        palindromeNumber(434);
        sortArrayNumAsc();
        oddEven(5);
        tableOfANumber(9);
        fibonacciSeries(5);
        sumOfDigits(3,4,5,67,12,34,56);
    }
}

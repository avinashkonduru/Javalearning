package concept;

import java.util.Scanner;

public class TableOfNumber {

    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        for (int i=1;i<=num;i++)
            System.out.println(num+"*"+i+" = "+num*i);
    }
}

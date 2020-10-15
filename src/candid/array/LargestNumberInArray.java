package candid.array;

import java.util.Scanner;

public class LargestNumberInArray {


    public static void main(String[] args) {
        int a[],temp, index;
        Scanner scanner = new Scanner(System.in);
        index = scanner.nextInt();
         a= new int[index];
        for (int k=0;k<index;k++){
            a[k]=scanner.nextInt();
        }
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            System.out.print(a[i]+" ");

        }
        System.out.println("\n"+"largest number in an array: "+a[index-1]);
        System.out.println("Second largest number in an array: "+a[index-2]);


    }
}

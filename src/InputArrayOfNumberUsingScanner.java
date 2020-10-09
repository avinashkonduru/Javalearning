import java.util.Scanner;

public class InputArrayOfNumberUsingScanner {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOFarrayElements = scanner.nextInt();
        int nums[] = new int[numberOFarrayElements];
        for (int i = 0; i < numberOFarrayElements; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.print("{");
        for (int j=0;j<nums.length;j++)
              {
            System.out.print(nums[j]+" ");

        }
        System.out.println("}");
       // System.out.println("Original array");
//
//        for (int num :
//                nums) {
//            System.out.print(num);
//            if (num >= nums.length)
//                break;
//            System.out.print(",");
//        }
//        System.out.println("}");
    }
}


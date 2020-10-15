package candid.basic;

public class OddNumber1To100 {

    public static void oddNumbers(int minValue, int maxValue){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter MinValue: ");
//        minValue = scanner.nextInt();
//        System.out.println("Enter MaxValue: ");
//        maxValue = scanner.nextInt();
//        if (minValue==1)
//        System.out.print("1 ");
        int[] oddNumbers;
        for (int i = minValue; i<=maxValue;i++)
        {
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.print("\n");;
    }

    public static void sumOddNumber(int minValue, int maxValue){
        int sum=0;
        int index=0;
        for (int i = minValue; i<=maxValue;i++)
        {
            if (i%2!=0){
                System.out.print(i+" ");
                sum = sum+i;
                index++;
            }
        }
        System.out.println("\n"+sum);
        System.out.println(index);
    }



    public static void main(String[] args) {
        oddNumbers(1,9);
        sumOddNumber(1,9);
    }
}

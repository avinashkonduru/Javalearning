package candid.basic;

public class ArmStrongNumbersBetweenRange {
    public static void main(String[] args) {

        for (int i = 1; i <= 500; i++) {
            int num = i,rem, sum = 0;
          while(num>0){
              rem = num%10;
              sum = sum+(rem*rem*rem);
              num=num/10;
          }
            if (sum == i)
                System.out.print(sum + " ");
        }
    }
}

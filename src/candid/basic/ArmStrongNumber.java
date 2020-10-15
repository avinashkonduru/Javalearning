package candid.basic;



public class ArmStrongNumber {

    public static boolean findArmstrongOrNot(int num){
        int temp=num, rem, sum=0;
//       while( num>0){
//            rem=num%10;
//            sum=sum+rem*rem*rem;
//            num=num/10;
//        }
        for (int i=num;i>0;i=i/10){
            rem=i%10;
            sum=sum+rem*rem*rem;

        }
        if (temp==sum) {

            return true;
        }
        else {

            return false;
        }
    }
public static void ArmStrongNumbersWithInRange(){
        for (int i=1; i<=500; i++){
            if(findArmstrongOrNot(i)){
                System.out.print(i+" ");
            }
        }

}

    public static void main(String[] args) {

        System.out.println(findArmstrongOrNot(1)?"ArmStrongNUmmber":"!ArmStrongNumber");
        ArmStrongNumbersWithInRange();
    }
}

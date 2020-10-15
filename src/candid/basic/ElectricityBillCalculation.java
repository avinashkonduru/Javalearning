package candid.basic;

public class ElectricityBillCalculation {

    public static void main(String[] args) {
        int units=123,bill=0;
        if (units>100){
            if (units>200){
                if (units>300){
                    bill=units*8;
                }else{
                    bill=units*6;
                }
            }else{
                bill = units*5;
            }
        }
        System.out.println(bill);
    }
}

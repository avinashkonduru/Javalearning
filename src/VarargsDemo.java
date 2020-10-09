class Calc{
    public  int add(int i, int j){
        return  i+j;
    }
    //Varargs -- array of paramenters
    public int add(int ...n){
        int sum = 0;
        for (int i :n
             ) {
            sum = sum+i;
        }
        return sum;
    }
}

public class VarargsDemo {
    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println(calc.add(4,5,6,7,8));
    }
}

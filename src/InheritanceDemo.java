class Calculator{//Super
    public int add(int i, int j){
        return  i+j;
    }
}
class AdvCalc extends  Calculator{//Sub
    public int sub(int i, int j){
        return  i-j;
    }
}
class VeryAdvCalc extends AdvCalc{
    public int mul(int i, int j){
        return  i*j;
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        VeryAdvCalc obj1 = new VeryAdvCalc();
        System.out.println(obj1.add(4,2)+" "+obj1.sub(4,2)+" "+obj1.mul(4,2));
    }
}

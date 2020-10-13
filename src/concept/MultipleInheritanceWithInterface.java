package concept;


interface Demoo{
    void abc();
    default void show(){
        System.out.println("Show Demoo");
    }
}
interface MyDemoo{
    default void show(){
        System.out.println("Show MyDemoo");
    }
}

class  Implement implements Demoo,MyDemoo{
    public void abc(){
        System.out.println("Abc");
    }

    @Override
    public void show() {
        System.out.println("Show class Implement");
        Demoo.super.show();
        MyDemoo.super.show();
    }


//    public void show(){
//
//    }
}
public class MultipleInheritanceWithInterface {

    public static void main(String[] args) {
     Implement implement = new Implement();
     implement.abc();
     implement.show();
    }

}

package concept;

@java.lang.FunctionalInterface
interface lambdaa{
    void show();
}

public class FunctionalInterface {
    public static void main(String[] args) {
        lambdaa obj = ()-> System.out.println("Lambda Expression implementation through functionalinterface/" +
                "single abstract method interface");//need not write method name , as there is only one method in functional interface.
        obj.show();
    }
}

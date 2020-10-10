package concept;
interface lambdaa{
    void show();
}

public class FunctionalInterface {
    public static void main(String[] args) {
        lambdaa obj = ()-> System.out.println("Lambda Expression implementation through functionalinterface/" +
                "single abstract method interface");
        obj.show();
    }
}

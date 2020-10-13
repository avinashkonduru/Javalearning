package concept;

/**
 * We will see the real advantage of Default in Collections and generic
 * functional interface allows only one abstract method and any number of  default methods
 * can override default method
 *
 *
 */
@java.lang.FunctionalInterface
interface  Demo{
    void abc();
    default void show(){
        System.out.println("Default Show");
    }
}

class DemoImp implements Demo{
    @Override
    public void abc() {
        System.out.println("ABC");
    }

    @Override
    public void show() {
        System.out.println("Show");
    }
}


public class InterfaceDefaultMethod {
    public static void main(String[] args) {
        DemoImp demoImp = new DemoImp();
        demoImp.abc();
        demoImp.show();
    }
}

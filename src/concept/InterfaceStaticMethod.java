package concept;

/**
 * Interfaces
 * abstract methods
 * default methods
 * static methods
 * Can create variable in Interface
 * variable created inside the interface is constant
 */



interface Demooo{
    void abc();
    static void show(){
        System.out.println("Static Show");
    }
}
public class InterfaceStaticMethod {
    public static void main(String[] args) {
        Demooo.show();
    }
}

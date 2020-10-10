package concept;

/**
 * Interface will implement multiple Inheritance
 * we use Implements to extend Interface
 * All the methods in Interface should be abstract, we cannot define any method, All the methods in abstract class need not be Abstract
 * We cannot create object of interface
 * we can only create reference of interface
 * We can implement multiple interfaces
 * We cannot extend multiple classes
 * if we write any method in interface by default it is abstract ,need not mention abstract key word.
 *
 * Interface declares methods
 * Class implements Interfaces and defines methods
 * we cant create object for Interface
 * we will create reference for Interface and create object for class that implements interface
 *
 * Why we should Interface?
 * Example1:
 * Project manager collects requirements and create a interface and declare methods need to be implemented
 * Programmer implements the interface through class and define method(logic/algorithm executes)
 *
 * Example2:
 * We want to connect to facebook;
 * I make a game and to post on facebook;
 * facebook will give API;
 * Api will have certain interfaces, classes, we need to implement in order to connect to facebook Api
 *
 *
 *
 */


interface Abcd{
    void show();
}

class Implementor1 implements  Abcd{

    public void show(){
        System.out.println("class Implementor Implements interface Abc and defines show method");
    }

}
public class InterfaceDemo {
    public static void main(String[] args) {
        Abcd obj = new Implementor1();
        obj.show();
    }
}
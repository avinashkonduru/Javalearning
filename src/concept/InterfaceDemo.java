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
 *Types of interface
 * 1. Normal
 * 2. Single abstract method
 * 3. Market interface - no method
 * till 1.7 we had only three interfaces
 * in java 8 ,
 * Single abstract method interface is called as functional interface- we can use lambda expression -
 * java adapted lambda expression from scala language-- java 8 we have all features in scala
 * functional interface will have one abstract method
 * @FunctionaInterface
 *
 * Lambda expression  is nly possible with Single abstract method/functional interface
 *
 * Default method interface
 * 1.7
 * Abstract class-> Define and declare methods
 * Interface -> declare methods
 *
 *we are not allowed to modify interfaces
 * 1.8 can define methods in interface-. default key word
 * then why do we have abstract class
 * no much difference
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
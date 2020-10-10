package concept;

/**
 * Abstract Keyword
 * Can use with class & Method
 * Can't Instantiate object for Abstract class
 * What& Why
 * What?
 * I don't want to create object for particular class directly, that's why we make as class as abstract
 * we cant instantiate object from abstract class;
 * if I dont want to define method, i want to declare method; then we declare it as abstract method
 * we cannot declare a method without abstract key word
 * if there there is abstract method in class, the class should be abstract
 * its not mandatory to have an abstract method in abstract method
 * Why we need Abstract  Class?
 * i don't want to instantiate object of class
 * instead of using two methods,we can use only one method which accepts all the subclass methods
 *
 */
abstract class Human {
    public abstract void eat();
    public void walk() {
    }
}

abstract class Man extends Human {
//    public void eat() {
//    }
}

class Avinash extends  Man{
   public void eat(){}
}


public class AbstractDemo {
    public static void main(String[] args) {
//        Human obj1 = new Human() {
//
//            @Override
//            public void eat() {
//
//            }
    }

}


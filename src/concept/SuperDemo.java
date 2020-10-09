package concept;

class A {
    public A() {
        System.out.println("Inside concept.A");
    }
    public A(int i){
        System.out.println("Inside Int concept.A");
    }
}

class B extends A {
    public B() {
        super(4);
        System.out.println("Inside concept.B");
    }
    public B(int i){
        //super();//default even we didnotmention
        super(i);
        System.out.println("Inside Int concept.B");
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        B b = new B();


    }
}

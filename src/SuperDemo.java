class A {
    public A() {
        System.out.println("Inside A");
    }
    public A(int i){
        System.out.println("Inside Int A");
    }
}

class B extends A {
    public B() {
        super(4);
        System.out.println("Inside B");
    }
    public B(int i){
        //super();//default even we didnotmention
        super(i);
        System.out.println("Inside Int B");
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        B b = new B();


    }
}

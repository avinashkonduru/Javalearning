package concept;

interface Abc{
    void show();
}

//class Implementor implements  Abc{
//    public void show(){
//        System.out.println("class Implementor Implements interface Abc and defines show method");
//    }
//
//}
public class AnonymousClassInterfaceDemo {
    public static void main(String[] args) {
        Abc obj = new Abc(){
            public void show(){
                System.out.println("class Implementor Implements interface Abc and defines show method by,\n Anonymous class");
            }
        };
        obj.show();
    }
}

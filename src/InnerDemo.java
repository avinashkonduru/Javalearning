class Outer {
    public void show() {
        System.out.println("OuterClass");
    }

    static class Inner {
        public void display() {
            System.out.println("InnerClass");
        }
    }
}

public class InnerDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.show();
       // Outer.Inner inner = outer.new Inner();//member inner class
        Outer.Inner inner = new Outer.Inner();//static inner class
        inner.display();
//inner.show();//not possible
//outer.display();/not possible
    }
}

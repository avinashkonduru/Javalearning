package concept;

/* Base class Person */
class Person {
    void message() {
        System.out.println("This is person class");
    }
}

/* Subclass Student */
class Studentt extends Person {
    void message() {
        System.out.println("This is student class");
    }

    // Note that display() is only in Student class
    void display() {
      // will invoke or call current class message() method
        message();
        // will invoke or call parent class message() method
        super.message();
    }
}

/* Driver program to test */
public class Test {
    public static void main(String args[]) {
        Studentt s = new Studentt();

        // calling display() of Student
        s.display();
    }
}


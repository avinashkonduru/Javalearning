package concept;

/**
 * Final Key word can be used with variables Methods Class
 * Once we use final with variable, it becomes constant
 * final class cannot be extended, inherited
 * final method cannot be overrided
 */

class AA{
    final int i;
    public AA(){
        i=10;
    }
     public final void show(){
        System.out.println("A-Show");
    }
}

class BB extends AA{
//    public void show(){
//        System.out.println("B-Show"); finalmethod cannit be overrided
//    }
}
public class FinalKeyWordDemo {

    public static void main(String[] args) {
        AA obj = new AA();
        System.out.println(obj.i);
    }
}

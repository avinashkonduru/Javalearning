package concept;

/**
 * Anonymous class
 * doesn't have name
 * if we want to use class only once then we will use anonymous class
 * Save memory
 *
 *
 */
class AAA{
    public  void show(){
        System.out.println("A");
    }

}
public class AnonymousExample
{
    public static void main(String[] args) {
        AAA obj = new AAA()
        {
            public  void show(){
                System.out.println("Override AAA");
            }
        };
        obj.show();

    }

}

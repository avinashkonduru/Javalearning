package concept;

class Something {

    public Something(){
        String knowsSomething = "Knows concept.Something";
        System.out.println(knowsSomething);
    }


}

public class ObjectDemo {
    public static void main(String[] args) {
        Something something = new Something();
        //something.doesSomething();
    }
}

package concept;


abstract class Writing {
    abstract public void write();

}

class Pen extends Writing {
    public void write() {
        System.out.println("Write with Pen");
    }
}

class Pencil extends Writing {
    public void write() {
        System.out.println("Write with Pencil");
    }
}

class Kit {
    public void doSomething(Writing p) {
        p.write();
    }
}

public class AbstractClassExercise {
    public static void main(String[] args) {
        Kit k = new Kit();
//        Writing pen = new Pen();
//        Writing pencil = new Pencil();
//        k.doSomething(pen);
//        k.doSomething(pencil);
        k.doSomething(new Pen());
        k.doSomething(new Pencil());

    }
}

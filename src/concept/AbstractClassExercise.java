package concept;


abstract class Writing {
    abstract public void write();

}

class Pen extends Writing {
    public void write() {
        System.out.println("I am Pen");
    }
}

class Pencil extends Writing {
    public void write() {
        System.out.println("I am Pencil");
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
        Writing pen = new Pen();
        Writing pencil = new Pencil();
        k.doSomething(pen);
        k.doSomething(pencil);

    }
}

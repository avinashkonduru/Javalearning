package concept;
/**
 * Encapsulation -> Binding Data with methods
 * What?
 * Object knows something -- Variables
 * Object Does Something -- Methods
 * The variable data can be changed/fetched only through methods
 * Anything to do with variables, we need to do with methods
 * Getters and Setters
 * To set the value, we need to use Setters
 * To get the value, we need to use getters
 *
 * Why?
 * Data needs tobe safe
 * Fetching the value through methods , we can maintain log file, which user is accessing variables
 * we need to declare variables as private, we need define getters and setters
 */
class Student{
    public int getRollN0() {
        return rollN0;
    }

    public void setRollN0(int rollN0) {
        this.rollN0 = rollN0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   private int rollN0;
    private String name;

}

public class EncapsulationDemo {

    public static void main(String[] args) {
        Student student = new Student();
        student.setRollN0(5);
        student.setName("Avinash Reddy Konduru");
        System.out.println(student.getRollN0()+" "+student.getName());

    }
}

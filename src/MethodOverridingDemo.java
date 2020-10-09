class Animal{

    public  void show(){
        System.out.println("in Animal");
    }

}
class Dog extends Animal{
    @Override
    public void show(){
        //super().show();//super statement should be first sstatement in constructor body
        System.out.println("in Dog");
    }
}
public class MethodOverridingDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.show();
    }
}
